package evPrimerBIMESTRE;

import java.util.Scanner;

public class ejerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("ingrese tu edad ");
		 
		 int edad = entrada.nextInt();
		    
		 boolean pagoEntrada = true ;
		 
		 
		 if (edad>18) {
			 
			 System.out.println( "puede ingresar ");
			 
			 
			 
			 if (pagoEntrada ==  true ) {
				  System.out.println("entrada valida ");
			  }
				  
				  else if (pagoEntrada == false ) {
					  System.out.println("entrada no abandonada No puede ingresar ");
			  }
		 }
		 
		 else if (edad<18) {
			  System.out.println("entrada no permitida ");
			  
			  
			  
			  }
	}

}
