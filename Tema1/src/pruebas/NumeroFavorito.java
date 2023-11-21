package pruebas;

import java.util.Scanner;

public class NumeroFavorito {

	public static void main(String[] args) {
		// pedir el numero al usuario
		System.out.println("Hola, cual es tu numero favorito?");
		
		// leer el numero usando scanner
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		
		// escribir el numero
		System.out.println("Tu numero favorito es " + numero);
		
		// escribir cual es el numero al cuadrado
		Integer cuadrado = numero * numero;
		System.out.println("El cuadrado de tu numero es " + cuadrado);
		
		scanner.close();

	}

}

