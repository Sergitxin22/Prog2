package arrays;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("primera palabra? ");
		String palabra1 = entrada.nextLine();
		System.out.print("segunda palabra? ");
		String palabra2 = entrada.nextLine();
		
		if (palabra1.compareToIgnoreCase(palabra2) < 0) {
			System.out.println(palabra1 + " está antes que " + palabra2 + " en un diccionario");
		} else if (palabra1.compareToIgnoreCase(palabra2) > 0) {
			System.out.println(palabra2 + " está antes que " + palabra1 + " en un diccionario");
		} else {
			System.out.println("Has escrito dos veces la misma palabra");
		}
		
		entrada.close();
	}

}
