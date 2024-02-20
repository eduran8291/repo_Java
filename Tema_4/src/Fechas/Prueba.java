package Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Prueba {

	public static void main(String[] args) {
		LocalDate fechaHoy = LocalDate.now();
		System.out.println(fechaHoy);
		
		LocalDate fechaOtra = LocalDate.of(2021, 10, 3);
		System.out.println(fechaOtra);
		
		fechaOtra = fechaOtra.withYear(2023);
		Integer dia = fechaHoy.getDayOfWeek().getValue();
		System.out.println(dia);
		System.out.println(fechaHoy.isLeapYear());
		System.out.println(fechaHoy.lengthOfMonth());
		
		LocalDate nuevaFecha = fechaHoy.plusWeeks(1);
		System.out.println(nuevaFecha);
		
		Integer diaSemana = fechaHoy.getDayOfWeek().getValue();
		System.out.println(diaSemana);
		
		Period periodo = fechaOtra.until(fechaHoy);
		System.out.println(periodo.getDays());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String cadena = fechaHoy.format(formato);
		System.out.println(cadena);
		
		String fechaCadena = "13-04-2022";
		LocalDate fechaNew = LocalDate.parse(fechaCadena, formato);
		System.out.println(fechaNew);
		

	}

}
