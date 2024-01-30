package Ejercicio41;

import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Equipo equipoLocal = crearEquipo(sc, "LOCAL");
		Equipo equipoVisitante = crearEquipo(sc, "VISITANTE");
		System.out.println(equipoLocal);
		System.out.println(equipoVisitante);
		
		Partido partido = new Partido();
		partido.setEquipoLocal(equipoLocal);
		partido.setEquipoVisitante(equipoVisitante);
		Resultado resultado = new Resultado();
		partido.setResultado(resultado);
		
		System.out.println("Dime el resultado (goles locales):");
		Integer golesL = sc.nextInt();
		System.out.println("Dime el resultado (goles visitantes):");
		Integer golesV = sc.nextInt();
		resultado.setGolesLocales(golesL);
		partido.getResultado().setGolesVisitante(golesV);
		System.out.println(partido);
		
		System.out.println("Equipo ganador");
		System.out.println(partido.getEquipoGanador());
		
		Jugador infiltrado = new Jugador("Blas infiltrado", 99);
		equipoVisitante.getListaDeJugador().add(infiltrado);
		
		Integer cant = equipoLocal.getListaDeJugador().size();
		Jugador ultimo = equipoLocal.getListaDeJugador().get(cant-1);
		equipoLocal.setCapitan(ultimo);
		
		Equipo.setCompeticion("Liga Nacional");
		System.out.println("Competicion visitantes:" + Equipo.getCompeticion());
		
		Equipo.setCompeticion("Copa Internacional");
		System.out.println("Competicion local:" +  Equipo.getCompeticion());
		
		
		
		sc.close();
	}

	private static Equipo crearEquipo(Scanner sc, String tipoEquipo) {
		System.out.println("Dime el nombre del equipo " + tipoEquipo);
		Equipo e = new Equipo(sc.nextLine());
		for (int i = 1; i <= 3; i++) {
			System.out.println("Dime el nombre del jugador " + i);
			String nombre = sc.nextLine();
			System.out.println("Dime el dorsal del jugador " + i);
			Integer dorsal = sc.nextInt();
			sc.nextLine();
			Jugador jugador = new Jugador(nombre, dorsal);
			e.getListaDeJugador().add(jugador);
			if (i == 1) {
				e.setCapitan(jugador);
			}
		}
		return e;

	}

}
