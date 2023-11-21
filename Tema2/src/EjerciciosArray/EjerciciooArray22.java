package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una palabra");
		String palabra = sc.nextLine();
		String[] deletrear = palabra.split("");
		for (String deletreada : deletrear) {
			System.out.println(deletreada);
		}
		sc.close();

	}

}
