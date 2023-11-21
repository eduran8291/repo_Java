package EjerciciosPracticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class EjjerciciooRepaso25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "Piedra, papel, tijera… un, dos, tres… ya!!");
		String manoJugador = sc.nextLine();
		Random random = new Random();
		Integer manoConsola = random.nextInt(1 ,3);
		
		if(manoConsola == 1) {
			System.out.println("consola:Piedra");
		}else if (manoConsola == 2) {
			System.out.println("Consola:Papel");
		}
		else {
			System.out.println("Consola:Tijera");
		}
		
		System.out.println("Tu: " + manoJugador);
		
		
		if(manoConsola == 1)
			if(manoJugador == "Piedra" || manoJugador == "piedra"){
			System.out.println("Empate");
		}
			else if(manoJugador == "Papel" || manoJugador == "papel") {
			System.out.println("Has ganado");
			}
			else {
				System.out.println("Has perdido");
			}
			
		if(manoConsola == 2)
			if(manoJugador == "Piedra" || manoJugador == "piedra"){
			System.out.println("Has perdido");
		}
			else if(manoJugador == "Papel" || manoJugador == "papel") {
				System.out.println("Empate");
				}
				else {
					System.out.println("Has ganado");
				}
		
		if(manoConsola == 3)
			if(manoJugador == "Piedra" || manoJugador == "piedra"){
			System.out.println("Has ganado");
		}
			else if(manoJugador == "Papel" || manoJugador == "papel") {
				System.out.println("Has perdido");
				}
				else {
					System.out.println("Empate");
				}
			
	
	
	
	
	
	
	
	
	
	}
}
