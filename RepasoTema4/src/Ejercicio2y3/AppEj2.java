package Ejercicio2y3;

import java.math.BigDecimal;

public class AppEj2 {

	public static void main(String[] args) {
		Movil mov = new Movil(654654654, new LocalizacionGps(new BigDecimal("23.2342"), new BigDecimal("67.2342")));
		Fijo fijo = new Fijo(954954954, "Avda de los Lugares Perdidos, 39");
		System.out.println(mov.consultarNumero());
		System.out.println(fijo.consultarNumero());
		mov.marcar(654654654);
		mov.marcar(610610610);
		mov.colgar();
		mov.colgar();
	}



}
