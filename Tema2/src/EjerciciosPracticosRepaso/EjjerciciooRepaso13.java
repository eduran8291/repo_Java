package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String acumulador = "";
		String texto;
		do {
			System.out.println("Dime una frase");
			texto = sc.nextLine();
			acumulador = texto + " " + acumulador;
		}
		while(!(texto.equalsIgnoreCase("fin")));
		 System.out.println(acumulador);
		sc.close();
			
		
		
	}
}
