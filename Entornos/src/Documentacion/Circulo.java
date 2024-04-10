package Documentacion;
/*@Autor: Enrique
 * @since 10/04/2024
 * @version 1.1
 */
public class Circulo {

	public static void main(String[] args) {}
		//Atributos de la clase circulo
			private double centroX;
			private double centroY;
			private double radio;
			/*Constructor por defecto con 3 parametros
			 * @param centroX centro del circulo
			 * @param centroY centro del circulo
			 * @param radio radio del circulo
			 */
			
			
			public Circulo(double cx, double cy, double r) {
				
				/*Constructor por defecto con 3 parametros
				 * @param centroX centro del circulo
				 * @param centroY centro del circulo
				 * @param radio radio del circulo
				 */
			
				centroX = cx;
				centroY = cy;
				radio = r;
			}
			public double getCentroX() {
				return centroX;
				// Metodo get en donde nos va a devolver
				// el centro del circulo con el return
			}
			public double getCircunferencia() {
				return 2 * Math.PI * radio;
				// Metodo get en donde calculamos la circunferencia 
				// y con el return nos devuelve el resultado
			}
			public void mueve(double deltaX, double deltaY) {
				centroX = centroX + deltaX;
				centroY = centroY + deltaY;
				// Metodo que no devuelve nada y calcula el centroX
				// y el centroY
			}
			public void escala(double s) {
				radio = radio * s;
				// Metodo que no devuelve nada y calcula el radio
				// del circulo
			
	
			
			
	}
}


