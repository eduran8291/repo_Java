package EJ56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Map<Integer, Integer> numeros = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Integer answer = 0;
		Integer num = null;

		do {
			System.out.println("Dame un numerin del 1");
			num = sc.nextInt();

			if (num != 0) {
				if (numeros.containsKey(num)) {
					numeros.put(num, numeros.get(num) + 1);

				} else {
					numeros.put(num, 1);
				}
			}
			answer++;

		} while (num != 0);

		String veces = null;
		System.out.println("Total de numeros indicados:" + answer + "\nDistribucion:\n");
		for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
			if (entry.getValue() == 1) {
				veces = " vez";
			} else {
				veces = " veces";

			}
			System.out.println("Numero " + entry.getKey() + ": " + entry.getValue() + veces);
		}
	}

}
