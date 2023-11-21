
package boolean1;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		Integer edad = sc.nextInt();
		
		Boolean edadEsCero = edad == 0;
		if (!edadEsCero) {
			System.out.println("No es cero");
		}
		
		if (edad >= 18) {
			System.out.println("Eres adolescente");
		}
		else {
			System.out.println("Eres mayor de edad");
			sc.close();
			
		}

	}

}
