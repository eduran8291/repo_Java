package recursividad;

public class Ej_13 {

	public static void main(String[] args) {
		Integer resultado = factorial(5);
		System.out.println(resultado);

	}

	public static Integer factorial(int numero) {

		if (numero == 1) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}

	}
}
