package colaCadenas;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {



			private List<String> lista;
	
			public ColaCadenas() {
				lista = new ArrayList<String>();
			}
			
			public void añadirCadena(String cadena) {
				lista.add(cadena);
			}
			
			public String sacarCadena() {
				if (lista.isEmpty()) {
					return null;
				}
				String resultado = lista.get(0);
				lista.remove(0);
				return resultado;
				// también se podría así:
				// return lista.remove(0);
			}
			
			public Integer getTamaño() {
				return lista.size();
			}

			@Override
			public String toString() {
				return lista.toString();

			
	}
	

}
