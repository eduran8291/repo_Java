package EJ55_mapas;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AppEva {

	public static void main(String[] args) {
		Evaluacion e = new Evaluacion();
		DecimalFormat format = new DecimalFormat("#,###.0");
		e.addNota("1234A", new BigDecimal(9.2));
		e.addNota("1232C", new BigDecimal(3.9));
		e.addNota("4452X", new BigDecimal(7.9));
		e.addNota("0923S", new BigDecimal(8.1));
		e.addNota("8273R", new BigDecimal(4.2));
		System.out.println(e);
		e.addNota("0923S", new BigDecimal(3.3));
		System.out.println(e);
		e.corregirNota("0923S", new BigDecimal(3.3));
		e.corregirNota("0923Z", new BigDecimal(3.3));
		System.out.println(e);
		System.out.println(format.format( e.obtenerNotasAlumno("0923S")));
		System.out.println(format.format(e.obtenerNotaMedia()));
		System.out.println(e.obtenerCantidadAprobados());
		System.out.println(e.obtenerSuspensos());
		e.borrarAprobados();
		System.out.println(e);


	}

}
