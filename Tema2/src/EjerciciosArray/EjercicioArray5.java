package EjerciciosArray;

import java.util.Scanner;

public class EjercicioArray5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer tamaño = sc.nextInt();

		Integer[] numeros = new Integer[tamaño];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el número " + (i+1));
			numeros[i] = sc.nextInt();
		}
		
		// Recorrer el array para sumar todo y buscar el max y el min
		Integer suma = 0;
		Integer minimo = numeros[0];
		Integer maximo = numeros[0];
		Integer posMin = 0;
		Integer posMax = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
			if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMin = i;
			}
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMax = i;
			}
		}
		System.out.println("La media es " + suma/numeros.length);
		System.out.println("El máximo es " + maximo + " y está en la posición " + posMax);
		System.out.println("El mínimo es " + minimo + " y está en la posición " + posMin);
		
		System.out.println("Estos son los números que me has dicho:");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
			sc.close();
		}
		

	}

}

