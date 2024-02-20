package colaCadenas;

public class AppCola {

	public static void main(String[] args) {
		ColaCadenas cola = new ColaCadenas();
		System.out.println("1:: " + cola);
		
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println("2:: " + cola);
		
		System.out.println(cola.sacarCadena());
		System.out.println("3:: " + cola);
		
		cola.añadirCadena("tercero");
		System.out.println("4:: " + cola);
		
		while (cola.getTamaño() > 0) {
			System.out.println(cola.sacarCadena());
		}
		System.out.println("5:: " + cola);
		
		cola.añadirCadena("cuarto");
		System.out.println("6:: " + cola);

	}

}
