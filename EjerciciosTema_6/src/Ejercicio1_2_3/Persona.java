package Ejercicio1_2_3;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	private String dni;
		+ fechaNacimiento();


	public void validar() throws DatosIncompletosException {
		if (dni == null || dni.isBlank()) {
			throw new DatosIncompletosException("El DNI no puede ser vacío");
		}
		if (nombre == null || nombre.isBlank()) {
			throw new DatosIncompletosException("El nombre no puede ser vacío");
		}
		if (apellido == null || apellido.isBlank()) {
			throw new DatosIncompletosException("Los apellidos no pueden ser vacíos");
		}
		if (fechaNacimiento == null) {
			throw new DatosIncompletosException("La fecha de nacimiento no puede ser vacía");
		}
		if (dni.length() > 50 || nombre.length() > 50 || apellido.length() > 100) {
			throw new DatosIncompletosException("Los valores indicados superan el tamaño máximo");
		}

	}

}

}
