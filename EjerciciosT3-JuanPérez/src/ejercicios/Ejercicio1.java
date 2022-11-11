package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int horas;
		int minutos;
		int segundos;
		int incrementoSegundos;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca las horas: ");
		
		horas = dogma.nextInt();
		
		System.out.print("Introduzca los minutos: ");
		
		minutos = dogma.nextInt();
		
		System.out.print("Introduzca los segundos: ");
	
		segundos = dogma.nextInt();
		
		System.out.print("En cuantos segundos desea incrementar la hora?");
		
		incrementoSegundos = dogma.nextInt();
		
		segundos += incrementoSegundos;
		
		while (segundos>59) {
			
			minutos +=1;
			segundos -=60;
		}
	
		while (minutos>59) {
			
			horas +=1;
			minutos -=60;
		}
		
		while (horas>23) {
			
			horas = 0;
		}
	
		System.out.print("La nueva hora es: " + horas + " : " + minutos + " : " + segundos + " : ");
		
		dogma.close();

	}

}
