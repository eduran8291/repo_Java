package EjerciciosPt4_orientacionAObjetos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String identificador;
	private String descripcion;
	protected List<Alumno> alumnos;
	
	
	public Curso() {
		this.alumnos = new ArrayList<>();
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public void addAlumnos(Alumno alumno) {
		alumnos.add(alumno);		
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}




}
	
