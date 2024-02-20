package EjerciciosPt4_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioProfesor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Datos del profesor-->");
		
		Profesor profe = new Profesor();
		
		System.out.println("Edad:");
		profe.setEdad(sc.nextInt());
		
		sc.nextLine();		
		System.out.println("Nombre:");
		profe.setNombre(sc.nextLine());
		
		System.out.println("Estos son los siguientes datos:");
		System.out.println("Edad:" + " " + profe.getEdad());
		System.out.println("Nombre:" + " " + profe.getNombre());
	}

}
