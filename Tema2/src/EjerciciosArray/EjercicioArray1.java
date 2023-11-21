package EjerciciosArray;

public class EjercicioArray1 {

	public static void main(String[] args) {
		Integer[] listaNumeros = new Integer[15];
		Integer posicion = 0;

		for (Integer num = 1; num <= 30; num++) {
			if(num%2 == 0) {
				listaNumeros[posicion] = num;
				posicion++;
			}
		}
		
		for (int i = 0; i < listaNumeros.length; i++) {
			
			System.out.println(listaNumeros[i]);
		}

	}

}
