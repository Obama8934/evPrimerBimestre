package evPrimerBIMESTRE;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Ingrese su talla S , M ,L : ");

		char talle = entrada.next().charAt(0);

		switch (talle ) {
		case 's':
		case 'S':
			 System.out.println("Solo quedan 5 remeras ");
			break;
		case 'm':
		case 'M':
			System.out.println("solo quedan 2 remeras ");
			break; 
			
		case 'l':
		case 'L':
			System.out.println("solo quedan 2 remeras ");
			break;
		default:
			System.out.println(" intente de nuevo  ");
			break;
			
		}
	}

}
