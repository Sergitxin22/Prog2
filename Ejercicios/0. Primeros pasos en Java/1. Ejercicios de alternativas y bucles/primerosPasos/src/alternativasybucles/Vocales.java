package alternativasybucles;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Frase: ");
		String frase = entrada.nextLine();
		String fraseSinVocales = "";
		
		for (int i = 0; i < frase.length(); i++) {
			Character caracter = frase.charAt(i);

			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				fraseSinVocales += "*";
			} else {
				fraseSinVocales += caracter;
			}
		}
		
		System.out.println(fraseSinVocales);		
		entrada.close();
	}

}
