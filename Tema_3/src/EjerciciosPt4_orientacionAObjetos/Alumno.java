package EjerciciosPt4_orientacionAObjetos;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {

	protected String dni;
	protected Integer nota;
	protected Curso curso;

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
		if (nota < 5) {
			this.nota = 5;
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null) {
			this.dni = dni.toUpperCase();
		}
		this.dni = dni;
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

	public Boolean validarDni() {
		return(dni==null || dni.isEmpty() || dni.length() == 9 );
	}
	
	public Boolean validar() {
		return(validarDni() && this.curso != null && this.nombre != null && nombre.length() >= 10 && this.edad != null && edad >= 12 && edad <= 65);
	}
}
