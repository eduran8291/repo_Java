package boolean1;

public class Prueba1 {

	public static void main(String[] args) {
		Integer x = 250;
		Integer y = 20;
		Integer z = 30;
		
		Boolean menorQueAmbos = x < y && x < z;
		Boolean menorQueAlgunos = x < y || x < z;
		
		if(x > y) {
			System.out.println("Que sepas que x es mayor que y");
			System.out.println("Pa que lo sepas");
		}
		System.out.println(menorQueAmbos);
		System.out.println(menorQueAlgunos);

	}

}
