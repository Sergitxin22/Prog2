package arrays;

import java.util.Scanner;

public class Siglas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = entrada.nextLine();
		
		String[] palabras = frase.split(" ");
		String siglas = "";
		
		for (String palabra : palabras) {
			String sigla = String.valueOf(palabra.charAt(0)).toUpperCase();
			siglas += sigla;			
		}
		
		System.out.println("Consonantes: " + siglas);

	}

}
