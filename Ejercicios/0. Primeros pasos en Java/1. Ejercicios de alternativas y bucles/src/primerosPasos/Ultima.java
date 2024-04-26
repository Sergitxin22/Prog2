package primerosPasos;

import java.util.Scanner;

public class Ultima {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Frase: ");
		String frase = entrada.nextLine();

		String[] listaPalabras = frase.split(" ");
		String ultimaPalabra = listaPalabras[listaPalabras.length - 1];
		
		System.out.println(ultimaPalabra);		
		entrada.close();
	}

}
