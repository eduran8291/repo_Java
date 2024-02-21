package Ejercicio2y3;

import java.math.BigDecimal;

public class LocalizacionGps {
	private BigDecimal coord1Gps;
	private BigDecimal coord2Gps;
	
	public LocalizacionGps(BigDecimal coord1Gps, BigDecimal coord2Gps) {
		this.coord1Gps = coord1Gps;
		this.coord2Gps = coord2Gps;
	}
	
	
	public BigDecimal getCord1Gps() {
		return coord1Gps;
	}
	public void setCord1Gps(BigDecimal cord1Gps) {
		this.coord1Gps = cord1Gps;
	}
	public BigDecimal getCord2Gps() {
		return coord2Gps;
	}
	public void setCord2Gps(BigDecimal cord2Gps) {
		this.coord2Gps = cord2Gps;
	}
	
	

}
