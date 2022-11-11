package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numeroA;
		
		int numeroB;
		
		int mcdA=0;
		
		int mcdB;
		

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para numero A: ");
		
		numeroA = dogma.nextInt();
		
		System.out.print("Introduzca un valor para numero B: ");
		
		numeroB = dogma.nextInt();
		
		for (int i=numeroA-1;i>0; i--)
			
			if (numeroA%i==0) {
				mcdA=i;
				break;
			}
		System.out.print(mcdA);
				
		
		dogma.close();

	}

}
