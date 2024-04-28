package arrays;

import java.util.Scanner;

public class Reves {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Palabra: ");
		String palabra = entrada.nextLine();
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			System.out.print(palabra.charAt(i));
		}
		
		entrada.close();
	}

}
