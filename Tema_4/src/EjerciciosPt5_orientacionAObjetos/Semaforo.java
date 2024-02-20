package EjerciciosPt5_orientacionAObjetos;

public class Semaforo {
	public static final String ROJO = "rojo";
	public static final String AMBAR = "ambar";
	public static final String VERDE = "verde";

	private String color;
	private Boolean parpadeando;

	public Semaforo() {
		this.color = ROJO;
		this.parpadeando = false;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
		}else {
			System.out.println("COLOR NO CAMBIADO");
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if(color.equals(AMBAR)) {
			this.parpadeando = parpadeando;
		}else{
			System.out.println("ESTE COLOR NO PUEDE PARPADEAR");
		}
		
	}

	@Override
	public String toString() {
		if(color.equals(ROJO)) {
			return "Semáforo en " + ROJO;
		}else if(color.equals(VERDE)) {
			return "Semáforo en " + VERDE;
		}else {
			if(parpadeando) {
				return "Semáforo en " + AMBAR + "parpadeando";
			}
			return "Semáforo en " + AMBAR;
		}
		
	}
	public void cambiarEstado() {
		if(color.equals(VERDE)) {
			this.color = AMBAR;
			parpadeando = true;
		
		}else if(color.equals(AMBAR) && parpadeando == true) {
			parpadeando = false;
			
		}else {
			if(color.equals(AMBAR) && parpadeando == false) {
				this.color = ROJO;
			}else {
				if(color.equals(ROJO)) {
					this.color = VERDE;
				}
			}
		}
		
	}
}
