package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Me puedes decir tu nombre?");
		String nombre = sc.nextLine();
		System.out.println("¿En que año naciste?");
		Integer numero = sc.nextInt();
		Integer edad = 2030 - numero;
		System.out.println("hola, mi nombre es" + " " + nombre + "y en 2030 tendré" + " " + edad);
		sc.close();

	}

}
