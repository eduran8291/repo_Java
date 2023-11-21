package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer cuentaA = 0;
		Integer cuentaP = 1;
		System.out.println("introduce una frase");
		String frase = sc.nextLine().toLowerCase();
		String[] array = frase.split("");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("a")) {
				cuentaA++;
			} else if (array[i].equals(" ")) {
				cuentaP++;

			}
		}
		System.out.println("La letra A se repite" + " " + cuentaA + " " + "veces"+ " " + "con un total de" + " " + cuentaP + " " + "palabras");
		sc.close();
	}

}
