package boolean1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login;
	
		do {
			login = sc.nextLine().trim().toUpperCase();
			System.out.println("dime tu username");
			
			if (login.length() < 10 || login.contains(" ")) {
			
				System.out.println("incorrecto");
			}
		
			
		}
		while(login.length() < 10 || login.contains(" "));
		System.out.println("bienvenido");
		sc.close();
		}

	}

