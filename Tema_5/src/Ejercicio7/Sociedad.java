package Ejercicio7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import Ejercicio6.ParametroIncorrectoException;
import Ejercicio6.Persona;

public class Sociedad {
	private List<Persona> people = new ArrayList<>();
	
	
	
	public Sociedad(List<Persona> people) {
		this.people = people;
	}



	public void addPersona(String genero, BigDecimal altura) {
		Persona person = new Persona();
		try {
			person.setAltura(altura);
			person.setGenero(genero);
		} catch (ParametroIncorrectoException e) {
			
			e.printStackTrace();
		}
		people.add(person);
		
	}
}
