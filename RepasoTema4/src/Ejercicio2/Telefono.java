package Ejercicio2;

public abstract class Telefono {
	private Integer numero;
	private Boolean enLlamada;
	
	public Telefono(Integer numero) {
		this.numero = numero;
		this.enLlamada = false;
	}
	public Integer consultarNumero() {
		return numero;
	}
	public void marcar(Integer numeroDestino) {
		System.out.println("Llamando a " + numeroDestino);
		if(numeroDestino.equals(numero)) {
			System.out.println("COMUNICANDO");
		}else {
			System.out.println("EN COMUNICACION");
			enLlamada = true;
		}
	
		
	}
	public void colgar() {
		if(enLlamada) {
			System.out.println("COMUNICACION TERMINADA");
			enLlamada = false;
		}
	}
}
	
