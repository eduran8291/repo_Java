package boolean1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un número");
		Integer peticion = sc.nextInt();
		
		for(Integer num = 1;num <= peticion;num++) {
			for(Integer num2 = 1;num2 <= peticion;num2++) {
				System.out.print(num2 + " ");
			}
			System.out.println();
			sc.close();
		}

	}

}
