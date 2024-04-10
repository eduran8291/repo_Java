package Ejercicio6;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public void setGenero(String genero) throws ParametroIncorrectoException {

		if (genero == null || (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("H"))) {

			throw new ParametroIncorrectoException("Este genero tiene que ser H o M");
		}
		this.genero = genero.toUpperCase();

	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura == null
				|| (altura.compareTo(new BigDecimal("0")) < 0 || altura.compareTo(new BigDecimal("3")) > 0)) {
			throw new ParametroIncorrectoException("Este numero es icorrecto");
		}
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
