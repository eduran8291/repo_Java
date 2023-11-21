package pruebas;

import java.util.Scanner;

public class Elercicio3 {

	public static void main(String[] args) {
		//mostrar un mensaje pidiendo la edad del usuario
		System.out.println("Que edad tienes?");
		
		//esperar a que el usuario escriba su edad y almacenarla en una variable
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		
		//mostrar nuevo mensaje indicando "su edad es de ( ) años"
		System.out.println("Su edad es de" + " " + numero + " " + "años");
		
		scanner.close();

	}

}
