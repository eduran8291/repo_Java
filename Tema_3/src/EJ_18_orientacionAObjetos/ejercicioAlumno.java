package EJ_18_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos-->");
		
		Alumno datosAlumno = new Alumno();
		
		System.out.println("Dni:");
		datosAlumno.setDni(sc.nextLine());
		
		System.out.println("Edad:");
		datosAlumno.setEdad(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Nombre:");
		datosAlumno.setNombre(sc.nextLine());
		
		System.out.println("Nota:");
		datosAlumno.setNota(sc.nextInt());
		
		
				
		
		System.out.println("Estos son los siguientes datos");
		System.out.println(datosAlumno.getDni());
		System.out.println(datosAlumno.getNombre());
		System.out.println(datosAlumno.getEdad());
		System.out.println(datosAlumno.getNota());
		
		datosAlumno.aprobar();
		System.out.println(datosAlumno.getNota());
		
	}

}
