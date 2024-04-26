package primerosPasos;

import java.util.Scanner;

public class Trivial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String pregunta = "¿Cuál es la capital de Francia?";
		String respuesta1 = "1) Madrid.";
		String respuesta2 = "2) Paris.";
		String respuesta3 = "3) Helsinki.";	
		int respuestaCorrecta = 2;
		
		System.out.println(pregunta);
		System.out.println(respuesta1);
		System.out.println(respuesta2);
		System.out.println(respuesta3);
		
		System.out.print("Respuesta? ");
		int respuesta = entrada.nextInt();
		
		while (respuesta != respuestaCorrecta) {
			System.out.println("No, te has equivocado.");
			
			System.out.print("Respuesta? ");
			respuesta = entrada.nextInt();			
		}
		
		System.out.println("¡Correcto!");
		entrada.close();
	}

}
