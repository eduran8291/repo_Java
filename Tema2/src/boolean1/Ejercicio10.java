package boolean1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// pedir una palabra
		// pedir otra palabra
		// si alguna de las dos es vacia o solo espacios-->repetir

		Scanner sc = new Scanner(System.in);
		String palabra1;
		String palabra2;

		do {

			System.out.println("Dame una palabra");
			palabra1 = sc.nextLine();

			System.out.println("Dame otra palabra");
			palabra2 = sc.nextLine();

		}

		while (palabra1.isBlank() || palabra2.isBlank());

		Integer x = palabra1.compareTo(palabra2);

		if (x > 0) {
			System.out.println(palabra2 + "," + palabra1);
		}

		else {
			System.out.println(palabra1 + "," + palabra2);

		}
		sc.close();
	}

}
