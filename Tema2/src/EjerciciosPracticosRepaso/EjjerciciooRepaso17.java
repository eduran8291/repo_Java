package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = 0;
		Integer aux;
		Integer x = 0;
		Integer y = 1;
		Integer contador;
		do {
			System.out.println("Dame un numero");
			n = sc.nextInt();
		} while (!(n >= 2));

		for (contador = 1; contador <= n; contador++) {
			if (contador == 0) {
				System.out.println(x);
			}
			System.out.println(y);
			aux = x;
			x = y;
			y = aux + y;
			sc.close();
		}
		
	}

}
