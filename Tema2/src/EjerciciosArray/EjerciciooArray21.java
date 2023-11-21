package EjerciciosArray;

public class EjerciciooArray21 {

	public static void main(String[] args) {
		Double[] numeros = {5.4, 3.1, 9.0, 4.7};
		
		for (Double numero : numeros) {
			System.out.println(numero);
		}
		Double suma = 0.0;
		for (Double num : numeros) {
			suma += num;
		}
		System.out.println("Suman: " + suma);
		
	}

}
