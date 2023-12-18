package recursividad;

public class Ej_Ejemplo {

	public static void main(String[] args) {
		Integer resultado = sumar(100);
		System.out.println(resultado);

	}
	public static Integer sumar(int numero) {
		if(numero == 1) {
			return 1;
		}
		return numero + sumar(numero-1);
		
	}

}
