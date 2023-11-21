package Repaso;

import java.util.Scanner;

public class EjercicioRepasoo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		Integer num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
		System.out.println("El mayor numero es:" + " " + num1);
		}
		if(num2 > num1 && num2 > num3) {
			System.out.println("El mayor numero es:" + " " + num2);
		}
		if(num3 > num1 && num3 > num2) {
			System.out.println("El mayor numero es:" + " " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
		System.out.println("El menor numero es:" + " " + num1);
		}
		if(num2 < num1 && num2 < num3) {
		System.out.println("El menor numero es:" + " " + num2 );
		}
		if(num3 < num1 && num3 < num2) {
		System.out.println("El menor numero es:" + " " + num3);
		}
		System.out.println();
		
		
		
		
		
		
		

	}

}
