package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra bonita");
		String palabra = sc.nextLine();
		String[] letras = palabra.split("");
		for (int i = letras.length-1; i >= 0; i--) {
			System.out.print(letras[i]);
		}
		
		sc.close();

	}

}
