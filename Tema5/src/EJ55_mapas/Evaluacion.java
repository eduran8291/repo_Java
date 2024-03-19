package EJ55_mapas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluacion {
	
		
		Map<String, BigDecimal> notas = new HashMap<String, BigDecimal>();
		
		public Boolean addNota(String dni, BigDecimal nota) {
			if(notas.containsKey(dni)) {
				return false;
			}
			notas.put(dni, nota);
			return true;
		}
										
	public Boolean corregirNota(String dni, BigDecimal nota) {
		if(notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}
		public BigDecimal obtenerNotasAlumno(String dni) {
			if(notas.containsKey(dni)) {
				return notas.get(dni);
			}
			return BigDecimal.ZERO;
			
		}
		public BigDecimal obtenerNotaMedia() {
			BigDecimal suma = BigDecimal.ZERO;
			for (BigDecimal notaMedia : notas.values()) {
				suma = suma.add(suma);
				
			}
			if(notas.isEmpty()){
				return BigDecimal.ZERO;
				
			}
			return suma.divide(BigDecimal.valueOf(notas.size()), 2 , RoundingMode.HALF_UP);
		}
		public Integer obtenerCantidadAprobados() {
			Integer aprobados = 0;
			for (BigDecimal nota : notas.values()) {
				if(nota.compareTo(BigDecimal.valueOf(5))>= 0) {
					aprobados++;
				}
				
			}
			return aprobados;
		}
		public List<String> obtenerSuspensos(){
			List<String> suspensos = new ArrayList<String>();
			for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
				if(entry.getValue().compareTo(BigDecimal.valueOf(5)) < 0) {
					suspensos.add(entry.getKey());
				}
				
			}
			return suspensos;
		}
		public void borrarAprobados() {
			
		}
	}

