package Ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AppEj54 {

	public static void main(String[] args) {
		CuentaAhorro cuenta = new CuentaAhorro("83383838");
		System.out.println(cuenta.getTotalDinero());
		
		Cargo c1 = new Cargo();
		c1.setCif("23432D");
		c1.setFecha(LocalDate.of(2024, 1, 21));
		c1.setImporte(new BigDecimal("732.90"));
		
		Cargo c2 = new Cargo();
		c2.setCif("328382X");
		c2.setFecha(LocalDate.of(2024, 2, 11));
		c2.setImporte(new BigDecimal("122.90"));
		
		Ingreso i1 = new Ingreso();
		i1.setDescripcion("Alquiler");
		i1.setFecha(LocalDate.of(2023, 12, 3));
		i1.setImporte(new BigDecimal("928.38"));

		Ingreso i2 = new Ingreso();
		i2.setDescripcion("Deudas");
		i2.setFecha(LocalDate.of(2024, 1, 29));
		i2.setImporte(new BigDecimal("38.12"));
		
		Retirada r1 = new Retirada();
		r1.setFecha(LocalDate.of(2024, 1, 13));
		r1.setImporte(new BigDecimal("933.3"));

		cuenta.addMovimiento(c1);
		cuenta.addMovimiento(c2);
		cuenta.addMovimiento(i1);
		cuenta.addMovimiento(i2);
		cuenta.addMovimiento(r1);
		
		System.out.println(cuenta.getTotalDinero());
		
		System.out.println(cuenta.getListaMovimientos());
		System.out.println(cuenta.getListaMovimientosCargos());
		System.out.println(cuenta.getListaMovimientosRetiradas());
		System.out.println(cuenta.getListaMovimientosIngresos());



	}

}
