package EjerciciosArray;

import java.util.Random;
import java.util.Scanner;

public class EjerciciooArray20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Elegimos palabra al azar
		String[] palabras = new String[] { "terremoto", "culinario", "azulejo", "tenedor", "saltamontes", "carretilla",
				"molinero", "sofisticado", "teclado", "primavera" };
		Random random = new Random();
		Integer aleatorio = random.nextInt(0, 11);
		String palabra = palabras[aleatorio];
		
		String[] solucion = palabra.split("");
		String[] tablero = new String[palabra.length()];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = "_";
		}
		tablero[0] = solucion[0];
		
		Integer vidas = 10;
		Boolean iguales = false;
		do {
			// 1. Imprimir el tablero
			for (String letra : tablero) {
				System.out.print(letra + " ");
			}
			System.out.println();
			
			// 2. Pedir una letra
			System.out.println("Intenta una letra...");
			String letra = scanner.nextLine();
			
			// 3. Buscamos si la letra está en la palabra (solucion)
			Boolean encontrado = false;
			for (int i = 1; i < solucion.length; i++) {
				if (solucion[i].equals(letra) && tablero[i].equals("_")) {
					encontrado = true;
					tablero[i] = letra;
				}
			}
			
			if (encontrado) { // la letra estaba en la palabra
				iguales = true;
				for (int i = 0; i < tablero.length; i++) {
					if (!solucion[i].equals(tablero[i])) {
						iguales = false;
						break;
					}
				}
				if (iguales) {
					System.out.println("Felicidades!! Has terminado");
				}
			}
			else { // la letra no estaba 
				vidas--;
				System.out.println("La letra indicada no está en la palabra");
				System.out.println("Te quedan " + vidas + " vidas");
			}
		}
		while( vidas > 0 && !iguales );
		
		
		scanner.close();

	}

}
