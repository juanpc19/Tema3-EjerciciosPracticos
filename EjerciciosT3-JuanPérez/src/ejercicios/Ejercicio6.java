package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero entre 0 y 20: ");
		
		numeroIntroducido = dogma.nextInt();
		
		for (int i=1; i<=numeroIntroducido; i++) {
			
			
			for (int e=1; e<=i; e++) {
				System.out.print(i);
			}
				for (int e=i; e<=i; e++) {
				System.out.println();
			}
			
		}
		
		dogma.close();
		
	}

}
