package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer opcion = 0;
		do {
		System.out.println("*** MENÚ ***");
		System.out.println("\t1.Abrir");
		System.out.println("\t2.Guardar");
		System.out.println("\t3.Modificar");
		System.out.println("\t4.Salir");
		opcion = sc.nextInt();
		
		
		switch (opcion) {
		
		case 1:
			
			System.out.println("Ha elegido la opcion de Abrir");
		
		case 2:
			
			System.out.println("Ha elegido la opcion Guardar");
			
		case 3:
			
			System.out.println("Ha elegido la opcion Modificar");
			
		case 4:
			
			System.out.println("bye bye");
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		}while(opcion != 4);
	sc.close();
	}

}
