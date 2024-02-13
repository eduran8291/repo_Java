package Ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal importe;
	
	public Hucha() {
		importe = BigDecimal.ZERO;
	}
	
	public BigDecimal meterDinero(BigDecimal importe) {
		this.importe = this.importe.add(importe).setScale(2, RoundingMode.HALF_DOWN);
		return importe;
		
	}
	public BigDecimal sacarDinero(BigDecimal sacar) {

		if(sacar.compareTo(importe)>0) {
			BigDecimal sacado = importe;
			importe = BigDecimal.ZERO;
			
			return sacado;
		}
		importe = importe .subtract(sacar).setScale(2, RoundingMode.HALF_DOWN);
		return sacar;
	}
	
	 public BigDecimal contarDinero() {
		 
		return importe;
		
	}
	 public BigDecimal romperHucha() {
		 return sacarDinero(importe);
	 }

	@Override
	public String toString() {
		
		DecimalFormat formato = new DecimalFormat("importe: #,##0.00 €");
		return formato.format(importe);
	}
	  	

}
