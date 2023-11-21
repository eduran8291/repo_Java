package boolean1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1;
		String num2;

		do {
			System.out.println("Introduzca numero 1");
			num1 = sc.nextLine().trim();
			System.out.println("Introduzca numero 2");
			num2 = sc.nextLine().trim();
		}
		while(!(num1.equalsIgnoreCase(num2)));
		
		System.out.println("Gracias");
		
		sc.close();
	}

}
