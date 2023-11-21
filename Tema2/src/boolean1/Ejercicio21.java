package boolean1;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime un numero");
		Integer peticion = sc.nextInt();
		Integer num;
		sc.close();
		
		for (num = 1;num <= peticion;num++) {
			
		
		//imprime una fila completa correcta
		
		   for(Integer num2 = 1;num2 <= num;num2++) {
			
		   System.out.print(num2 + " ");
		   }
		   System.out.println();
		}


	}

}
