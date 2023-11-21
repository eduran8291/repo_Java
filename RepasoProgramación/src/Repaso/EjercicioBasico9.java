package Repaso;

import java.util.Scanner;

public class EjercicioBasico9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nuemero");
		Integer num = sc.nextInt();
		sc.close();
		if (num > 0) {
			if(num > 60 && num < 90) {
				System.out.println("Correcto");
			}else {
				System.out.println("ERROR");
			}
		
	}
	}
}
