package boolean1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realizar un programa que muestre la suma de todos los números del 1 al 10000
		Integer num = 1;
		Integer suma = 0;
		String sumaS = "";// (1)

		do {
			suma = suma + num;
			sumaS = sumaS + " + " + num.toString(); // Por si quieres LITERALMENTE enseñar la suma(1)
			num = num + 1;
			// num++;(2)

		} while (num <= 10000);

		System.out.println("La suma es " + suma);
		// System.out.println(sumaS + " = " + suma);(1)

	}

}
