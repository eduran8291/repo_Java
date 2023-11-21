package EjerciciosArray;

import java.util.Scanner;

public class EjercicioArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer [] listaNumeros = new Integer[6];
		Integer cuadrado = sc.nextInt();
		Integer posicion = 0;
		for(Integer num = cuadrado;num <= cuadrado + 5;num++) {
			
			listaNumeros[posicion] = num*num;
				posicion++;	
			
		}
		
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println(listaNumeros[i]);
			
		}
		sc.close();
	}

}
