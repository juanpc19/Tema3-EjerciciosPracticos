package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
			//0 ejecuciones de bucle: VALOR: numeroA: 5 numeroB: 5
			// RESULTADO ESPERADO: El minimo comun multiplo es: 0
			// RESULTADO OBTENIDO: El minimo comun multiplo es: 0
		    
			//1 ejecucion de bucle: VALOR: numeroA: 10 numeroB: 5
			// RESULTADO ESPERADO: El minimo comun multiplo es: 10
			// RESULTADO OBTENIDO: El minimo comun multiplo es: 10
			    
			//Maximo de ejecuciones de bucle: No se puede hacer, es bucle infinito por lo que no puede tener iteraciones maximas
			// RESULTADO ESPERADO: 
			// RESULTADO OBTENIDO: 
			    
			//Valor intermedio de ejecuciones de bucle: VALOR: numeroA: 4 numeroB: 6
			// RESULTADO ESPERADO: El minimo comun multiplo es: 12
			// RESULTADO OBTENIDO: El minimo comun multiplo es: 12


	public static void main(String[] args) {

		int numeroA;//Declaro variable en la que guardare el numero A
		
		int numeroB;//Declaro variable en la que guardare el numero B
		
		int numeroMayor=0; //Declaro variable en la que guardare el numero mas pequeño,
		//A o B y la inicializo con valor 0
		
		int numeroMenor=0; //Declaro variable en la que guardare el numero mas pequeño,
		//A o B y la inicializo con valor 0
		
		int mcm=0; //Declaro variable en la que guardare el minimo comun multiplo y la inicializo con valor 0
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numeroA al usuario
		System.out.print("Introduzca un valor para numero A: ");
		
		//Asigno el valor dado por el usuario a la variable numeroA mediante el Scanner
		numeroA = dogma.nextInt();
		
		//Solicito numeroB al usuario
		System.out.print("Introduzca un valor para numero B: ");
		
		//Asigno el valor dado por el usuario a la variable numeroA mediante el Scanner
		numeroB = dogma.nextInt();
		
		//Establezco condicion que dara mensaje de error al introducir un numero no positivo
		//para variable numeroA o para variable numeroB
		if ((numeroA<=0) || (numeroB<=0)) {
			System.out.print("Error introduzca un numero positivo para numeroA y para numeroB: ");
			
		//De introducir numeros positivos para ambas variables entra en el bucle
		} else {
			
		//Establezco de condicion si numeroA menor que numeroB
		if (numeroA<numeroB) {
				
				//De cumplirse dara a numeroMayor el valor de numeroB
				numeroMayor=numeroB;
				//Y a numeroMenor el valor de numeroA
				numeroMenor=numeroA;
			
			//Establezco de condicion si numeroB menor que numeroA
			} else if (numeroB<numeroA) {
				
				//De cumplirse dara a numeroMayor el valor de numeroA
				numeroMayor=numeroA;
				//Y a numeroMenor el valor de numeroB
				numeroMenor=numeroB;
			}
			
		//Creo bucle para aumentar valor de i
		//Declaro e Inicializo variable i con valor igual a variable numeroMayor
		//Establezco de condicion i mayor que 0 para hacer iteraciones infinitas a menos que haga break
		//Doy al incremento un valor de +1
		for (int i=numeroMayor; i>0; i++) {
			
			//Establezco de condicion si resto de division de variable i entre variable numeroMayor igual a 0 y
			//resto de division de variable i entre variable numeroMenor igual a 0
			//le doy a variable mcm valor igual a variable i y hago break para evitar iteraciones innecesarias
			if ((i%numeroMayor==0) && (i%numeroMenor==0)) {
				mcm=i;
				break;
					}
				}
		}
		//Imprimo mensaje por pantalla mostrando el minimo comun multiplo con variable mcm
		System.out.print("El minimo comun multiplo es: " +mcm);
			
		//Cierro Scanner
		dogma.close();


	}

}
