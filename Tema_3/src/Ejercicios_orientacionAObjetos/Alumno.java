package Ejercicios_orientacionAObjetos;

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
		this.dni = dni;
	}
	
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	

}
