package primerosPasos;

import java.util.Scanner;

public class Reves {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Frase: ");
		String frase = entrada.nextLine();
		String fraseVolteada = "";
		
		for (int i = frase.length()-1; i >= 0; i--) {
			char caracter = frase.charAt(i);
			fraseVolteada += caracter;
		}
		
		System.out.println(fraseVolteada);		
		entrada.close();
	}

}
