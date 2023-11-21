package pruebas;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//pedir al usuario su peso y altura
		System.out.println("Cuanto pesas en kg?");
		
		//recoger los datos y calcula el IMC
		Scanner scanner = new Scanner(System.in);
		Double peso = scanner.nextDouble();
		
		System.out.println("Cuanto mides en metros?");
		Double altura = scanner.nextDouble();
		Double IMC = peso / altura * altura;
		
		//muestra por consola el resultado del IMC calculado
		System.out.println("IMC:" + IMC );
		
		scanner.close();

	}

}
