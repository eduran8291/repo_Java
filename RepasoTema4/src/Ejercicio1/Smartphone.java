package Ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;
	
	public Smartphone() {
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		// estas dos líneas se podrían poner como this();
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public Smartphone(String marca, String modelo, String imei) {
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		activo = true;
		precio = BigDecimal.ZERO;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public void activar() {
		activo = true;
	}
	public void desactivar() {
		activo = false;
	}
	public Integer getEdad() {
		LocalDate fecha2000 = LocalDate.of(2000, Month.APRIL, 1);
		Period periodo = fecha2000.until(fechaFabricacion);
		return periodo.getYears();
	}
	
	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void establecerFabricacion(LocalDate fabricacion) {
		fechaFabricacion = fabricacion;
	}
	
	public BigDecimal getPrecioMasIva() {
		return precio.multiply(new BigDecimal(1.21));
	}
	public Boolean isAltaGama(BigDecimal precioBase) {
		return (precio.compareTo(precioBase) > 0);
	}
	public Boolean isDatosCompletos() {
		return imei != null && !imei.isBlank() && precio != null;
	}
	public Boolean isGratis() {
		return precio.equals(BigDecimal.ZERO);
		//return precio.compareTo(BigDecimal.ZERO) == 0; // alternativa
	}
	public void rebajar() {
		precio = precio.subtract(BigDecimal.TEN);
	}
	
	@Override
	public String toString() {
		String resultado = marca + " (" + modelo + ")";
		if (!activo) {
			resultado += " - INACTIVO";
		}
		return resultado;
	}
	

}
