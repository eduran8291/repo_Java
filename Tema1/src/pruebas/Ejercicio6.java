package pruebas;

import java.util.Scanner;

public class Ejercicio6 {

	public static final Double IVA = 0.21;
	
	public static void main(String[] args) {
		//solicita por consola al usuario cual es el precio sin IVA del articulo (puede llevar decimales)
		System.out.println("cual es el precio del articulo sin IVA?");
		
		//recoge el dato y calcula el IVA (21%)
		Scanner sc = new Scanner(System.in);
		Double preciosiniva = sc.nextDouble();
		Double iva = preciosiniva * IVA;
		Double precioFinal = preciosiniva + iva;
		
		//muestra como resultado en la consola el IVA calculado y el precio final (la suma del precio sin IVA mas el IVA)
		System.out.println("El IVA seria:" + iva);
		System.out.println("El precio final seria:" + precioFinal);
		
		sc.close();
		

		

	}

}
