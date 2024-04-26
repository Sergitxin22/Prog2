package primerosPasos;

import java.util.Scanner;

public class Primera {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Frase: ");
			String frase = entrada.nextLine();
	
			String[] listaPalabras = frase.split(" ");
			String primeraPalabra = listaPalabras[0];
			
			System.out.println(primeraPalabra);		
			entrada.close();
	}

}
