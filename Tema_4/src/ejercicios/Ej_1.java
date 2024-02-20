package ejercicios;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = " Hola a todos ";
		String fraseMayusculas = getMayusculas(frase);
		System.out.println(fraseMayusculas);
	}
	public static String getMayusculas(String frase) {
		String aMayuscula = frase.trim().toUpperCase();
		return aMayuscula;
	}
}
