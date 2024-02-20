package Ejercicio44;

public class Asesino extends Personaje {

	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);

	}

	@Override
	public Integer getPuntosDeVida() {
		
		return PUNTOS_VIDA_ASESINO;
	}

	@Override
	public Integer getPuntosDeDaño() {
		return PUNTOS_DAÑO_ASESINO;
	}

	@Override
	public Integer geSegRecuperacion() {
		
		return SEG_RECUPERACION_ASESINO;
	}

	@Override
	public String toString() {
		return "Asesino [getPuntosDeVida()=" + getPuntosDeVida() + ", getPuntosDeDaño()=" + getPuntosDeDaño()
				+ ", geSegRecuperacion()=" + geSegRecuperacion() + "]";
	}
	
	
}
