package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prueba {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("vete");
		lista.add("quedate");
		System.out.println(lista);
		lista.add(1, "uno");
		System.out.println(lista);

		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String palabra = (String) it.next();
			if (palabra.contains("e")) {
				it.remove();

			}

		}

	}
}
