package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numeroA;
		
		int numeroB;
		
		int numeroMayor=0;
		
		int numeroMenor=0;
		
		int mcm=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para numero A: ");
		
		numeroA = dogma.nextInt();
		
		System.out.print("Introduzca un valor para numero B: ");
		
		numeroB = dogma.nextInt();
		
		if (numeroA<numeroB) {
				
				numeroMayor=numeroB;
				numeroMenor=numeroA;
				
			} else if (numeroB<numeroA) {
				
				numeroMayor=numeroA;
				numeroMenor=numeroB;
			}
			
		for (int i=numeroMayor; i>0; i++) {
			
			if ((i%numeroMayor==0) && (i%numeroMenor==0)) {
				mcm=i;
				break;
					}
				}
			System.out.print(mcm);
			
		dogma.close();


	}

}
