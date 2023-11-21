package EjerciciosArray;

import java.util.Scanner;

public class EjerciciooArray15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica una URL:");
		String url = sc.nextLine();
		
		String[] partes1 = url.split("//");
		if (partes1.length != 2) {
			System.out.println("La url indicada no es correcta");
		}
		else {
			String[] partes2 = partes1[1].split("\\.");
			if (partes2.length != 3) {
				System.out.println("La url indicada no es correcta");
			}
			else {
				System.out.println(partes1[0]+"//");
				for (String parte : partes2) {
					System.out.println(parte);
				}
			}
		}
		sc.close();
		

	}

}
