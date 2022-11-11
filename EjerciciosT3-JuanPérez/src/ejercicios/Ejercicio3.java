package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroIntroducido;

		String asterisco="",espacio="";
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero que representara la base y la altura del triangulo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		for (int i=0; i<=numeroIntroducido; i++) {
			
			System.out.println("");
			
			System.out.println(asterisco);
			
			asterisco+="* "; 
			//espacio+=" ";
		}

		dogma.close();

	}

}
