package OrientacionAObjetos;

public class Gato {
	private String nombre;	
	private String raza;
	private Integer edad;
	
	public Gato() {
		raza = "desconocida";
		edad = 0;
		nombre = "anonimo";
	}
	public Gato(String nombre) {
		raza = "desconocida";
		edad = 0;
		this.nombre = nombre;
	}
	public Gato(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	}


