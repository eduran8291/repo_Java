package Ejercicio3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {

	List<Integer> listaNumeros;

	public SacoNumeros() {
		listaNumeros = new ArrayList<Integer>();
	}

	public void addNumero(Integer num) {
		listaNumeros.add(num);
	}

	@Override
	public String toString() {
		return "SacoNumeros [listaNumeros=" + listaNumeros + "]";
	}

	public Integer getNumero(Integer posicion) {
		return listaNumeros.get(posicion);
	}

	public BigDecimal division() {
		
		BigDecimal total = new BigDecimal(listaNumeros.get(0)).divide(new BigDecimal(listaNumeros.get(1)), 2, RoundingMode.HALF_UP);
		
		try {
			for (int i = 2; i < listaNumeros.size() - 1; i++) {
				total = total.divide(new BigDecimal(listaNumeros.get(i)),2 , RoundingMode.HALF_UP);
				
			}
		}catch(Exception e) {
			return BigDecimal.ZERO;
		}
		return total;
	}
}
