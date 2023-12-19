package metodos;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		pedirTexto(scanner, "nombre");
		pedirTexto(scanner, "apellidos");
		pedirTexto(scanner, "ciudad");
		scanner.close();

	}

	public static void pedirTexto(Scanner blas, String mensaje) {
		System.out.println("Dame " + mensaje + ":");
		String palabra = blas.nextLine();
	}

}
