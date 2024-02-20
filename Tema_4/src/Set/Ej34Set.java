package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ej34Set {

	public static void main(String[] args) {
		Set<String>lista = new HashSet<>();
		Set<String>lista2 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 cadenas");
		while(lista.size() < 5) {
			lista.add(sc.nextLine());
		}
		System.out.println(lista);
		
		for (String string : lista) {
			lista2.add(string.toUpperCase());
		}
		lista = lista2;
		System.out.println(lista);
		
		if(lista.contains("")) {
			System.out.println("Hay alguna palabra vacía");
		}
		Iterator<String>it = lista.iterator();
		while(it.hasNext()) {
			if(it.next().length() < 6) {
				it.remove();
			}
			System.out.println();
		}

	}

}
