package boolean1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num1;
		Integer num2;

		do {
			System.out.println("Introduzca numero 1");
			num1 = sc.nextInt();
			System.out.println("Introduzca numero 2");
			num2 = sc.nextInt();
		}

		while (num1 != num2);

		System.out.println("Un saludo");

		sc.close();
	}

}
