package EjerciciosPt5_orientacionAObjetos;



public class AppSemaforo {

	public static void main(String[] args) {
		Semaforo sem = new Semaforo();
		System.out.println(sem);
		
		sem.setColor("Rosa");
		System.out.println("COLOR INCORRECTO");
		
		sem.setColor(Semaforo.VERDE);
		System.out.println(sem);
		
		sem.setParpadeando(true);
		System.out.println(sem);
		
		sem.setColor(Semaforo.AMBAR);
		System.out.println(sem);
		
		sem.setParpadeando(true);
		System.out.println(sem);
		
		for (int i = 0; i <= 5; i++) {
			sem.cambiarEstado();
			System.out.println(sem);
		}
		Semaforo sem2 = new Semaforo();
		sem2.setColor(sem.getColor());
		sem2.setParpadeando(sem.getParpadeando());
		System.out.println(sem2);
		
		
		
	}

}
