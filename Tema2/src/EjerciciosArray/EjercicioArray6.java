package EjerciciosArray;

import java.util.Scanner;

public class EjercicioArray6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] listaPalabras = new String[3];
		for (int i = 0; i < listaPalabras.length; i++) {
			System.out.println("Dame la palabra " + (i+1));
			String palabra = sc.nextLine();
			listaPalabras[i] = palabra;
		}
		
		String suma = "";
		for (int i = 0; i < listaPalabras.length; i++) {
			suma = suma + listaPalabras[i];
		}
		System.out.println("Todas las palabras: " + suma);
		
		
		sc.close();

	}

}
