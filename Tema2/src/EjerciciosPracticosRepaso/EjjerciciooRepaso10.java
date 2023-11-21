package EjerciciosPracticosRepaso;

import java.util.Scanner;

public class EjjerciciooRepaso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dir = "";
		Boolean c1 = null;
		Boolean c2 = null;
		Boolean c3 = null;
		Boolean c4 = null;
		sc.close();
		
		do {
			System.out.println("Escribe una dirección web que tendrá este formato:");
			System.out.println("PROTOCOLO://PARTE1.PARTE2.PARTE3");
			dir = sc.nextLine();
			c1 = !dir.contains(":");
			c2 = !dir.contains("//");
			c3 = (dir.indexOf(".")==dir.lastIndexOf("."));
			c4 = (dir.indexOf(".")==dir.lastIndexOf("//")+ 2);
			if (c1 || c2 || c3 || c4) {
				System.out.println("URL incorrecto");
			}
			
		}
		while (c1 || c2 || c3 || c4);
		String protocolo = dir.substring(0,dir.indexOf("//")+2);
		String parte1 = dir.substring(dir.indexOf("//")+ 2,dir.indexOf("."));
		String parte2 = dir.substring(dir.indexOf(".") + 1,dir.lastIndexOf("."));
		String parte3 = dir.substring(dir.lastIndexOf(".")+1);
		
		System.out.println(protocolo);
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
		
		
		
		
			
		
		}
		
		
	}


