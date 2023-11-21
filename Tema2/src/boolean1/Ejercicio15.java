package boolean1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un nuemro");
		Integer num = sc.nextInt();
		Integer resultado = 0;
		
		for ( Integer contador = 0;contador <= 10;contador++) {
			resultado = contador*num;
			System.out.println(num + "x" + contador + "=" + resultado);
			
			sc.close();
			
		}
	                  

	}

}
