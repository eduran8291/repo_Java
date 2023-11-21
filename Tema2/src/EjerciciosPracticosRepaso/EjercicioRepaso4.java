package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unidades y precio");
		Integer unidades = sc.nextInt();
		Double descuento = 0.00;
		Double precio = sc.nextDouble();
		Double precioTotal = 0.00;
		Double descuentoTotal = 0.00;
		sc.close();
		
		if (unidades > 100) {
			descuento = 0.4;
			precioTotal = unidades * precio;
			descuentoTotal = descuento * precioTotal;
		}
		else if (unidades <= 100 && unidades > 25) {
			descuento = 0.2;
			precioTotal = unidades * precio;
			descuentoTotal = descuento * precioTotal;
		}
		else if (unidades >= 10 && unidades<=25) {
			descuento = 0.1;
			precioTotal = unidades * precio;
			descuentoTotal = descuento * precioTotal;
		}
		else if (unidades < 10){
			descuento = 0.00;
			precioTotal = unidades * precio;
			descuentoTotal = descuento * precioTotal;
		}
		System.out.println("Subtotal:" + " " + precioTotal);
		System.out.println("Descuento" + " " + descuentoTotal);
		System.out.println("Total" + " " +  precioTotal + " - " + descuentoTotal + " = " + (precioTotal - descuentoTotal) );

	}

}
