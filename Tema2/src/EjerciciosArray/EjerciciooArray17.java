package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase bonita");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		String[] letras = frase.split("");
		for (int i = 0; i < letras.length; i++) {
			if (!letras[i].equals(" ")) {
				System.out.print(letras[i]);
			}
			else {
				i++;
				System.out.print(letras[i].toUpperCase());
			}
		}
		
		
		
		sc.close();

	}

}
