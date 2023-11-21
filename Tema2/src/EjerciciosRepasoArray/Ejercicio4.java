package EjerciciosRepasoArray;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que nota estas buscando?");
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer num = sc.nextInt();
		Integer contador = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (num < listaNotas[i]) {
				contador++;	
			}	
	}
		System.out.println("Hay" + " " + contador + " " + "notas mayores a la indicada");
		sc.close();
	}
}
