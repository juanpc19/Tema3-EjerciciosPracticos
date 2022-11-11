package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {


		int numeroIntroducido, j=0;//Declaro variable en la que guardare el numero introducido por el usuario

		boolean esPrimo = true;//Declaro variable con la que determino si el número es primo o no 
		//y la inicializo con valor true por defecto suponiendo que si es primo y dejo al bucle que cambie a false de no ser primo

		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		// Pido un número entero positivo al usuario por pantalla
		System.out.println("Introduzca un numero entero positivo hasta el que analizar desde uno"
				+ " para determinar cuantos numero primos hay en dicho rango:");
		
		//Doy valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();

		// Establezco condicion numeroIntroducido mayor que 0 (el número introducido es positivo)
		if (numeroIntroducido > 0) {
			
			// Recorremos los números desde 2 hasta numeroIntroducido -1 (ya que el mismo si seria divisible)
			for (int i=2, k=numeroIntroducido-1; i < numeroIntroducido; i++) {
				
				// Si el número es divisible por i (dando resto 0) deja de ser primo
				if (numeroIntroducido % i == 0) {
				
					k--; 
					
			}
				j=k;	
			}
			
			System.out.println("Hay " + j + " numeros primos en ese rango.");
			

			//De no cumplirse lo anterior imprimo mensaje por pantala diciendole al usuario
			//que no ha introducido un numero entero positivo
		} else {
			System.out.println("No ha introducido un entero positivo");
		}

		//Cierro Scanner
		dogma.close();

	}

}
