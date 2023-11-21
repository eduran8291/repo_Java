package EjerciciosRepasoArray;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que nota estas buscando?");
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer num = sc.nextInt();
		Integer posicion = 0;
		Boolean encontrado = false;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == num) {
				encontrado = true;
				posicion = i;
				
				System.out.println("Numero encontrado y esta en la posicion " + posicion);
			}
		}
		if(encontrado == false) {
			System.out.println("El numero no existe");
		}else {
		}
		sc.close();
	}

}
