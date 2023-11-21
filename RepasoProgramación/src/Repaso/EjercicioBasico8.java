package Repaso;

import java.util.Scanner;

public class EjercicioBasico8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer num = sc.nextInt();
		sc.close();
		if(num < 0) {
			System.out.println("Numero negativo");
		}
		else if(num > 100) {
			System.out.println("Numero superior a 100");
		}else {
			System.out.println("Ni es mayor que 100 ni es negativo");
		}
	}
}
