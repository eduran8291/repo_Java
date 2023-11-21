package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer peticion;
		Integer suma = 0;
		do {
			System.out.println("Introduce un numero mayor a cero");
			peticion = sc.nextInt();
		} while (peticion <= 0);

		for (Integer i = 1; i <= peticion; i++) {
			if(i%2 == 1) {
				suma = suma + i;
			}

		}
		System.out.println(suma);
		sc.close();
	}

}
