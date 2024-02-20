package Ejercicio44;

public class APP44 {

	public static void main(String[] args) {
		EquipoCombate e = new EquipoCombate();
		for (int i = 0; i <= 3; i++) {
			Asesino a = new Asesino("A" + i, "Asesino" + i);
			e.addPersonaje(a);
		}
		Jugador jugador = new Jugador();
		jugador.setNombre("Blas");
		jugador.getEquipo(e);
				
		
		
			
			
			

	}

}
