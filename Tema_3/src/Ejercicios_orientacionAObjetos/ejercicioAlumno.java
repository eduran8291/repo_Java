package Ejercicios_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos-->");
		
		System.out.println("Dni:");
		String dni = sc.nextLine();		
		Alumno alumno1 = new Alumno(dni);
		
		System.out.println("Edad:");
		alumno1.setEdad(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Nombre:");
		alumno1.setNombre(sc.nextLine());
		
		System.out.println("Nota:");
		alumno1.setNota(sc.nextInt());
		
		
		System.out.println("Estos son los siguientes datos");
		System.out.println(alumno1.getDni());
		System.out.println(alumno1.getNombre());
		System.out.println(alumno1.getEdad());
		System.out.println(alumno1.getNota());
		
		alumno1.aprobar();
		System.out.println(alumno1.getNota());
		
	}

}
