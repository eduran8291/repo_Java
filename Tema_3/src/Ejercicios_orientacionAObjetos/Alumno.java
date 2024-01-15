package Ejercicios_orientacionAObjetos;

import java.util.Objects;

public class Alumno extends Persona{

	private String dni;
	private Integer nota;
    private Curso curso;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Alumno(String dni) {
		this.dni = dni;
	}
	public void aprobar() {
		if(nota < 5) {
		this.nota = 5;
		}
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}
	
	public Integer getNota() {
		return nota;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}
	public void setNota(Integer nota) {
		this.nota = nota;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	

}
