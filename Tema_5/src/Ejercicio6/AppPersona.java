package Ejercicio6;

import java.util.Scanner;

public class AppPersona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona person = new Persona();
		try {
			System.out.println("Dime tu altura");
			person.setAltura(sc.nextBigDecimal());
		} catch (ParametroIncorrectoException e) {

			System.err.println(e.getMessage());
		}
		sc.nextLine();
		try {
			System.out.println("Dime tu genero");
			person.setGenero(sc.nextLine());
		} catch (ParametroIncorrectoException e) {

			System.err.println(e.getMessage());
		}
		sc.close();

	}

}
