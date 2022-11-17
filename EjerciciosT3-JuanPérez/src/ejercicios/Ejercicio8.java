package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
		//0 ejecuciones de bucle: VALOR: numeroIntroducido: 0 
		// RESULTADO ESPERADO: 
		//Total de numeros introducidos: 0
		//Numeros fallados: 0
		// RESULTADO OBTENIDO:
		//Total de numeros introducidos: 0
		//Numeros fallados: 0

		//1 ejecucion de bucle: VALOR: numeroIntroducido: 2 numeroIntroducido: 0 
		// RESULTADO ESPERADO: 
		//Total de numeros introducidos: 1
		//Numeros fallados: 0
		// RESULTADO OBTENIDO: 
		//Total de numeros introducidos: 1
		//Numeros fallados: 0
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 2 numeroIntroducido: 3 numeroIntroducido: 0
		// RESULTADO ESPERADO: 
		//Total de numeros introducidos: 2
		//Numeros fallados: 0
		// RESULTADO OBTENIDO: 
		//Total de numeros introducidos: 2
		//Numeros fallados: 0
		
		//Valor intermedio de ejecuciones de bucle:  No se puede hacer VALOR:  / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:

	public static void main(String[] args) {

		int numeroIntroducido;//Declaro la variable donde guardare el numeroIntroducido por el ususario
		
		int numeroMayor=0;//Declaro variable en la que guardare el valor de numeroIntroducido 
		//mas alto y la inicializo con valor 0
		
		int k=-1; //Declaro variable en la que guardare el total de números introducidos, excluido el 0
		// y la inicializo con valor -1 para descontar de antemano el +1 de introducir el 0 para finalizar el programa
		
		int c=0; //Declaro variable en la que guardare el total de números fallados
		// y la inicializo con valor 0
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Doy instrucciones al usuario  mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero inicial para iniciar el programa o 0 para finalizarlo: ");
		
			//Creo do con su bloque de instrucciones que se ejecutara al menos una vez
			do {
				
				//Solicito numero al usuario mediante mensaje por pantalla
				System.out.print("Introduzca un numero: ");
				
				//Asigno valor a variable numeroIntroducido mediante uso del Scanner
				numeroIntroducido = dogma.nextInt();
				
				//Sumo +1 a variable k cada vez que introduzco un numero
				k++;
				
				//Establezco condiciones: 
				//numeroIntroducido menor o igual a numeroMayor (ha introducido un numero menor que el anterior)
				
				//numeroMayor distinto a 0 (dado que inicializo variable numeroMayor con valor 0 para poder usarla en el bucle,
				//lo cual crea un problema al comprobar la condicion anterior en la primera iteracion del bucle)
				
				//numeroIntroducido distinto a 0 (porque al darse la comprobacion del while al final de la iteracion despues 
				//de el if ejecuta el bloque de instrucciones imprimiendo por pantalla: Fallo, es menor.
				//una vez mas de lo deseado antes de de salir del bucle
				if ((numeroIntroducido<=numeroMayor) && (numeroMayor!=0) && (numeroIntroducido!=0)) {
					
					//De cumplirse las condiciones anteriores imprimo mensaje por pantalla
					//indicando que el numero introducido es menor al anterior numero introducido
					System.out.println("Fallo, es menor. ");
					
					//De cumplirse las condiciones anteriores sumo +1 a variable c
					c++;
				}  
				//Doy a variable numeroMayor el valor del ultimo numero Introducido
				numeroMayor = numeroIntroducido;
				
			// Establezo condicion numeroIntroducido distinto a 0 que ha de darse para mantener el bucle en ejecucion, 
			} while (numeroIntroducido!=0);
			
			//imprimo mensaje por pantalla mostrando los numeros introducidos
			System.out.println("Total de numeros introducidos: " + k);
			
			//imprimo mensaje por pantalla mostrando los numeros fallados
			System.out.println("Numeros fallados: " + c);
		
		//Cierro Scanner
		dogma.close();
	}

}
