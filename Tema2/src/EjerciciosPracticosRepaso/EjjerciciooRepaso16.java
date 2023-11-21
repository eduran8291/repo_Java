package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = sc.nextLine();
		Integer x;
		String letra;
		
		for (x = 0;x < palabra.length();x++) {
			letra = palabra.substring(x, x+1);
			System.out.println(letra);
			
			sc.close();
		}
						
		
			
		}

	}


