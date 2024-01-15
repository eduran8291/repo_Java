package Ejercicios_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Introduce los siguientes datos-->");
		  
		  System.out.print("Dni:"); String dni = sc.nextLine();
		  
		  Alumno alumno1 = new Alumno(dni);
		  
		  
		  System.out.print("Edad:"); alumno1.setEdad(sc.nextInt());
		  
		  sc.nextLine();
		  
		  System.out.print("Nombre:"); alumno1.setNombre(sc.nextLine());
		 
		  System.out.print("Nota:"); alumno1.setNota(sc.nextInt());
		  
		  Curso curso = new Curso();
		  
		  alumno1.setCurso(curso);
		  
		  
		  System.out.print("Estos son los siguientes datos" + alumno1);
		 
		  
		  alumno1.aprobar();
		 
		  System.out.println(alumno1.getNota());
		 

		Alumno[] alumnos = new Alumno[3];
		
		// Curso para todos
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");

		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("Introduce el DNI");
			alumnos[i] = new Alumno(sc.nextLine());
			
			System.out.println("Introduce el nombre");
			alumnos[i].setNombre(sc.nextLine());
			alumnos[i].setCurso(curso);

			System.out.println("Introduce la edad");
			alumnos[i].setEdad(sc.nextInt());

			System.out.println("Introduce la nota");
			alumnos[i].setNota(sc.nextInt());
			sc.nextLine();
		}
		if(alumnos[0].equals(alumnos[1]) || alumnos[0].equals(alumnos[2]) || alumnos[1].equals(alumnos[2])){
			System.out.println("ERROR");
		}else {
			System.out.println("No hay alumnos con el mismo DNI");
		}
	}

}
