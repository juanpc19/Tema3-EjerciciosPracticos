package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero entre 0 y 20: ");
		
		numeroIntroducido = dogma.nextInt();
		
		for (int i=1; i<=numeroIntroducido; i++) {
			System.out.println();
			
			for (int e=1; e<=numeroIntroducido; e++) {
				System.out.print(e);
			}
			
				for (int k=numeroIntroducido-1; k>0; k--) {
				System.out.print(k);
				}
			
		}
		
		dogma.close();
		

	}

}
