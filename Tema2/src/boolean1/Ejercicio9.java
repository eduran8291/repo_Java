package boolean1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre Completo");
		String textoCompleto = sc.nextLine();
		Integer primerEspacio = textoCompleto.indexOf(" ");
		Integer segundoEspacio = textoCompleto.lastIndexOf(" ");
		String nombre = textoCompleto.substring(0,primerEspacio);
		String apellido1 = textoCompleto.substring(primerEspacio + 1,segundoEspacio);
		String apellido2 = textoCompleto.substring(segundoEspacio + 2);
		System.out.println("Mi nombre es" + nombre);
		System.out.println("Mi primer apellido es" + apellido1);
		System.out.println("Mi segundo apellido es" + apellido2);
		
		sc.close();
		
		
		

	    
		

	}

}
