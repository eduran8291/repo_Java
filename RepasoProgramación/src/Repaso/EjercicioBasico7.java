package Repaso;

import java.util.Scanner;

public class EjercicioBasico7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer num = sc.nextInt();
		sc.close();
		if(num >= 51 && num <= 100) {
		System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
	}

}
