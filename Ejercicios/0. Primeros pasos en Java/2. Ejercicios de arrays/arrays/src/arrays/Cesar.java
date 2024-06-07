package arrays;

import java.util.Scanner;

public class Cesar {
	
	public static String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Texto? ");
		String frase = entrada.nextLine();
		System.out.print("Desplazamiento? ");
		int desplazamiento = entrada.nextInt();
		
		System.out.println(descifrar(frase, desplazamiento));
	}
	
	public static String cifrar (String mensaje, int clave) {
		String resultado = "";
		
		mensaje = mensaje.toUpperCase();
				
		// Por cada letra en mensaje...
		for (int i = 0; i < mensaje.length(); i++) {
			char letra = mensaje.charAt(i);
			// - Buscar la posición de la letra en el alfabeto
			int posicion = alfabeto.indexOf(letra);
			if (posicion != -1) {
				// - Sumar la clave a esa posicion
				posicion = (posicion + clave) % alfabeto.length();
				if (posicion < 0) {
					posicion = posicion + alfabeto.length();
				}
				// - Conseguir la nueva letra
				letra = alfabeto.charAt(posicion);
			}
			// - Añadir la nueva letra al resultado
			resultado = resultado + letra;
		}
		
		return resultado;
	}
	
	public static String descifrar (String mensaje, int clave) {
		return cifrar(mensaje, -clave);
	}

}
