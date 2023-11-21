package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		Integer num = sc.nextInt();
		Integer suma = 0;
		sc.close();
		
		do {
			suma = num + suma;
			System.out.print(num + "+");
			num = num + 3;}
		
		while (num < 30 );
		
			System.out.println(num + "=" + suma);
		
		
		}
		}
