package Ejercicios_orientacionAObjetos;

public class Alumno {
	private String dni;
	private String nombre;
	private Integer edad;
	private Integer nota;
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	

}
