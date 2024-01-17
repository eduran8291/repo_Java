package EjerciciosPt4_orientacionAObjetos;

import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso(3);

		Alumno[] alumnos = new Alumno[3];

		// Curso para todos
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");
		for (Alumno alumno : alumnos) {
			
		}
		for (int i = 0; i < alumnos.length; i++) {
			do {
				do {
					System.out.println("Introduce el DNI");
					alumnos[i] = new Alumno(sc.nextLine());
				} while (!alumnos[i].validarDni());

				System.out.println("Introduce el nombre");
				alumnos[i].setNombre(sc.nextLine());
				alumnos[i].setCurso(curso);

				System.out.println("Introduce la edad");
				alumnos[i].setEdad(sc.nextInt());

				System.out.println("Introduce la nota");
				alumnos[i].setNota(sc.nextInt());
				sc.nextLine();
				System.out.println(alumnos[i].validarDni());

			} while (!alumnos[i].validar());

		}
		if (alumnos[0].equals(alumnos[1]) || alumnos[0].equals(alumnos[2]) || alumnos[1].equals(alumnos[2])) {
			System.out.println("ERROR");
		} else {
			System.out.println("No hay alumnos con el mismo DNI");
		}
	}

}
