package Ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {
	
	protected List<Personaje>listaPersonaje;
	
	public EquipoCombate() {
		listaPersonaje = new ArrayList<>();
	}

	public List<Personaje> getListaPersonaje() {
		return listaPersonaje;
	}

	public void setListaPersonaje(List<Personaje> listaPersonaje) {
		this.listaPersonaje = listaPersonaje;
	}

	public void addPersonaje(Personaje personaje) {
		if(listaPersonaje.size() < 5 && !listaPersonaje.contains(personaje)) {
			listaPersonaje.add(personaje);
		}else {
			System.out.println("LIMITE SUPERADO :(");
		}
	}
	
	@Override
	public String toString() {
		return "EquipoCombate [listaPersonaje=" + listaPersonaje + "]";
	}
	
	
	
	

}
