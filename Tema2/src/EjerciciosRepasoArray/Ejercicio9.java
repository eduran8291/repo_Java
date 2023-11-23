package EjerciciosRepasoArray;

public class Ejercicio9 {

	public static void main(String[] args) {
		String html = "<html><head/><body><h1>Mi página web</h1><h2>Ej 8 de Programación</h2><br/><br/><p>Funciona?</p><p>Sí!!</p></body></html>";
		String[] caracteres = html.split("");
		Boolean dentroTag = false;
		Boolean letrasImpresas = false;
		for (String caracter : caracteres) {
			if(caracter.equals("<")){
				dentroTag = true;
			}
			else if(caracter.equals(">")) {
				dentroTag = false;
				if(letrasImpresas) {
					System.out.println();
					letrasImpresas = false;
				}
			}
			else if(!dentroTag) {
				System.out.print(caracter);
				letrasImpresas = true;
			}
		}
	}

}
