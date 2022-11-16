package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int numeroIntroducido, numeroMayor=0, k=0, c=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero inicial mayor a 0 para iniciar el programa o igual a 0 para finalizarlo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		if (numeroIntroducido<=0) {
			System.out.print("Error, introduzca un numero igual o mayor a 0: ");
		} else {
		
			do {
				
				System.out.print("Introduzca un numero: ");
				
				numeroIntroducido = dogma.nextInt();
				
				k++;
				
				if ((numeroIntroducido<=numeroMayor) && (numeroIntroducido!=0)) {
					System.out.println("Fallo es menor. ");
					
					c++;
					
				}  
				
				numeroMayor = numeroIntroducido;
				
			} while (numeroIntroducido!=0);
		
		}
		System.out.println("Total de numeros introducidos: " + k);
		
		System.out.println("Numeros fallados: " + c);

		dogma.close();
	}

}
