package Ejercicios_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos-->");
		
		System.out.println("Dni:");
		String dni = sc.nextLine();	
		
		Alumno alumno1 = new Alumno(dni);
		Curso curso = new Curso();
		
		System.out.println("Edad:");
		alumno1.setEdad(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Nombre:");
		alumno1.setNombre(sc.nextLine());
		
		System.out.println("Nota:");
		alumno1.setNota(sc.nextInt());
	
		System.out.println("Identificador:");
		curso.setIdentificador(sc.nextLine());
		
		sc.nextLine();
	
		
		System.out.println("Descripcion:");
		curso.setDescripcion(sc.nextLine());
		
		System.out.println("Curso:");
		alumno1.setCurso(curso);
		
		
		System.out.println("Estos son los siguientes datos");
		System.out.println("Dni:"+ " " + alumno1.getDni());
		System.out.println("Nombre:"+ " " +alumno1.getNombre());
		System.out.println("Edad:"+ " " +alumno1.getEdad());
		System.out.println("Nota:"+ " " +alumno1.getNota());
		System.out.println("Identificador:"+ " " +alumno1.getCurso().getIdentificador());
		System.out.println("Descripcion:"+ " " +alumno1.getCurso().getDescripcion());
		
		alumno1.aprobar();
		
		System.out.println(alumno1.getNota());
		
		
		
		
	}

}
