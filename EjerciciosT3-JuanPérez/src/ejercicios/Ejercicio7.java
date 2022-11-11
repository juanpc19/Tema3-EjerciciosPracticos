package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
int numeroIntroducido;
		
		String numero="";
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		for (int i=1; i<=numeroIntroducido; i++) {
			
			System.out.println(numero);
			
			switch (i) {
			
			case 1 ->
			numero+="1";
			
			case 2 ->
			numero+="2";
			
			case 3 ->
			numero+="3";
			
			case 4 ->
			numero+="4";
			
			case 5 ->
			numero+="5";
			
			case 6 ->
			numero+="6";
			
			case 7 ->
			numero+="7";
			
			case 8 ->
			numero+="8";
			
			case 9 ->
			numero+="9";
			
			}
			
			
		} for (int i=numeroIntroducido-1; i>=0; i--) {
			
			System.out.println(numero);
			
			switch (i) {
			
			case 1 ->
			numero+="1";
			
			case 2 ->
			numero+="2";
			
			case 3 ->
			numero+="3";
			
			case 4 ->
			numero+="4";
			
			case 5 ->
			numero+="5";
			
			case 6 ->
			numero+="6";
			
			case 7 ->
			numero+="7";
			
			case 8 ->
			numero+="8";
			
			case 9 ->
			numero+="9";
			}
			
		}
		dogma.close();


	}

}
