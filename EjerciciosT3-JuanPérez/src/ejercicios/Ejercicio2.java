package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	//0 ejecuciones de bucle: VALOR: numeroIntroducido: 1 
	// RESULTADO ESPERADO: Hay 0 numeros primos desde 1 hasta el numero introducido.  
	// RESULTADO OBTENIDO: Hay 0 numeros primos desde 1 hasta el numero introducido.
    
	//1 ejecucion de bucle: VALOR: numeroIntroducido: 2  
	// RESULTADO ESPERADO: Hay 1 numeros primos desde 1 hasta el numero introducido.
	// RESULTADO OBTENIDO: Hay 1 numeros primos desde 1 hasta el numero introducido.
	    
	//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 20  
	// RESULTADO ESPERADO: Hay 8 numeros primos desde 1 hasta el numero introducido
	// RESULTADO OBTENIDO: Hay 8 numeros primos desde 1 hasta el numero introducido
	    
	//Valor intermedio de ejecuciones de bucle: No se puede VALOR:  / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:


	public static void main(String[] args) {


		int numeroIntroducido;//Declaro variable en la que guardare el numero introducido por el usuario
		
		int k=0; //Declaro variable y la inicializo a 0, guardare en ella el valor del contador de numeros primos
				
		boolean esPrimo; //Declaro variable en la que guardare si primo es true o false
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		// Pido un número entero positivo al usuario por pantalla
		System.out.println("Introduzca un numero entero positivo: ");
		
		//Doy valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		// Establezco condicion numeroIntroducido mayor que 0 (el número introducido es positivo)
		if (numeroIntroducido > 0) {
			
			
			//bucle para sumar 1 al numero a comprobar
			//declaro variable i y la inicializo con valor 2
			//establezco de condicion de bucle i menor o igual que numero introducido 
			//establezco el incremento en i+1
			// Recorremos los números desde 2 (el primer numero que puede ser primo) hasta numeroIntroducido 
			for (int i=2; i <= numeroIntroducido; i++) {
				//Establezco valor para variable booleana esPrimo en true al inicio de cada iteracion del bucle principal
				esPrimo=true;
				
				//bucle para comprobar que no es primo
				//declaro variable j y la inicializo con valor 2
				//establezco de condicion de bucle j menor que i
				//establezco el incremento en i+1
				for (int j=2; j<i; j++) {
				
				// Si el número es divisible por i (dando resto 0) deja de ser primo y variable esPrimo pasa a ser false
				if (i % j == 0) {
					 esPrimo = false;
					 
					 //en cuyo caso hago break para salir del bucle y evitar iteraciones innecesarias
					 break;
					}
				
				}//Cierro el for que determina si no es primo
				
				// Si variable esPrimo sigue siendo true añado +1 a variable k usada como contador
				if (esPrimo==true) {
					k++;
					}
				
			}
			
			//Al finalizar el bucle imprimo mensaje por pantalla indicando la cantidad de numeros primos con variable k
			System.out.println("Hay " + (k) + " numeros primos desde 1 hasta el numero introducido.");
			

			//De no ser variable numeroIntroducido mayor a 0 imprimo mensaje por pantalla diciendole al usuario
			//que no ha introducido un numero entero positivo
		} else {
			System.out.println("No ha introducido un numero entero positivo.");
		}

		//Cierro Scanner
		dogma.close();

	}

}
