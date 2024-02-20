package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<BigDecimal>lista = new ArrayList<BigDecimal>();
		
		Integer cantNumeros = 0;
		do {
			System.out.println("Dame un numero decimal");
			BigDecimal numero = sc.nextBigDecimal();
			if(cantNumeros == 0 || numero.compareTo(lista.get(cantNumeros - 1))> 0);
			
			lista.add(numero);
			cantNumeros++;
			
			
		}while(cantNumeros < 5);
		
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal num : lista) {
			suma = suma.add(num);
			
		}
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		
		BigDecimal division = lista.get(0).divide(lista.get(1), 3, RoundingMode.HALF_UP);
		System.out.println(division);
	}

}
