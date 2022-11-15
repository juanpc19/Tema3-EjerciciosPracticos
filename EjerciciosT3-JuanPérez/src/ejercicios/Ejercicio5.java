package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numeroA;//Declaro variable en la que guardare el numero A
		
		int numeroB;//Declaro variable en la que guardare el numero B
		
		int numeroMayor=0; //Declaro variable en la que guardare el numero mas pequeño, A o B
		
		int numeroMenor=0;  //Declaro variable en la que guardare el numero mas pequeño, A o B
		
		int mcm=0;  //Declaro variable en la que guardare el minimo comun multiplo
		
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
		//Establezco de condicion i mayor que 0 
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
		
		//Imprimo mensaje por pantalla mostrando el minimo comun multiplo con variable mcm
			System.out.print("El minimo comun multiplo es: " +mcm);
			
		//Cierro Scanner
		dogma.close();


	}

}
