package pruebas;

public class Ejercicio8 {

	public static void main(String[] args) {
		String a = "45";
		Double b = 23.89;
		Float c = 28.01F;
		
		Long x1;//a
		String x2;//b
		Integer x3;//b
		Long x4;//c
		
		x1 = Long.parseLong(a);
		x2 = b.toString();
		x3 = c.intValue();
		x4 = c.longValue();
		
		System.out.println(x1 + x2 + x3 + x4);
		

	}

}
