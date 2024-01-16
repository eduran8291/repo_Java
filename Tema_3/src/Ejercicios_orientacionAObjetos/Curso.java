package Ejercicios_orientacionAObjetos;

public class Curso {
	
	private String identificador;
	private String descripcion;
	protected Alumno[] alumnos;
	
	
	public Curso(Integer numeroAlumnos) {
		this.alumnos = new Alumno[numeroAlumnos] ;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	
	public void addAlumnos(Alumno alumno) {
		for (Alumno y : alumnos) {
			if(y == null) {
				y = alumno;
				return;
			}
		}
		
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
	
