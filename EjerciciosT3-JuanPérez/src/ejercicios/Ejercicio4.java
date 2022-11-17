package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
		//0 ejecuciones de bucle: VALOR: numeroA: 5 numeroB: 5
		// RESULTADO ESPERADO: El máximo común divisor es: 0
		// RESULTADO OBTENIDO: El máximo común divisor es: 0
	    
		//1 ejecucion de bucle: VALOR: numeroA: 10 numeroB: 5
		// RESULTADO ESPERADO: El máximo común divisor es: 5
		// RESULTADO OBTENIDO: El máximo común divisor es: 5
		    
		//Maximo de ejecuciones de bucle: VALOR: numeroA: 4 numeroB: 81
		// RESULTADO ESPERADO: El máximo común divisor es: 1
		// RESULTADO OBTENIDO: El máximo común divisor es: 1
		    
		//Valor intermedio de ejecuciones de bucle: VALOR: numeroA: 4 numeroB: 6
		// RESULTADO ESPERADO: El máximo común divisor es: 2
		// RESULTADO OBTENIDO: El máximo común divisor es: 2

	public static void main(String[] args) {
		
		int numeroA; //Declaro variable en la que guardare el numero A
		
		int numeroB; //Declaro variable en la que guardare el numero B
		
		int numeroMenor=0; //Declaro variable en la que guardare el numero mas pequeño,
		// A o B y la inicializo con valor 0
		
		int mcd=0;  //Declaro variable en la que guardare el minimo comun divisor
		// y la inicializo con valor 0 
		
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
		
		//Establezco condicion que dara mensaje de error al introducir un numero no positivo
		//Para variable numeoA o para variable numeroB
		if ((numeroA<=0) || (numeroB<=0)) {
			System.out.print("Error introduzca un numero positivo para numeroA y para numeroB: ");
			
		//De introducir numeros positivos para ambas variables entra en el bucle
		} else {
		
		//Establezco condicion numeroA menor que numeroB que de cumplirse dara a variable numeroMenor el valor de variable numeroA
		if (numeroA<numeroB) {
			
			numeroMenor=numeroA;
			
		//Establezco condicion numeroB menor que numeroA que de cumplirse dara a variable numeroMenor el valor de variable numeroB
		} else if (numeroB<numeroA) {
			
			numeroMenor=numeroB;
		}
		
		//Creo bucle que ira dando de forma decreciente valor a variable i
		//Declaro e Inicializo variable i con valor igual a variable numeroMenor
		//Establezco de condicion i mayor que 0 para hacer iteraciones infinitas a menos que haga break
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
		}
		//Imprimo mensaje por pantalla mostrando el minimo comun divisor con variable mcd
		System.out.print("El máximo común divisor es: " + mcd);
			
		//Cierro Scanner
		dogma.close();

	}

}
