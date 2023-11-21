package Repaso;

import java.util.Scanner;

public class EjercicioRepasoo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numeros positivo");
		Integer num = 0;
		Integer contador = 0;

		do {
			num = sc.nextInt();
			if(num >= 0) {
				contador++;
			}		

		} while (num >= 0);
		
		for(Integer i = 0; i <= contador; i++) {
			System.out.print("* ");
		}

	}

}
