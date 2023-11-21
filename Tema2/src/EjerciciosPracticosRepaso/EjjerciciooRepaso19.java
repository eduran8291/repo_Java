package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso19 {
	public static final  double FACTOR_CONVERSION = 166.386;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer opcion;
		do {
			System.out.println("1 - Pasar de Pesetas a Euros\n"
					+ "2 - Pasar de Euros a Pesetas\n"
					+ "3 - Salir");
			opcion = sc.nextInt();
			if (opcion == 1 || opcion == 2) {
				System.out.println("Indique cantidad:");
				Double cantidad = sc.nextDouble();
				if (opcion == 1) {
					System.out.println("Resultado: " + cantidad/FACTOR_CONVERSION);
				}
				else {
					System.out.println("Resultado: " + cantidad*FACTOR_CONVERSION);
				}
			}
			else if (opcion != 3)  {
				System.out.println("Opción elegida es incorrecta.");
			}
			
			
		}
		while(opcion != 3);
		System.out.println("Bye!!");
		sc.close();

	}

}
