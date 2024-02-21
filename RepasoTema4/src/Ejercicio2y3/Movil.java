package Ejercicio2y3;


public class Movil extends Telefono{
	private LocalizacionGps gps;
	
	public Movil(Integer numero, LocalizacionGps gps) {
		super(numero);
		this.gps = gps;
		
	}

	public LocalizacionGps getGps() {
		return gps;
	}

	public void setGps(LocalizacionGps gps) {
		this.gps = gps;
	}

}
