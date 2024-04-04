package Ejercicios1_2_3_4_5;
/*@Autor Enrique
 *@since 03/04/2024
 *@version 1.1
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {
	// atributo de tipo lista para guardar numeros
	List<Integer> listaNumeros;

	// constructor para inicializar la lista
	public SacoNumeros() {
		listaNumeros = new ArrayList<Integer>();
	}

	// metodo para añadir numeros a la lista
	public void addNumero(Integer num) {
		listaNumeros.add(num);
	}

	// metodo toString para mostrar el resultado
	@Override
	public String toString() {
		return "SacoNumeros [listaNumeros=" + listaNumeros + "]";
	}

	// metodo para obtener la posicion de la lista
	public Integer getNumero(Integer posicion) {

		try {
			return listaNumeros.get(posicion);

		} catch (Exception e) {
			return null;
		}
	}

	// metodo para dividir la posicion de la lista
	public BigDecimal division() {

		BigDecimal total = new BigDecimal(listaNumeros.get(0)).divide(new BigDecimal(listaNumeros.get(1)), 2,
				RoundingMode.HALF_UP);

		try {
			for (int i = 2; i < listaNumeros.size() - 1; i++) {
				total = total.divide(new BigDecimal(listaNumeros.get(i)), 2, RoundingMode.HALF_UP);

			}
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		}
		return total;
	}
}
