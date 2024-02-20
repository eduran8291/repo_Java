package Ejercicio54;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorro {
	private String numCuenta;
	private List<Movimiento> movimientos;
	
	public CuentaAhorro(String numCuenta) {
		this.numCuenta = numCuenta;
		movimientos = new ArrayList<>();
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public void addMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
	}
	
	public BigDecimal getTotalDinero() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Movimiento movimiento : movimientos) {
			suma = suma.add(movimiento.getImporteOperacion());
		}
		return suma;
	}
	
	public List<String> getListaMovimientos(){
		return getListaMovimientos(null);
	}
	public List<String> getListaMovimientosRetiradas(){
		return getListaMovimientos(Movimiento.TIPO_RETIRADA);
	}
	public List<String> getListaMovimientosIngresos(){
		return getListaMovimientos(Movimiento.TIPO_INGRESO);
	}
	public List<String> getListaMovimientosCargos(){
		return getListaMovimientos(Movimiento.TIPO_CARGO);
	}
	private List<String> getListaMovimientos(String tipo){
		List<String> lista = new ArrayList<String>();
		for (Movimiento movimiento : movimientos) {
			if (tipo == null || movimiento.getTipo().equals(tipo)) {
				lista.add(movimiento.toString());
			}
		}
		return lista;
	}
	
	
	


}
