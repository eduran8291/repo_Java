package EjerciciosPracticosRepaso;
public class EjjerciciooRepaso20 {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		Integer fila;
		Integer columna;

		for (fila= 1;fila < 5; fila++) {
			for (columna = 1; columna < 5; columna++) {
				if (fila == columna) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			System.out.println();
		}
	}

}
