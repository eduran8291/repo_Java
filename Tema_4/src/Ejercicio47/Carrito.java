package Ejercicio47;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaAct;
	private Cliente cliente;
	private List<Articulo> articulos;
	
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaUltimaAct = LocalDate.now();
		articulos = new ArrayList<Articulo>();
	}

	public Integer getCantidad() {
		return articulos.size();
	}
	
	public BigDecimal getTotal() {
		BigDecimal resultado = BigDecimal.ZERO;
		for (Articulo articulo : articulos) {
			resultado = resultado.add(articulo.getPrecio());
		}
		return resultado;
	}
	
	public BigDecimal getPrecioMedio() {
		if (articulos.isEmpty()) {
			return BigDecimal.ZERO;
		}
		BigDecimal cantidad = new BigDecimal(getCantidad());
		return getTotal().divide(cantidad, 2, RoundingMode.HALF_DOWN);
	}
	
	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Cliente: " + cliente 
				+ " Cant.artículos: "+ getCantidad()
				+ " Total :" + getTotal() 
				+ " € Fecha últ. act. " + fechaUltimaAct.format(format);
	}
	
	
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		fechaUltimaAct = LocalDate.now();
	}
	public void borrarArticulo(int posicion) {
		articulos.remove(posicion);
		fechaUltimaAct = LocalDate.now();
	}
	public void vaciarCesta() {
		articulos.clear();
		fechaUltimaAct = LocalDate.now();
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaUltimaAct() {
		return fechaUltimaAct;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	

	
	

}
