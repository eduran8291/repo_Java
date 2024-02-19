package Ejercicio54;

import java.math.BigDecimal;

public class Retirada extends Movimiento{

	@Override
	public String getTipo() {
		return TIPO_RETIRADA;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}

	@Override
	public BigDecimal getImporteOperacion() {
		return getImporte().negate();
	}


}
