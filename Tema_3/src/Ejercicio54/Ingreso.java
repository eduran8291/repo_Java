package Ejercicio54;

import java.math.BigDecimal;

public class Ingreso extends Movimiento{
	
	private String descripcion;


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String getTipo() {
		return TIPO_INGRESO;
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + " - " + descripcion + "]";
	}
	
	
	@Override
	public BigDecimal getImporteOperacion() {
		return getImporte();
	}

}
