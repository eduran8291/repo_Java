package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = sc.nextLine();
		Integer x;
		String letra;
		
		for (x = palabra.length();x > 0;x--) {
			letra = palabra.substring(x - 1, x);
			System.out.print(letra);
			
		sc.close();

	}

	}
}
