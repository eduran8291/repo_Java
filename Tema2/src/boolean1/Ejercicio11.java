package boolean1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		String delanteEmail;
		do {
			
			System.out.println("Introduzca email");
			email = sc.nextLine();
			delanteEmail = email.substring(email.indexOf("@") + 1);
			
			if (!(email.contains("@")) 
					|| !(email.contains("."))
					|| delanteEmail.startsWith(".")
					|| delanteEmail.endsWith(".")) {
				
				System.out.println("Email incorrecto");
			}

		} while (!(email.contains("@")) || !(email.contains(".")) || delanteEmail.startsWith(".")
				|| delanteEmail.endsWith("."));

		System.out.println("tu email correcto es" + email);
		
		sc.close();

	}
}
