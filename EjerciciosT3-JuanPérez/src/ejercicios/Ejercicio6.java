package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
		//0 ejecuciones de bucle: VALOR: numeroIntroducido: 0 
		// RESULTADO ESPERADO: Finalizacion del programa  
		// RESULTADO OBTENIDO: Finalizacion del programa 
	
		//1 ejecucion de bucle: VALOR: numeroIntroducido: 1  
		// RESULTADO ESPERADO: 1
		// RESULTADO OBTENIDO: 1
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 2  
		// RESULTADO ESPERADO: 
		//1
		//22
	
		// RESULTADO OBTENIDO:
		//1
		//22
		    
		//Valor intermedio de ejecuciones de bucle:  No se puede hacer VALOR:  / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro la variable donde guardare el numeroIntroducido por el usuario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numero entero al usuario
		System.out.print("Introduzca un numero entero entre 0 y 20: ");
		
		//Asigno valor a variable numeroIntroducido mediante uso de Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion que dara mensaje de error al introducir un numero  fuera del rango [0,20]
		if ((numeroIntroducido<0) && (numeroIntroducido>20)) {
			System.out.print("Error, introduzca un numero entero entre 0 y 20: ");
			
		//De introducir numero entero entre 0 y 20 entro en el bucle
		} else {
		
			//Bucle para aumentar valor de i, nos dira el numero a imprimir y imprimira salto de linea al final de iteracion
			//Valor inicial de i igual a 1
			//Establezco de condicion i menor o igual a numeroIntroducido para imprimir tantos saltos de linea 
			//como el numero introducido y aumentar el valor de i hasta el numero introducido
			//Incremento de i igual a +1
			for (int i=1; i<=numeroIntroducido; i++) {
			
				//Bucle para aumentar valor de e que nos dira cuantas veces imprimir i en la misma linea
				//Valor inicial de e igual a +1
				//Establezco de condicion e menor o igual a i para imprimir la variable i tantas veces como la diferencia entre i-e
				//Incremento de e igual a +1
				for (int e=1; e<=i; e++) {
				
				//mensaje por pantalla con valor de variable i
				System.out.print(i);
				}
				//salto de linea en pantalla
				System.out.println();
				}
			}
		
		//Cierro Scanner
		dogma.close();
	}

}
