package boolean1;

import java.util.Scanner;



public class Ejercicio2 {

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
				
				
				if (IMC < 18.5) {
					System.out.println("Peso inferior al normal");
				}
				
				else if (IMC <= 24.9) {
					System.out.println("Peso normal");
				}
				
				else if (IMC <= 29.9 ) {
					System.out.println("Peso superior al normal");
				}
				
				else  {
					System.out.println("Obesidad");
				}
                 
				scanner.close();
	}

}
