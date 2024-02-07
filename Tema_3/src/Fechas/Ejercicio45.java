package Fechas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fechaString;
		do {
			System.out.println("Dime tu fecha de nacimiento en formato dd/MM/yyyy");
			fechaString = sc.nextLine();
		}
		while(isFormatoIncorrecto(fechaString));
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaString, format);
		
		// Fue año bisiesto?
		if (fechaNac.isLeapYear()) {
			System.out.println("Naciste en año bisiesto!!");
		}
		else {
			System.out.println("Naciste en año normal (no bisiesto)");
		}
		
		// Día de la semana en la que nació
		System.out.println(fechaNac.getDayOfWeek().name());
		
		// Cuántos años tiene?
		Period periodo = fechaNac.until(LocalDate.now());
		System.out.println("Tienes " + periodo.getYears() + " años");
		
		// Cuánto tiempo le queda (si vivirá 100 años)
		LocalDate fechaMuerte = fechaNac.plusYears(100);
		periodo = LocalDate.now().until(fechaMuerte);
		System.out.println("Te quedan " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " días");
		
		// Qué hora es
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(formatHora.format(hora));
		
		
		sc.close();
	}

	private static boolean isFormatoIncorrecto(String fechaString) {
		String[] partes = fechaString.split("/");
		if (partes.length != 3) {
			return true;
		}
		Integer dia = Integer.parseInt(partes[0]);
		Integer mes = Integer.parseInt(partes[1]);
		Integer año = Integer.parseInt(partes[2]);
		
		return (dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 1900 || año > 2024);

			
	}

}
