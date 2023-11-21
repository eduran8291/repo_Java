package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numeros del 1 al 20");
		Integer num;
		sc.close();
		
		for (num = 1;num <= 20;num++) {
			
			
			if (num == 20){
				System.out.print(num);
			}
			else {
				System.out.print(num + "_");
			}
			
		}
		

	}

}
