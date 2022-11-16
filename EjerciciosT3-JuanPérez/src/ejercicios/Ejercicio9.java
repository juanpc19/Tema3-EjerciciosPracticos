package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numeroIntroducido, c=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero mayor a 0: ");
		
		numeroIntroducido = dogma.nextInt();
		
		if (numeroIntroducido<=0) {
			System.out.print("Error, introduzca un numero mayor a 0: ");
			
		} else {
			
			for (int i=1; i<=numeroIntroducido; i*=10) {
				c++;
			}
			System.out.print(c);
		}
		
		dogma.close();
	}

}
