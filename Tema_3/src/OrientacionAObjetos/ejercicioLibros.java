package OrientacionAObjetos;

import java.util.Scanner;

public class ejercicioLibros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro lib1 = new Libro();
	    
		lib1.setTitulo("El valle de los lobos");
		lib1.setEditorial("anaya");
		lib1.setNumPagina(271);
		lib1.setAutor("Laura Gallego Garcia");
		
		System.out.println(lib1.getTitulo());
		System.out.println(lib1.getEditorial());
		System.out.println(lib1.getAutor());
		System.out.println(lib1.getNumPagina() + " " + "paginas");
		
		
	}

}
