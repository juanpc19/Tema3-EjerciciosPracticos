package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
		//0 ejecuciones de bucle: VALOR: numeroIntroducido: 0 
		// RESULTADO ESPERADO: Finalizacion del programa  
		// RESULTADO OBTENIDO: Finalizacion del programa  
	    
		//1 ejecucion de bucle: VALOR: numeroIntroducido: 1  
		// RESULTADO ESPERADO:*
		// RESULTADO OBTENIDO:*
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 5  
		// RESULTADO ESPERADO:   
	    //* 
	   //* * 
	  //* * * 
	 //* * * * 
    //* * * * * 
		// RESULTADO OBTENIDO:    
	    //* 
	   //* * 
	  //* * * 
	 //* * * * 
    //* * * * * 
	
	//Valor intermedio de ejecuciones de bucle: VALOR: No se puede hacer 

	public static void main(String[] args) {

		int numeroIntroducido; //Declaro variable donde guardare el numero introducido por el usuario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito un numero al usuario
		System.out.print("Introduzca un numero positivo que representara la base y la altura del triangulo: ");
		
		//Asigno el valor dado por el usuario a la variable numeroIntroducido mediante el Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion que dara mensaje de error al introducir un numero no positivo
		if (numeroIntroducido<0) {
			System.out.print("Error, Introduzca un numero igual o mayor que 0.");
			
		//De ser el numero introducido positivo entro en  el bucle
		} else {
		
		//Creo un for para hacer salto de linea, se completa tras finalizar los bucles dentro de el.
		//valor inicial de variable i igual a 1 (1=primera linea o print).
		//cuenta desde 1 hasta el numeroIntroducido.
		//suma +1 a variable i en cada iteracion.
		for (int i=1; i<=numeroIntroducido; i++) {

			//for para añadir espacio, añade uno por iteracion, hace todas las iteraciones posibles antes de salir del bucle.
			//valor inicial de e igual a i, antes de completar primera iteracion de bucle .
			//cuenta desde e hasta un numero antes del numeroIntroducido,
			//imprimiendo espacio un numero de veces igual al numeroIntroducido-1.
			//añade +1 a variable e al final de iteracion.
			for (int e=i; e<numeroIntroducido; e++) {
				System.out.print(" ");
				}
			
			//for para añadir asterisco, añade uno por iteracion, hace todas las iteraciones posibles antes de salir del bucle.
			//valor inicial de e igual a 1.
			//cuenta desde e hasta i,
			//imprimiendo asterisco un numero de veces igual a i.
			//añade +1 a variable e al final de iteracion.
			for (int e=1; e<=i; e++) {
			
			System.out.print("* ");
		
			}
			
		System.out.println("");
		
			}
		}
		//Cierro Scanner
		dogma.close();

	}

}
