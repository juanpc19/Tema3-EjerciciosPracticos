package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	//0 ejecuciones de bucle: imposible hacer
	// RESULTADO ESPERADO:  
	// RESULTADO OBTENIDO:
    
	//1 ejecucion de bucle: VALOR: numeroIntroducido: 1  
	// RESULTADO ESPERADO: 1
	// RESULTADO OBTENIDO: 1
	    
	//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 5  
	// RESULTADO ESPERADO:
	//1
	//121
	//12321
	//1234321
	//123454321

	// RESULTADO OBTENIDO: 
	//1
	//121
	//12321
	//1234321
	//123454321
	    
	//Valor intermedio de ejecuciones de bucle:  No se puede hacer VALOR:  / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro la variable donde guardare el numeroIntroducido por el ususario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numero entero al usuario
		System.out.print("Introduzca un numero entero positivo: ");
		
		//Asigno valor a variable numeroIntroducido mediante uso de Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion que dara mensaje de error al introducir un numero menor o igual que 0
		if (numeroIntroducido<=0) {
			System.out.print("Error, introduzca un numero entero positivo: ");
			
		//De introducir numero entero positivo entro en el bucle
		} else {
			
		//Bucle para aumentar valor de i, imprimira salto de linea al final de iteracion
		//Valor inicial de i igual a 1
		//Establezco de condicion i menor o igual a numeroIntroducido para imprimir saltos de linea
		//hasta que i tenga el valor del numero Introducido y aumentar el valor de i hasta el numero introducido
		//Incremento de i igual a +1
		for (int i=1; i<=numeroIntroducido; i++) {
			
			//Bucle para aumentar valor de e, imprimira el valor de e en cada iteracion en la misma linea
			//hasta imprimir un valor igual a numeroIntroducido
			//Valor inicial de e igual a 1
			//Establezco de condicion e menor o igual a i para imprimir e tantas veces como el valor de numeroIntroducido
			//y aumentar el valor de e hasta el numero introducido
			//Incremento de e igual a +1
			for (int e=1; e<=i; e++) {
				System.out.print(e);
			}
				//Bucle para disminuir valor de e, imprimira el valor de e en cada iteracion en la misma linea
				//hasta imprimir un valor igual a 1
				//Valor inicial de e igual a i -1 (uno menos que numeroIntroducido)
				//Establezco de condicion e mayor a 0 para disminuir valor de e hasta 1
				//Disminucion de e igual a -1
				for (int e=i-1; e>0; e--) {
					
				//mensaje por pantalla con valor de variable e
				System.out.print(e);
				}
				//salto de linea en pantalla
				System.out.println();
			}
		}
		
		dogma.close();
		

	}

}
