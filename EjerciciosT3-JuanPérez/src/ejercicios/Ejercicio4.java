package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//desde el menor de y y b 15 y 20 seria 15 decreciente
		
		int numeroA;
		
		int numeroB;
		
		int numeroMenor=0;
		
		int mcd=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para numero A: ");
		
		numeroA = dogma.nextInt();
		
		System.out.print("Introduzca un valor para numero B: ");
		
		numeroB = dogma.nextInt();
		
		if (numeroA<numeroB) {
			
			numeroMenor=numeroA;
			
		} else if (numeroB<numeroA) {
			
			numeroMenor=numeroB;
		}
		
		for (int i=numeroMenor; i>0; i--) {
			
			if ((numeroA%i==0) && (numeroB%i==0)) {
				mcd=i;
				break;
					}
				}
			System.out.print(mcd);
			
		dogma.close();

	}

}
