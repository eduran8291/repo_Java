package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EjerciciosPt4_orientacionAObjetos.Alumno;
import EjerciciosPt4_orientacionAObjetos.Curso;

public class Ej_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso(3);

		List<Alumno>listaAlumnos = new ArrayList<>();

		// Curso para todos
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");
		for (Alumno alumno : listaAlumnos) {
			
		}
		for (int i = 0; i < listaAlumnos.length; i++) {
			do {
				do {
					System.out.println("Introduce el DNI");
					listaAlumnos[i] = new Alumno(sc.nextLine());
				} while (!listaAlumnos[i].validarDni());

				System.out.println("Introduce el nombre");
				listaAlumnos[i].setNombre(sc.nextLine());
				listaAlumnos[i].setCurso(curso);

				System.out.println("Introduce la edad");
				listaAlumnos[i].setEdad(sc.nextInt());

				System.out.println("Introduce la nota");
				listaAlumnos[i].setNota(sc.nextInt());
				sc.nextLine();
				System.out.println(listaAlumnos[i].validarDni());

			} while (!listaAlumnos[i].validar());

		}
		if (listaAlumnos[0].equals(listaAlumnos[1]) || listaAlumnos[0].equals(listaAlumnos[2]) || listaAlumnos[1].equals(listaAlumnos[2])) {
			System.out.println("ERROR");
		} else {
			System.out.println("No hay alumnos con el mismo DNI");
		}

	}

}
