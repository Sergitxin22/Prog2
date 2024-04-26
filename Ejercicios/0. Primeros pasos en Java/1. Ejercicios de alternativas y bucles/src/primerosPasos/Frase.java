package primerosPasos;

import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = entrada.nextLine();
		
		int contadorEspacios = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			Character caracter = frase.charAt(i);

			if (caracter == ' ') {
				contadorEspacios++;
			}
		}
		
		System.out.println(contadorEspacios + " espacios");		
		entrada.close();
	}

}
