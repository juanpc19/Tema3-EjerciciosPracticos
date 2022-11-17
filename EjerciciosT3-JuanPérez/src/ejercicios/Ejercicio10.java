package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	
		//0 ejecuciones de bucle: VALOR: numeroIntroducido: 0 
		// RESULTADO ESPERADO: El numero es capicua.
		// RESULTADO OBTENIDO: El numero es capicua.
	    
		//1 ejecucion de bucle: VALOR: numeroIntroducido: 1  
		// RESULTADO ESPERADO: El numero es capicua.
		// RESULTADO OBTENIDO: El numero es capicua.
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroIntroducido: 353 
		// RESULTADO ESPERADO: El numero es capicua.
		// RESULTADO OBTENIDO: El numero es capicua.
		    
		//Valor intermedio de ejecuciones de bucle: No se puede hacer VALOR:  / RESULTADO ESPERADO:  / RESULTADO OBTENIDO:

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro variable donde guardare el numero introducido por el usurio
		
		int auxiliar;//Declaro variable que usare como copia de numero introducido
		//para usar el valor que tiene numero introducido sin modificar la variable numeroIntroducido
		
		int cifra=0;//Declaro variable donde guardare la cifra del auxiliar%10
		
		int inverso=0;//Declaro la variable donde guardare las cifras para crear el numeroIntroducido de forma inversa
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numero al usuario mediante mensaje por pantalla
		System.out.print("Introduzca un numero: ");
		
		//Asigno valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion si numeroIntroducido menor que 0
		if (numeroIntroducido<0) {
			
			//Que de cumplirse imprimira mensaje de error por pantalla
			System.out.print("Error, Introduzca un numero igual o mayor que 0: ");
			
			//De no cumplirse la condicion continuo con la ejecucion del programa
		} else {
		
			//Doy a variable auxiliar el valor de numeroIntroducido
			auxiliar = numeroIntroducido;
			
			//Creo bucle while con condicion auxiliar mayor a 0
			while (auxiliar>0) {
				
			//Doy a variable cifra un valor igual a resto de variable auxiliar dividido entre 10
			//Extrae la ultima cifra de auxiliar
			cifra = auxiliar%10;
			
			//Doy valor a variable inverso igual a multipliplicacion de variable inverso por 10 mas variable cifra
			//Añade cifra a inverso
			inverso = inverso*10 + cifra;
			
			//Doy valor a variable auxiliar igual a variable auxiliar dividido entre 10
			//Da nuevo valor a auxiliar para extraer siguiente cifra o finalizar bucle
			auxiliar = auxiliar/10;
			}
			
			//Establezco la concicion numeroIntroducido igual a inverso
			if (numeroIntroducido==inverso) {
				//Que de cumplirse imprime mensaje por pantalla diciendo que el numero es capicua
				System.out.print("El numero es capicua. ");
				
				//Que de no cumplirse imprime mensaje por pantalla diciendo que el numero no es capicua
			} else {
				System.out.print("El numero no es capicua. ");
				
				}
			//Cierro Scanner
			dogma.close();

		}

	}

}
