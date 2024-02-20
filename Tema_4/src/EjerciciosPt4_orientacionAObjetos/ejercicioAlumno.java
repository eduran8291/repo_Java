package EjerciciosPt4_orientacionAObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicioAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso();

		// Alumno[] alumnos = new Alumno[3];
		List<Alumno> alumnos = new ArrayList<>();
		// Curso para todos
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");

		for (int i = 0; i < 3; i++) {
			Boolean check = true;
			do {
				System.out.println("Introduce el DNI del alumno " + (i + 1));
				Alumno aux = new Alumno(sc.nextLine());
				if (alumnos.contains(aux)) {
					System.err.println("Alumno repetido, introduzca de nuevo");
				} else {
					alumnos.add(aux);
					check = false;
				}
			} while (check);

			System.out.println("Introduce el nombre");
			alumnos.get(i).setNombre(sc.nextLine());

			System.out.println("Introduce la edad");
			alumnos.get(i).setEdad(sc.nextInt());

			System.out.println("Introduce la nota");
			alumnos.get(i).setNota(sc.nextInt());
			alumnos.get(i).setCurso(curso);
			sc.nextLine();
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			if(!alumnos.get(i).validar()) {
				System.out.println("Hay datos no válidos");
				break;
			}
		}
		
		System.out.println(alumnos);
	}
	

}
