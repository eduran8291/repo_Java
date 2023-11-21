package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer fila;
		Integer columna;
		Integer peticion = sc.nextInt();

		for (fila= 1;fila <= peticion; fila++) {
			for (columna = 1; columna <= peticion; columna++) {
				if (fila == columna) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			System.out.println();
		}

	}

}
