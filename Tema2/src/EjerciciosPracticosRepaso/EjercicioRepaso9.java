package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		Boolean c1 = null;
		Boolean c2 = null;
		
		do {
			
			System.out.println("Introduce un texto");
			texto = sc.nextLine().toLowerCase();
			c1 = !texto.startsWith("hola");
			c2 = !texto.endsWith("adios");
			if (!c1 && texto.endsWith("hastaluego")){
				Integer textoc1 = texto.indexOf("hola")+4;
			Integer textoc2 = texto.lastIndexOf("hastaluego");
			String textoMedio = texto.substring(textoc1,textoc2);
			System.out.println("Entendido. Mensaje: " + textoMedio);
		}
			
			
		}
		while (c1 || c2);
		
		Integer textoc1 = texto.indexOf("hola")+4;
		Integer textoc2 = texto.lastIndexOf("adios");
		String textoMedio = texto.substring(textoc1,textoc2);
		System.out.println("Entendido. Mensaje: " + textoMedio);
		
		

	}

}
