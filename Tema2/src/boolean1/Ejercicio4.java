package boolean1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Realizar un programa que solicite números por consola y los vaya sumando en una cuenta
		//acumulativa. Pedirá números hasta que el usuario introduzca el número 0. Cuando lo haga,
		//dejará de pedir números, mostrará el total de la suma, y terminará el programa. 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce numeros para calcular una suma");
        Integer numero = 0;
        Integer suma =0;
        
       
        
        do {
        	numero = scanner.nextInt();        	
        	suma=numero+suma;
            }
        
        	while (numero != 0);
        
        System.out.println("La suma es " + suma);
        scanner.close();
	}

	
}
