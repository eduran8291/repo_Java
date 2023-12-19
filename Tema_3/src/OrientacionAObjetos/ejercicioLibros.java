package OrientacionAObjetos;

public class ejercicioLibros {

	public static void main(String[] args) {
		Libro x = new Libro();
	    
		x.setTitulo("El valle de los lobos");
		x.setEditorial("anaya");
		x.setNumPagina(271);
		x.setAutor("Laura Gallego Garcia");
		
		System.out.println(x.getTitulo());
		System.out.println(x.getEditorial());
		System.out.println(x.getAutor());
		System.out.println(x.getNumPagina());
	}

}
