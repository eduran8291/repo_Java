package pruebas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// pedir el nombre al usuario
		System.out.println("Hola, cual es tu nombre?");
		
		// leer el nombre de usuario usando scanner
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		// pedimos el apellido del usuario
	    System.out.println("Y cual es tu apellido?");
	    String apellido = scanner.nextLine();
	    
	    // escribir el nombre de usuario
	    System.out.println("Mi nombre es" + " " + nombre);
	    
	    // escribir el apellido del usuario
	    System.out.println("Y mi apellido es" + " " + apellido );
	    
	    //nombre completo del usuario
	    System.out.println("Mi nombre completo es" + " " + nombre + " " + apellido);
	    
	    
	    
	    scanner.close();
	    

	}

}
