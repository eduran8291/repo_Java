package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("Dime una palabra de al menos 8 caracteres");
			palabra = scanner.nextLine();
		}
		while(palabra.length() < 8 );
		
		palabra = palabra.replaceAll("a", "4");
		palabra = palabra.replaceAll("e", "3");
		palabra = palabra.replaceAll("i", "1");
		palabra = palabra.replaceAll("t", "7");
		palabra = palabra.replaceAll("o", "0");
		
		System.out.println("Tu password es: " + palabra);
		
		scanner.close();

			
			
			
	}

}
