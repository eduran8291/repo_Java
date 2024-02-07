package Ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaAct;
	private Cliente cliente;
	private Set<Articulo> articulos;
	
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaUltimaAct = LocalDate.now();
		articulos = new HashSet<Articulo>();
	}

	public Integer getCantidad() {
		return articulos.size();
	}
	
	public Double getTotal() {
		Double resultado = 0D;
		for (Articulo articulo : articulos) {
			resultado += articulo.getPrecio();
		}
		return resultado;
	}
	
	public Double getPrecioMedio() {
		if (articulos.isEmpty()) {
			return 0D;
		}
		return getTotal()/getCantidad();
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
	public void borrarArticulo(Articulo articulo) {
		articulos.remove(articulo);
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

	public Set<Articulo> getArticulos() {
		return articulos;
	}
	

	
	

}
