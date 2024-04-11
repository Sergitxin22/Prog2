package primerosPasos;

import java.util.Scanner;

public class Estrellitas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Número? ");
		int n = entrada.nextInt();		
		entrada.close();
		
		for (int i = 1; i < n + 1; i++) {
			String cadenaEstrellas = "";
			
			for (int j = 0; j < i; j++) {
				cadenaEstrellas += "*";
			}
			
			System.out.println(cadenaEstrellas);
		}

	}

}
