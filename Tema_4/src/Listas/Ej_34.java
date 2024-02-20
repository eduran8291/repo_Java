package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej_34 {

	public static void main(String[] args) {
		List<String>lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 5; i++) {
			System.out.println("Dame la palabra" + i);
			lista.add(sc.nextLine());
			
		}
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
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


