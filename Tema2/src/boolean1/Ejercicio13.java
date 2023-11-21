package boolean1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println("dime un texto");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		Integer x = 0;
		Integer y = 5;
		
		while(y <= texto.length()) {
			String trozo = texto.substring(x, y);
			System.out.println(trozo);
			x = x + 5;
			y = y + 5;
		}
		String ultimoTrozo = texto.substring(x);
		System.out.println(ultimoTrozo);
		
		sc.close();

		
		

	}

}
