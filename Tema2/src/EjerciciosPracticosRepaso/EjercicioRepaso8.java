package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		Boolean c1 = null;
		Boolean c2 = null;
		sc.close();
		do {
			
			System.out.println("Introduce un texto");
			texto = sc.nextLine().toLowerCase();
			c1 = !texto.startsWith("hola");
			c2 = !texto.endsWith("hastaluego");
			
		}
		while (c1 || c2);
		
		Integer textoc1 = texto.indexOf("hola")+4;
		Integer textoc2 = texto.lastIndexOf("hastaluego");
		String textoMedio = texto.substring(textoc1,textoc2);
		System.out.println("Entendido. Mensaje: " + textoMedio);
		
		

	}

}
