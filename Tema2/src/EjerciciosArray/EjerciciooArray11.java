package EjerciciosArray;

public class EjerciciooArray11 {

	public static void main(String[] args) {
		Integer contador = 0;
		Integer[][] num = new Integer[5][10];
		for (int i = 0; i < num.length; i++) {
			Integer[] array = num[i];
			for (int j = 0; j < array.length; j++) {
				array[j] = j + contador + 1;
			}
			contador += 10;
		}
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 10; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
