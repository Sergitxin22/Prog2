package arrays;

import java.util.Scanner;

public class Consonantes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = entrada.nextLine();
		
		String consonantes = "bcdfghjklmnñpqrstvwxyz";
		String[] listaConsonantes = consonantes.split("");
		int contadorConsonantes = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			String caracter = String.valueOf(frase.charAt(i));
			
			for (String consonante : listaConsonantes) {
				if (caracter.equalsIgnoreCase(consonante)) {
					contadorConsonantes++;
				}
			}
		}
		
		System.out.println("Consonantes: " + contadorConsonantes);

	}

}
