package EJ57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> mapa = new HashMap<>();
		String palabra;
		do {
			System.out.println("Dime palabra");
			palabra = sc.nextLine();
			if (!palabra.equalsIgnoreCase("fin")) {
				String letra = palabra.split("")[0].toUpperCase();
				List<String> palabras = mapa.get(letra);
				if (palabras == null) {
					palabras = new ArrayList<String>();
					mapa.put(letra, palabras);
				}
				palabras.add(palabra);
			}
		} while (!palabra.equalsIgnoreCase("fin"));
		
		String letra;
		do {
			System.out.println("Dime letra");
			letra = sc.nextLine().toUpperCase();
			if (!letra.equalsIgnoreCase("fin")) {
				if (mapa.containsKey(letra)) {
					List<String> palabras = mapa.get(letra);
					System.out.println("Hay " + palabras.size() + " palabras que empiezan por la letra " + letra + ":");
					for (String p : palabras) {
						System.out.println("\t> " + p);
					}
				}
				else {
					System.out.println("No hay palabras que empiezan por la letra " + letra);
				}
			}
		} while (!letra.equalsIgnoreCase("fin"));
		
		
		
		sc.close();

	}

}
