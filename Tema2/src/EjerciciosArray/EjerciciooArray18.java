package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero capicúo");
		String num = sc.nextLine();
		String array[]= num.split("");
		String numInv = "";
		for (int i = array.length - 1; i>= 0; i--) {
			numInv = numInv + array[i];
		}
		
		if(numInv.equals(num)) {
			System.out.println("El numero si es capicúo");
		}else {
			System.out.println("No es capicúo");
		}
		sc.close();
	}
}