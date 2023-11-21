package EjerciciosRepasoArray;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu telegrama");
		String telegrama = sc.nextLine();
		String[] telegram = telegrama.split(" ");
		Integer contador = 0;
		Double precio = 0.24;
		
		for (int i = 0; i < telegram.length; i++) {
			if(!telegram[i].equalsIgnoreCase("STOP")) {
				contador++;
				
			}
		}
		System.out.println("El precio es de " + " " + (precio * contador));
		sc.close();
	}

}
