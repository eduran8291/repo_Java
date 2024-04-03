package Ejercicios_1y2;

import java.util.Scanner;

import Ejercicio3.SacoNumeros;

public class Ej1y2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SacoNumeros sacote = new SacoNumeros();
		Integer num = 0;

		// ALTERNATIVA
		// try(Scanner sc = new Scanner(System.in)){

		try {
			do {
				System.out.println("Dame un numerin");
				try {
					num = sc.nextInt();
					if (num != -1) {
						sacote.addNumero(num);
						;
					}

				} catch (Exception e) {
					sc.nextLine();
				}

			} while (num != -1);

		} finally {

		}
		System.out.println(sacote.toString());

		try {
			do {
				try {
					System.out.println("¿Que numerin quieres ver?");
					num = sc.nextInt();
					System.out.println(sacote.getNumero(num));
				} catch (Exception e) {
					if(num != -1) {
					System.out.println("Esa posicion no existe tonto");
					}
				}
			} while (num != -1);

		} finally {
			sc.close();
		}
	}
}