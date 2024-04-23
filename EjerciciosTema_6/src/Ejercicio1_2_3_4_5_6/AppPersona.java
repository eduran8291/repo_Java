package Ejercicio1_2_3_4_5_6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;



public class AppPersona {

	private static Scanner sc;
	private static PersonaService service;
	
	public static void main(String[] args) {
		try{
			sc = new Scanner(System.in);
			service = new PersonaService();
			
			Integer opcionElegida;
			do {
				opcionElegida = mostrarMenu();
				switch (opcionElegida) {
				case 1: 
					consultarPorDni();
					break;
				case 2:
					buscarPorFiltro();
					break;
				case 3:
					insertarPersona();
					break;
				case 0: 
					System.err.println("Bye!!");
					break;
				default:
					System.out.println("La opción elegida no es correcta");
				}
			}
			while(opcionElegida != 0);
			
		}  catch (ErrorException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}

	private static void insertarPersona() throws ErrorException {
		Boolean personaInsertada = false;
		do {
			Persona personaNew = new Persona();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("Dame los datos de una persona nueva para insertar:");
			System.out.println("Dime el dni");
			personaNew.setDni(sc.nextLine());
			System.out.println("Dime el nombre");
			personaNew.setNombre(sc.nextLine());
			System.out.println("Dime el apellido");
			personaNew.setApellido(sc.nextLine());
			System.out.println("Dime la fecha (dd/MM/yyyy)");
			personaNew.setFechaNacimiento(LocalDate.parse(sc.nextLine(), format));
			try {
				personaNew.validar();
				service.insertarPersona(personaNew);
				personaInsertada = true;
				System.out.println("Persona insertada!!");
			}
			catch(DatosIncompletosException e) {
				System.out.println(e.getMessage());
			}
		}
		while(!personaInsertada);
		
	}

	private static void buscarPorFiltro() throws  ErrorException {
		try {
			System.out.println("Dime un filtro para buscar personas:");
			String filtro = sc.nextLine();
			List<Persona> resultados = service.consultarPersona(filtro);
			System.out.println("Personas encontradas:");
			for (Persona p : resultados) {
				System.out.println(p);
			}
		}
		catch(PersonaNoExisteException e) {
			System.out.println("No hay personas con ese filtro");
		}
		
	}

	private static void consultarPorDni() throws ErrorException, PersonaNoExisteException {
		Persona persona = null;
		do {
			
			System.out.println("Dime qué DNI quieres consultar:");
			String dni = sc.nextLine();
			try {
				persona = service.consultarPersona(dni);
			} catch (NoExistePersonaException e) {
				
				e.printStackTrace();
			}
			System.out.println("Esta es la persona que buscas");
			System.out.println(persona);
		}
		while(persona == null);
		
	}

	private static Integer mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("\t1. Consultar por DNI");
		System.out.println("\t2. Consultar por filtro");
		System.out.println("\t3. Insertar nueva persona");
		System.out.println("\t0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

}



