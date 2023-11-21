package EjerciciosPracticosRepaso;

import java.util.Random;
import java.util.Scanner;


public class EjjerciciooRepaso15 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		Integer aleatorio = random.nextInt(0, 8);
		Integer numero = 0;
		Integer intentos = 0;
		
		do {
		 System.out.println("Introduzca numeros hasta que aciertes"); 
		 numero = sc.nextInt();
		 intentos++;
		}
		
		while(!(numero==aleatorio || intentos == 10));
			System.out.println("Enhorabuena,tu puntuacion es" + " " + intentos);
		sc.close();

	}

}
