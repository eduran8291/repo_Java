package Repaso;

import java.util.Scanner;

public class EjercicioBasicoo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer edad = 0;
		Integer edadTotal = 0;
		Integer contador = 0;
		sc.close();
		do {
			System.out.println("Introduce un nuemro");
			edad = sc.nextInt();
			edadTotal = edadTotal + edad;
			if(edad != 0) {
			contador++;}
		}while(edad != 0);
		System.out.println(edadTotal/contador);
	}

}
