package arrays;

import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Palabra? ");
		String palabra = entrada.nextLine();
		String palabraInvertida = "";
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			char caracterActual = palabra.charAt(i);
			String letraFormateada = String.valueOf(caracterActual).toLowerCase();
			palabraInvertida += letraFormateada;
		}
		
		if (palabra.equalsIgnoreCase(palabraInvertida)) {
			System.out.println(palabra + " es un palíndromo.");
		} else {
			System.out.println(palabra + " NO es un palindromo.");			
		}
		
		entrada.close();
	}

}
