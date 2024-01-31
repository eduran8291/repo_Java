package Ejercicio43;

public class AppEjercicio {

	public static void main(String[] args) {
		Actor actores1 = new Actor();
		Actor actores2 = new Actor();
		Actor actores3 = new Actor();
		Actor actores4 = new Actor();

		actores1.setNombre("Blas Blau");
		actores1.setNacionalidad("España");
		actores1.setAñoNacimiento(1983);

		actores2.setNombre("Laura Pozo");
		actores2.setNacionalidad("Italia");
		actores2.setAñoNacimiento(1981);

		actores3.setNombre("Marcel Cade");
		actores3.setNacionalidad("Suiza");
		actores3.setAñoNacimiento(2001);

		actores4.setNombre("Violeta Volo");
		actores4.setNacionalidad("Rusia");
		actores4.setAñoNacimiento(1999);

		Director director = new Director();
		director.setNombre("Sara Marea");
		director.setNacionalidad("Portugal");
		director.setAñoNacimiento(1994);

		Guionista guionista1 = new Guionista();
		Guionista guionista2 = new Guionista();

		guionista1.setNombre("Marco Smith");
		guionista1.setNacionalidad("Reino Unido");
		guionista1.setAñoNacimiento(1998);

		guionista2.setNombre("Cheng Shu");
		guionista2.setNacionalidad("China");
		guionista2.setAñoNacimiento(1997);

		Pelicula peli = new Pelicula();
		peli.setAñoEstreno(2027);
		peli.setDirectores(director);
		peli.setGuionista(guionista1);
		peli.getListaActores().add(actores1);
		peli.getListaActores().add(actores2);
		peli.setTitulo("Do you know Joe Blas?");

		Pelicula peli2 = new Pelicula();
		peli2.setAñoEstreno(2027);
		peli2.setDirectores(director);
		peli2.setGuionista(guionista2);
		peli2.getListaActores().add(actores1);
		peli2.getListaActores().add(actores2);
		peli2.getListaActores().add(actores3);
		peli2.getListaActores().add(actores4);
		peli2.setTitulo("Muerte en la sombra");

		System.out.println(peli.getListaActores());
		System.out.println(peli.getGuionista().getSueldo());

		peli2.getListaActores().remove(actores3);
		peli.getListaActores().add(actores3);
		System.out.println(peli.getListaActores());
		System.out.println(peli2.getListaActores());
		
		

	}

}
