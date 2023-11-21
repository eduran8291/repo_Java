package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un número");
		Integer peticion = sc.nextInt();
		
		System.out.print(" ___");
		for(Integer num = 2;num <= peticion;num++) {
			System.out.print("____");
		}
		System.out.println();
		for(Integer num3 = 1; num3<=peticion; num3++) {
			for(Integer num2 = 1;num2 <= peticion;num2++) {
				if(num2 == 1) {
					System.out.print("|___|");				
				}else {
					System.out.print("___|");
				}
			}
			System.out.println();
			}
		
			sc.close();
			

	}

}
