package EJ55_mapas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Evaluacion {
	

	private Map<String, BigDecimal> notas ;
	public Evaluacion() {
		this.notas = new HashMap<String, BigDecimal>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		if (notas.containsKey(dni)) {
			return false;
		}
		notas.put(dni, nota);
		return true;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}

	public BigDecimal obtenerNotasAlumno(String dni) {
		if (notas.containsKey(dni)) {
			return notas.get(dni);
		}
		return BigDecimal.ZERO;

	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal notaMedia : notas.values()) {
			suma = suma.add(suma);

		}
		if (notas.isEmpty()) {
			return BigDecimal.ZERO;

		}
		return suma.divide(BigDecimal.valueOf(notas.size()), 2, RoundingMode.HALF_UP);
	}

	public Integer obtenerCantidadAprobados() {
		Integer aprobados = 0;
		for (BigDecimal nota : notas.values()) {
			if (nota.compareTo(BigDecimal.valueOf(5)) >= 0) {
				aprobados++;
			}

		}
		return aprobados;
	}

	public List<String> obtenerSuspensos() {
		List<String> suspensos = new ArrayList<String>();
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			if (entry.getValue().compareTo(BigDecimal.valueOf(5)) < 0) {
				suspensos.add(entry.getKey());
			}

		}
		return suspensos;
	}

	public void borrarAprobados() {
		for (Iterator<String> iterator = notas.keySet().iterator(); iterator.hasNext();) {
			String type = iterator.next();
			if (notas.get(type).compareTo(BigDecimal.valueOf(5)) >= 0) {
				iterator.remove();
			}
		}

	}

	@Override
	public String toString() {
		String aprobados = "Aprobados: \n";
		String suspensos = "Suspensos: \n";
		DecimalFormat format = new DecimalFormat("#,###.0");
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			String dni = entry.getKey();
			BigDecimal nota = entry.getValue();
			if(notas.get(dni).compareTo(BigDecimal.valueOf(5)) < 0) {
				aprobados += "\t" + "\n" + dni + "(" + format.format(nota) + ")" + "\n";
			}
				
			else if(notas.get(dni).compareTo(BigDecimal.valueOf(5)) < 0) {
				suspensos += "\t" + "\n" + dni + "(" + format.format(nota) + ")" + "\n";
				
			}
		}
		return aprobados + suspensos;
	}
	}

