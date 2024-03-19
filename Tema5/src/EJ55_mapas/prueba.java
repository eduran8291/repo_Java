package EJ55_mapas;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class prueba {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		Map<String, String> mapa = new HashMap<String, String>();
		// añadir cosas
		mapa.put("bigotitos", "gato feo");
		mapa.put("pelusilla", "gata arisca");
		mapa.put("wasabi", "gato extraño");
		
		System.out.println(mapa);
		
		String definicion = mapa.get("pelusilla");
		System.out.println(definicion);
		System.out.println(mapa.get("wasabi"));
		
		System.out.println(mapa.get("blas"));
		
		Set<String>keys = mapa.keySet();
		for (String key : keys) {
			System.out.println(key);
			System.out.println("-->" + mapa.get(key));
			
		}
		for (String value : mapa.values()) {
			System.out.println(value);
			
		}
		for (Entry<String, String> dupla : mapa.entrySet()) {
			System.out.println(dupla.getKey());
			System.out.println(dupla.getValue());
		}
		//atajo
		
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				
			}
		for(Iterator<String>iterator = mapa.keySet().iterator();iterator.hasNext();) {
			String key = (String) iterator.next();
			
		}
		
		}
	}


