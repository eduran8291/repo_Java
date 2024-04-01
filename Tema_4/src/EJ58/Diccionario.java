package EJ58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	public class Diccionario {
		private Map<String, List<String>> mapa;
		
		public Diccionario() {
			mapa = new HashMap<>();
		}

		public void cargarDiccionario(List<String> palabras) {
			for (String palabra : palabras) {
				String letra = palabra.split("")[0].toUpperCase();
				List<String> lista = mapa.get(letra);
				if (lista == null) {
					lista = new ArrayList<String>();
					mapa.put(letra, lista);
				}
				lista.add(palabra);
			}
		}
		public void borrarDiccionario() {
			mapa.clear();
		}
		public void imprimirPalabras(String letra) {
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

}
