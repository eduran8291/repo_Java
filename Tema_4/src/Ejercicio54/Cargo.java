package Ejercicio54;

import java.math.BigDecimal;

public class Cargo extends Movimiento{
	
	private String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
	@Override
	public String getTipo() {
		return TIPO_CARGO;
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + " - " + cif + "]";
	}
	
	@Override
	public BigDecimal getImporteOperacion() {
		return getImporte().negate();
	}
	


}
