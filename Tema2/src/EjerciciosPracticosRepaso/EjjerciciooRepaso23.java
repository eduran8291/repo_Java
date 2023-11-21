package EjerciciosPracticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class EjjerciciooRepaso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer cantidad;
		do {
			System.out.println("¿Cuántas veces tiro el dado?");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		Integer cant1 = 0;
		Integer cant2 = 0;
		Integer cant3 = 0;
		Integer cant4 = 0;
		Integer cant5 = 0;
		Integer cant6 = 0;
		
		Random random = new Random();
		for (int i = 1; i <= cantidad; i++) {
			Integer tirada = random.nextInt(1, 7);
			switch (tirada) {
			case 1: cant1++;
				break;
			case 2: cant2++;
				break;
			case 3: cant3++;
				break;
			case 4: cant4++;
				break;
			case 5: cant5++;
				break;
			case 6: cant6++;
				break;
			}
		}
		System.out.println("Resultados de las tiradas:");
		System.out.println("El 1 ha salido: " + cant1 + " veces" );
		System.out.println("El 2 ha salido: " + cant2 + " veces" );
		System.out.println("El 3 ha salido: " + cant3 + " veces" );
		System.out.println("El 4 ha salido: " + cant4 + " veces" );
		System.out.println("El 5 ha salido: " + cant5 + " veces" );
		System.out.println("El 6 ha salido: " + cant6 + " veces" );
		
		
		sc.close();

			
		}

	}


