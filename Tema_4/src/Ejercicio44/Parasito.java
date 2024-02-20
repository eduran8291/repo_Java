package Ejercicio44;

public class Parasito extends Personaje {

	public Parasito(String nombre, String codigo) {
		super(nombre, codigo);
	}

	@Override
	public Integer getPuntosDeVida() {
		
		return PUNTOS_VIDA_PARASITO;
	}

	@Override
	public Integer getPuntosDeDaño() {
		
		return PUNTOS_DAÑO_PARASITO;
	}

	@Override
	public Integer geSegRecuperacion() {
		
		return SEG_RECUPERACION_PARASITO;
	}
	
	

}
