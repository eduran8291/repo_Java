package boolean1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Realizar un programa que calcule el IVA de un producto. Para ello tendremos
		// que solicitar dos datos al usuario: el precio sin IVA y el tipo de IVA
		System.out.println("Precio sin IVA");
		Scanner sc = new Scanner(System.in);
		Double preciosinIVA = sc.nextDouble();
		sc.nextLine();

		System.out.println("Tipo de IVA");
		String tipodeIVA = sc.nextLine();

		sc.close();

		if (tipodeIVA.equals("Normal")) {
			Double iva = preciosinIVA * 0.21;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
		}
		else if(tipodeIVA.equals("Reducido")) {
			Double iva = preciosinIVA * 0.10;
			System.out.println("El iva es " + iva + " y el precio " +(preciosinIVA + iva));
		}
		else if(tipodeIVA.equals("Superreducido")) {
			Double iva = preciosinIVA * 0.04;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
		}
		else if(tipodeIVA.equals("Exento")) {
			Double iva = preciosinIVA;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
		}
	}

}
