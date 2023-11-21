package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame tu nombre completo");
		String nombreCompleto = sc.nextLine();
		String[] partes = nombreCompleto.split(" ");
		System.out.println("Tu nombre es: " + partes[0]);
		System.out.println("Tu primer apellido es: " + partes[1]);
		System.out.println("Tu segundo apellido es: " + partes[2]);
		sc.close();

	}
}
