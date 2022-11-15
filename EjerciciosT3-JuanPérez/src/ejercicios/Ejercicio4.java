package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numeroA; //Declaro variable en la que guardare el numero A
		
		int numeroB; //Declaro variable en la que guardare el numero B
		
		int numeroMenor=0; //Declaro variable en la que guardare el numero mas pequeño, A o B
		
		int mcd=0;  //Declaro variable en la que guardare el minimo comun divisor
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numeroA al usuario
		System.out.print("Introduzca un valor para numero A: ");
		
		//Asigno el valor dado por el usuario a la variable numeroA mediante el Scanner
		numeroA = dogma.nextInt();
		
		//Solicito numeroB al usuario
		System.out.print("Introduzca un valor para numero B: ");
		
		//Asigno el valor dado por el usuario a la variable numeroB mediante el Scanner
		numeroB = dogma.nextInt();
		
		//Establezco condicion numeroA menor que numeroB que de cumplirse dara a variable numeroMenor el valor de variable numeroA
		if (numeroA<numeroB) {
			
			numeroMenor=numeroA;
			
			//Establezco condicion numeroB menor que numeroA que de cumplirse dara a variable numeroMenor el valor de variable numeroB
		} else if (numeroB<numeroA) {
			
			numeroMenor=numeroB;
		}
		
		//Creo bucle que ira dando de forma decreciente valor a variable i
		//Declaro e Inicializo variable i con valor igual a variable numeroMenor
		//Establezco de condicion i mayor que 0 
		//Doy al incremento un valor de -1
		for (int i=numeroMenor; i>0; i--) {
			
			//Establezco de condicion si resto de division de variable numeroA entre variable i igual a 0 y
			//resto de division de variable numeroA entre variable i igual a 0
			//le doy a variable mcd valor igual a variable i y hago break para evitar iteraciones innecesarias
			if ((numeroA%i==0) && (numeroB%i==0)) {
				mcd=i;
				break;
					}
				}
		
		//Imprimo mensaje por pantalla mostrando el minimo comun divisor con variable mcd
			System.out.print("El máximo común divisor es: " + mcd);
			
		//Cierro Scanner
		dogma.close();

	}

}
