package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	
		//0 ejecuciones de bucle: VALOR: imposible hacer numeroIntroducido no puede ser menor que 1 
		//(1 valor inicial de i en bucle) 
		// RESULTADO ESPERADO: 
		// RESULTADO OBTENIDO: 
	    
		//1 ejecucion de bucle: VALOR: numeroIntroducido: 3 
		// RESULTADO ESPERADO: 1
		// RESULTADO OBTENIDO: 1
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 100
		// RESULTADO ESPERADO: 3
		// RESULTADO OBTENIDO: 3
		    
		//Valor intermedio de ejecuciones de bucle:  No se puede hacer VALOR: / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro la variable donde guardare el numeroIntroducido por el ususario
		int c=0;//Declaro la variable donde guardare la cantidad de digitos que tiene el numero
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numero mayor que 0 al usuario mediante mensaje por pantalla
		System.out.print("Introduzca un numero mayor a 0: ");
		
		//Asigno valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion numeroIntroducido menor o igual a 0
		if (numeroIntroducido<=0) {
			//De cumplirse la condicion imprimo mensaje por pantalla
			System.out.print("Error, introduzca un numero mayor a 0: ");
			
			//De no cumplire la condicion continuo con la ejeccuion del programa
		} else {
			
			//Creo bucle para calcular los digitos que tiene el numeroIntroducido
			//declaro variable i y la inicializo con valor 1
			//establezco condicion i menor o igual a numeroIntroducido 
			//sumo i*10 a i en cada iteracion
			for (int i=1; i<=numeroIntroducido; i*=10) {
				
				//sumo +1 a variable c en cada iteracion
				c++;
			}
			//imprimo el valor de c por pantalla
			System.out.print(c);
		}
		
		//Cierro Scanner
		dogma.close();
	}

}
