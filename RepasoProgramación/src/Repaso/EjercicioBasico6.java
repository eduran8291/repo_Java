package Repaso;

import java.util.Scanner;

public class EjercicioBasico6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nuemro");
		Integer num = sc.nextInt();
		sc.close();
		
		if(num > 0) {
			System.out.println("Numero positivo");
		}else if(num < 0) {
			System.out.println("Numero negativo");
		}else{
			System.out.println("Null");
		}
	}

}
