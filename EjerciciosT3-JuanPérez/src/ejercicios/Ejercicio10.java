package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numeroIntroducido, auxiliar, cifra=0, Inverso=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		auxiliar = numeroIntroducido;
		
		while (auxiliar>0) {
			
		cifra = auxiliar%10;
		Inverso = Inverso*10 + cifra;
		auxiliar = auxiliar/10;
			
		}
		
		if (numeroIntroducido==Inverso) {
			System.out.print("El numero es capicua. ");
			
		} else {
			System.out.print("El numero no es capicua. ");
		}
		
		dogma.close();

	

	}

}
