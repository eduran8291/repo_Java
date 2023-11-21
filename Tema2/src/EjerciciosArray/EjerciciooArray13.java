package EjerciciosArray;

public class EjerciciooArray13 {

	public static void main(String[] args) {
		Integer[][] tabla = new Integer[10][10];
		Integer x = 1;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
				
			}
		}
			for (int i = 0; i < tabla.length; i++) {
				for (int j = 0; j < tabla.length; j++) {
					System.out.print(tabla[i][j] + " ");
				}
				System.out.println();
			}
	}

}
