package EjerciciosArray;

import java.util.Scanner;

public class EjercicioArray8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números me vas a decir?");
		Integer tamaño = sc.nextInt();

		Integer[] numeros = new Integer[tamaño];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el número " + (i + 1));
			numeros[i] = sc.nextInt();
		}

		Integer k = numeros.length - 1;
		for (int i = 0; i < (numeros.length -1)/2; i++) {
			Integer aux = numeros[i];
			numeros[i] = numeros[k];
			numeros[k] = aux;			
			k--;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();		
		
	}

}
