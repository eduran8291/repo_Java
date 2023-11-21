package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introducir nombre de usuario");
		String nombre = sc.nextLine();
		System.out.println("hola" + " " + nombre);
		System.out.println("dime el nombre de tres ciudades");
		String ciudad1 = sc.nextLine();
		String ciudad2 = sc.nextLine();
		String ciudad3 = sc.nextLine();
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		
		if (longitud1 < longitud2 && longitud2 < longitud3) {
		System.out.println(ciudad1);
		System.out.println(ciudad2);
		System.out.println(ciudad3);
		}
		else if (longitud2 < longitud3 && longitud3 < longitud1) {
			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
	    }
		else if (longitud3 < longitud1 && longitud1 < longitud2) {
			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
		}
		else if (longitud1 < longitud3 && longitud3 < longitud2) {
			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
		}
		else if (longitud2 < longitud1 && longitud1 < longitud3) {
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		}
		else if (longitud3 < longitud2 && longitud2 < longitud1) {
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
		}
		sc.close();
		
		

}
}
