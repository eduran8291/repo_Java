package Ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private Integer añoEstreno;
	private String titulo;
	private List<Actor> listaActores;
	private Guionista guionista;
	private Director director;
	
	public Pelicula() {
		listaActores = new ArrayList<>();
	}

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer año_estreno) {
		this.añoEstreno = año_estreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirectores(Director directores) {
		this.director = directores;
	}

}
