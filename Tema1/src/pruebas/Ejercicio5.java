package pruebas;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static final Double NUMERO_PAGAS = 12D;

	public static void main(String[] args) {
		//mostrar un mensaje preguntando "cuanto te gustaria ganar al año?"
        System.out.println("Cuanto te gustaria ganar al año?");
        
        //esperar a que el usuario conteste indicando un numero
        Scanner scanner = new Scanner(System.in);
        Double sueldoanual = scanner.nextDouble();
        Double sueldomensual = sueldoanual / 12;
        
        //mostrar un nuevo mensaje " tu sueldo mensual seria de ( ) euros"(calcular ( ) dividiendo lo indicado por el usuario entre 12
        System.out.println("Tu sueldo mensual seria de" + " " + sueldomensual);
        
        scanner.close();
	}

}
