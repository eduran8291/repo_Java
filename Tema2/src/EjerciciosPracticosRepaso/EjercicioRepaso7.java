package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjercicioRepaso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num;
		do {
			System.out.println("Dame un número entre 0 y 10");
			num = sc.nextInt();
			if (num <0 || num >10) {
				System.out.println("El número no es válido");
			}
			else if (num != 0){
				Integer suma = 0;
				for(int i = num; i <= num*10; i=i+num) {
					suma = suma + i;
					if (i<num*10) {
						System.out.print(i + "+");
					}
				else {
						System.out.print(i);
					}
				}
				System.out.println(" = " + suma);
			}
		}while(num != 0);
		
		sc.close();

		
	}

}
