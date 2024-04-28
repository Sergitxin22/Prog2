package arrays;

import java.util.Scanner;

public class Clave {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Longitud: ");
		int longitud = entrada.nextInt();
		
		String contrasena = "";
		
		for (int i = 0; i < longitud; i++) {
			int numeroAleatorio = (int) (Math.random()*10);
			contrasena += numeroAleatorio;
		}
		
		System.out.println("Contraseña: " + contrasena);
		
		entrada.close();
	}

}
