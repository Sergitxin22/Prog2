package primerosPasos;

import java.util.Scanner;

public class Palindromo {
	
	public static void comprobarPalindromo(String frase) {
		String fraseVolteada = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseVolteada += frase.charAt(i);
		}
		
		if (frase.equalsIgnoreCase(fraseVolteada)) {
			System.out.println("La palabra " + frase + " es un palindromo.");
		} else {
			System.out.println("La palabra " + frase + " NO es un palindromo.");
		}
	}

	public static void main(String[] args) {
		System.out.print("Palabra? ");
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		entrada.close();
		
		comprobarPalindromo(frase);
	}

}
