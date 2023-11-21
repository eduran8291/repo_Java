package boolean1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		System.out.println("Precio sin IVA");
		Scanner sc = new Scanner(System.in);
		Double preciosinIVA = sc.nextDouble();
		sc.nextLine();
		Double iva=0.00;

		System.out.println("Tipo de IVA");
		String tipodeIVA = sc.nextLine();

		sc.close();
		
		switch (tipodeIVA) {
		case "Normal":
			iva = preciosinIVA * 0.21;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
			break;
		case "Reducido":
			iva = preciosinIVA * 0.10;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
			break;
		case "Superreducido":
			iva = preciosinIVA * 0.04;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
			break;
		case "Extento":
			iva = preciosinIVA;
			System.out.println("El iva es " + iva + " y el precio " + (preciosinIVA + iva));
			break;
		default:
			System.out.println("tipo de IVA incorrecto");
			break;
		}
		}

	}


