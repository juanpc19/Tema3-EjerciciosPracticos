package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {


		int numeroIntroducido;//Declaro variable en la que guardare el numero introducido por el usuario
		
		int k=0; //Declaro variable y la inicializo a 0, guardare en ella el valor del contador de numeros primos
				
		boolean esPrimo;
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		// Pido un número entero positivo al usuario por pantalla
		System.out.println("Introduzca un numero entero positivo hasta el que analizar desde uno"
				+ " para determinar cuantos numero primos hay en dicho rango:");
		
		//Doy valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		// Establezco condicion numeroIntroducido mayor que 0 (el número introducido es positivo)
		if (numeroIntroducido > 0) {
			
			
			//bucle para sumar 1 al numero a comprobar
			
			// Recorremos los números desde 2 (el primer numero que puede ser primo) hasta numeroIntroducido 
			for (int i=2; i <= numeroIntroducido; i++) {
				//Establezco valor para variable booleana esPrimo en true al inicio de cada iteracion del bucle principal
				esPrimo=true;
				
				//bucle para comprobar si es o no primo
				for (int j=2; j<i; j++) {
				
				// Si el número es divisible por i (dando resto 0) deja de ser primo y variable esPrimo pasa a ser false
				if (i % j == 0) {
					 esPrimo = false;
					 
					 //en cuyo caso hago break para salir del bucle y evitar iteraciones innecesarias
					 break;
					}
				
				}//Cierro el for que determina si no es primo
				
				// Si variable esPrimo sigue siendo true añado +1 a variable k usada como contador
				if (esPrimo) {
					k++;
					}
				
			}
			
			//Al finalizar el bucle imprimo mensaje por pantalla indicando la cantidad de numeros primos con variable k
			System.out.println("Hay " + (k) + " numeros primos en ese rango.");
			

			//De no ser variable numeroIntroducido mayor a 0 imprimo mensaje por pantala diciendole al usuario
			//que no ha introducido un numero entero positivo
		} else {
			System.out.println("No ha introducido un entero positivo");
		}

		//Cierro Scanner
		dogma.close();

	}

}
