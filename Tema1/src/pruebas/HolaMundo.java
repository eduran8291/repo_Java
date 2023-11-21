package pruebas;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// Este es mi primer programa
		
	    String variable;
		variable = "Hola como estas?";
		
		Integer numero = 2023;
		
		Integer numero2;
		numero2 = 999;
		
		Integer suma;
		suma = numero + numero2;
		//variable de un numero entero
		
		String cadena;
		cadena = "Muy bien";
		
		Integer división;
		división = numero / numero2;
		
		// 1. pedirle el nombre(escribimos el mensaje)
		System.out.println("Hola! Me dices cual es tu nombre?");
		
		// 2. leer el nombre que el usuario escribe
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		// 3. escribimos mensaje de saludo con ese nombre
		System.out.println("Encantado de conocerte," + " " + nombre);
		
		
		System.out.println(variable);
		
		System.out.println(2023);
		
		System.out.println(suma);
		
		System.out.println(variable + " " + cadena);
		
		System.out.println(división);
		
		scanner.close();

	}

}
