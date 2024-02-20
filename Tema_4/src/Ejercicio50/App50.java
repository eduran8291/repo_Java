package Ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App50 {

	public static void main(String[] args) {
		Set<Pais>paises = new HashSet<>();
		
		Pais paisEspaña = new Pais("Es/", "España");
		Pais paisIslasCook = new Pais("CK", "Islas Cook");
		Pais paisIslasCaiman = new Pais("CK", "Islas Caiman");
		
		paises.add(paisEspaña);
		paises.add(paisIslasCook);
		paises.add(paisIslasCaiman);
		
		System.out.println(paises);
		
		Pais francia = new Pais("FR", "Francia");
		System.out.println(francia);
		
		Iterator<Pais>it = paises.iterator();
		while(it.hasNext()) {
			Pais pais = (Pais) it.next();
			if(!pais.getCodigo().equals("ES")) {
				it.remove();
			}
		}
	}

}
