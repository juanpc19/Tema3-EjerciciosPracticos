package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int horas;//Declaro variable donde guardare las horas
		
		int minutos;//Declaro variable doned guardare los minutos
		
		int segundos;//Declaro varible donde guardare los segundos
		
		int incrementoSegundos;//Declaro variable donde guardare los segundos incrementados 
		
		//Creo el Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario un valor para variable horas
		System.out.print("Introduzca las horas: ");
		
		//Asigno a variable horas un valor mediante uso del Scanner
		horas = dogma.nextInt();
		
		//Solicito al usuario un valor para variable minutos
		System.out.print("Introduzca los minutos: ");
		
		//Asigno a variable minutos un valor mediante uso del Scanner
		minutos = dogma.nextInt();
		
		//Solicito al usuario un valor para variable segundos
		System.out.print("Introduzca los segundos: ");
		
		//Asigno a variable segundos un valor mediante uso del Scanner
		segundos = dogma.nextInt();
		
		//Solicito al usuario un valor para variable incrementoSegundos
		System.out.print("En cuantos segundos desea incrementar la hora?");
		
		//Asigno a variable incrementoSegundos un valor mediante uso del Scanner
		incrementoSegundos = dogma.nextInt();
		
		//Creo un bucle para extraer los segundos de incrementoSegundos
		
		//No doy valor inicial a la variable que usara el bucle (incrementoSegundos)
		//porque ya tiene su valor dado por el usuario
		
		//Establezco condicion incrementoSegundos mayor que 0 que mantendra al bucle en ejecucion mientras se cumpla
		
		//Doy al decremento de variable incrementoSegundos un valor de -1 
		//que restaraal final de iteracion a variable incrementoSegundos
		for (; incrementoSegundos>0;  incrementoSegundos--) {
			
			//Sumo  +1 a segundos en cada iteracion
			segundos++;
			
			//Establezco condicion si segundos igual a 60 
			if (segundos==60) {
				//De cumplirse la condicion anterior dara a segundos un valor igual a 0
				segundos=0;
				//De cumplirse la condicion anterior sumara a minutos +1
				minutos++;
				
			}
			//Establezco condicion si minutos mayor a 59
			if (minutos>59) {
				//De cumplirse la condicion anterior dara a minutos un valor igual a 0
				minutos=0;
				//De cumplirse la condicion anterior sumara a horas +1
				horas++;
			
			}
			//Establezco condicion si horas mayor a 23
			 if (horas>23) {
				//De cumplirse la condicion anterior doy a horas valor igual a 0
				horas=0;
			}
		}
			
		//Imprimo mensaje por pantalla 
		System.out.print("La nueva hora es: " + horas + " : " + minutos + " : " + segundos);
		
		//Cierro Scanner
		dogma.close();
		
	}
}
