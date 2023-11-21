package pruebas;

import java.util.Scanner;

public class Ejercicio4 {
	
	public final static Integer AÑO_ACTUAL = 2023;

	public static void main(String[] args) {
		//mostrar un mensaje pidiendo el año de nacimiento del usuario
		System.out.println("En que año naciste?");
		
		//esperar a que el usuario conteste
		Scanner scanner = new Scanner(System.in);
		Integer añonacimiento = scanner.nextInt();
		Integer edad = 2023 - añonacimiento;
		
		//mostrar un nuevo mensaje indicando la edad del usuario calculada restando el año actual al año indicado por el usuario
		System.out.println("Mi edad es de" + " " + edad + "años");
		
		scanner.close();
	}

}
