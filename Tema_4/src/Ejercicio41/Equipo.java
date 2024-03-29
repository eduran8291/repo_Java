package Ejercicio41;

import java.util.List;
import java.util.Objects;

public class Equipo {
	private String nombre;
	private Jugador capitan;
	private List<Jugador>listaDeJugador;
	private static String competicion;
	
	

	public static String getCompeticion() {
		return competicion;
	}

	public static void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador getCapitan() {
		return capitan;
	}
	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}
	public List<Jugador> getListaDeJugador() {
		return listaDeJugador;
	}
	public void setListaDeJugador(List<Jugador> listaDeJugador) {
		this.listaDeJugador = listaDeJugador;
		
		
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(capitan, other.capitan) && Objects.equals(listaDeJugador, other.listaDeJugador)
				&& Objects.equals(nombre, other.nombre);
		
		
	}

	@Override
	public String toString() {
		return nombre + "-" + capitan + "-" + "jugadores" + " " + listaDeJugador;
	}
	
	
}
