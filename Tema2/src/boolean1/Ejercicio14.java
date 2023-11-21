package boolean1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un numero");
		Integer num = sc.nextInt();        
		Integer contador = 0;
		
		while (contador <= 10) {
			System.out.println(num + " x "+ contador + " = " + contador*num);
			contador++;
			
			sc.close();
		}
		
	}

}
