package arrays;

import java.util.Scanner;

public class ClaveLetras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Longitud: ");
		int longitud = entrada.nextInt();
		
		// 97 - 122 (rango a - z) en UTF-16
		String contrasena = "";
		
		for (int i = 0; i < longitud; i++) {
			int numeroAleatorio = (int) (Math.random()*26 + 97);
			char[] letraAleatoria = Character.toChars(numeroAleatorio);
			
			contrasena += String.valueOf(letraAleatoria);
		}
		
		System.out.println("Contraseña: " + contrasena);
		entrada.close();
	}

}
