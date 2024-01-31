package Ejercicio43;

public abstract class ClasePadre {
	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;
	
	public abstract Integer getSueldo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "ClasePadre [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", nacionalidad=" + nacionalidad
				+ "]";
	}

}
