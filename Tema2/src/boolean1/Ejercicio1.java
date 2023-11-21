package boolean1;

import java.util.Scanner;

public class Ejercicio1  {


	public static void main(String[] args) {
		//Realizar un programa que pregunte por el año de nacimiento del usuario. Según lo que nos indique, mostrarle por consola a qué generación pertenece según este cuadro
         System.out.println("Dime tu año de nacimiento");
         Scanner sc = new Scanner(System.in);
         Integer año = sc.nextInt();
         
         if (año >= 1883 && año < 1900 ) {
        	 System.out.println("Perteneces a la gerenarion perdida");
         }
         
         if (año >= 1901 && año <1927) {
        	 System.out.println("Perteneces a la generacion grandiosa");
         }	 
         if (año >= 1928 && año <1945) {
        	 System.out.println("Perteneces a la generacion silenciosa");
         }
         
         if (año >= 1946 && año < 1964 ) {
        	 System.out.println("Perteneces a la Baby Boomers");
         }
         
         if (año >= 1965 && año < 1980)  {
        	 System.out.println("Perteneces a la generacion X");
         }
         
         if (año >= 1981 && año < 1996)  {
        	 System.out.println("Perteneces a la generacion Y");
         }
         
         if (año >= 1997 && año < 2012 ) {
        	 System.out.println("Perteneces a la generacion Z");
         }
         
         if (año >= 2010 && año < 2020)  {
        	 System.out.println("Perteneces a la genracion Alfa");
         }
         
         sc.close();
         
	}
	
}
         
	
