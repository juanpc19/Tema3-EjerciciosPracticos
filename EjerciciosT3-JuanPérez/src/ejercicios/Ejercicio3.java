package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero que representara la base y la altura del triangulo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		//For para haecr salto de linea, se completa al finalizar los bucles dentro de el
		//valor inicial de variable i igual a 1 (1=primera linea o print)
		//cuenta desde 1 hasta el numeroIntroducido
		//suma +1 a variable i en cada iteracion
		for (int i=1; i<=numeroIntroducido; i++) {

			//for para añadir espacio, añade uno por iteracion, hace todas las iteraciones posibles antes de salir del bucle
			//valor inicial de e igual a i, para introducir  antes de completar iteracion de bucle 
			//cuenta desde e hasta un numero antes del numeroIntroducido,
			//imprimiendo espacio un numero de veces igual al numeroIntroducido-1
			//añade +1 a varaible e al final de iteracion
			for (int e=i; e<numeroIntroducido; e++) {
				System.out.print(" ");
				}
			
			//for para añadir asterisco, añade uno por iteracion, hace todas las iteraciones posibles antes de salir del bucle
			//valor inicial de e igual a i, para introducir  antes de completar iteracion de bucle 
			//cuenta desde e hasta un numero antes del numeroIntroducido,
			//imprimiendo espacio un numero de veces igual al numeroIntroducido-1
			//añade +1 a varaible e al final de iteracion
			for (int e=1; e<=i; e++) {
			
			System.out.print("* ");
		
			}
			
		System.out.println("");
		
		}
		
		dogma.close();

	}

}
