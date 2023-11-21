package pruebas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//pedimos nombre del usuario
		System.out.println("Buenas, como te llamas?");
		
		//leer el nombre de usuario usando scanner
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		//dar la bienvenida al usuario
		System.out.println("Bienvenido" + " " + nombre);
	    
		// preguntar al usuario donde vive
		System.out.println("De donde eres?");
		String localidad = scanner.nextLine();
		
	    // preguntamos al usuario que tal se esta alli
		System.out.println("Que tal se vive en" + " " + localidad +"?");
		scanner.nextLine();
		
		// cordial saludo al usuario
		System.out.println("Gracias." + " " + "Un saludo");
		
		scanner.close();
		
		 
		


		
		
		
		
		

	}

}
