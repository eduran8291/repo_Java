package Ejercicio44;

public abstract class Personaje {
	public static final Integer PUNTOS_VIDA_ASESINO = 100;
	public static final Integer PUNTOS_DAÑO_ASESINO = 10;
	public static final Integer SEG_RECUPERACION_ASESINO = 5;
	
	public static final Integer PUNTOS_VIDA_PARASITO = 200;
	public static final Integer PUNTOS_DAÑO_PARASITO = 2;
	public static final Integer SEG_RECUPERACION_PARASITO = 1; 
	
	
	protected String nombre;
	protected String codigo;
	
	
	
	public Personaje(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		
	}
	public abstract Integer getPuntosDeVida();
	
	public abstract Integer getPuntosDeDaño();
	
	public abstract Integer geSegRecuperacion();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	

}
