package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Prueba {

	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("12.46464");
		BigDecimal y = new BigDecimal("34.32");
		System.out.println(x);
		x = x.setScale(2, RoundingMode.HALF_DOWN);
		System.out.println(x);
		
		BigDecimal suma = x.add(y);
		BigDecimal restar = x.subtract(y);
		BigDecimal multiplicar = x.multiply(y);
		
		BigDecimal resultado = x.add(y).multiply(y).subtract(y).setScale(2, RoundingMode.HALF_DOWN);
		System.out.println(resultado);
		
		BigDecimal dividir = x.divide(y, 4, RoundingMode.HALF_DOWN);
		System.out.println(dividir);
		
		dividir = dividir.negate();
		System.out.println(dividir);
		dividir = dividir.plus();
		System.out.println(dividir);
		dividir = dividir.abs();
		System.out.println(dividir);
		
		BigDecimal j = new BigDecimal(1278487.6);
		DecimalFormat formato = new DecimalFormat("Precio: #,###.00 €");
		System.out.println(formato.format(j));
		
		
	}

}
