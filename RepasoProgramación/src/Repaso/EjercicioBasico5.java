package Repaso;

import java.util.Scanner;

public class EjercicioBasico5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer num = sc.nextInt();
		sc.close();
		if(num % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}

	}

}
