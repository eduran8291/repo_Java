package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos numeros enteros");
		
		Integer num = 1;
		Integer num2 = 1;
		num = sc.nextInt();
		num2 = sc.nextInt();
		Integer opcion = 0;
		do {
			System.out.println("*** MENÚ ***");
			System.out.println("\t1.Sumar");
			System.out.println("\t2.Restar");
			System.out.println("\t3.Multiplicar");
			System.out.println("\t4.Dividir");
			System.out.println("\t0.Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La suma es" + " " + "=" + " " + (num + num2));
				break;
			case 2:
				System.out.println("La resta es" + " " + "=" + " " +(num - num2));
				break;
			case 3:
				System.out.println("La multiplicacion es" + " " + "=" + " " +(num * num2));
				break;
			case 4:
				if(num2 == 0) {
					System.out.println("Divion imposible");
				}
				else {
				System.out.println("La division es" + " " + "=" + " " +(num / num2));
				
				break;
				}
			case 0:
				System.out.println("salir");
				break;

			default:
				System.out.println();
				break;
			}
		}
		while (opcion != 0);
		System.out.println();
		sc.close();	
		}

}
