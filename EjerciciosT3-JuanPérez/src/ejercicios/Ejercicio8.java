package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int numeroIntroducido, numeroMayor=0, k=0, c=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Dime un numero inicial: ");
		
		numeroIntroducido = dogma.nextInt();
		
		do {
			
			System.out.print("Dime un numero: ");
			
			numeroIntroducido = dogma.nextInt();
			
			k++;
			
			if ((numeroIntroducido<=numeroMayor) && (numeroIntroducido!=0)) {
				System.out.println("Fallo es menor. ");
				
				c++;
				
			}  
			
			numeroMayor = numeroIntroducido;
			
		} while (numeroIntroducido!=0);
		
		System.out.println("Total de numeros introducidos: " + k);
		
		System.out.println("Numeros fallados: " + c);

		dogma.close();
	}

}
