package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = 0;
		Integer x = 0;
		Integer y = 1;
		do {
			System.out.println("Dame un numero");
			n = sc.nextInt();
		} while (n < 2);
		
		Integer[] numeros = new Integer[n];
		for (int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				numeros[i] = x;
				i++;
			}
				numeros[i] = y;
				y = y + x;
				x = y - x;
			
		}

		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + " ");
		}
			sc.close();
		
	}

}