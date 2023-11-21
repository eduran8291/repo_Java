package EjerciciosArray;

import java.util.Scanner;

public class EjercicioArray4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer tamaño = sc.nextInt();

		Integer[] numeros = new Integer[tamaño];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el número " + (i+1));
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Estos son los números que me has dicho:");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		sc.close();



	}
}