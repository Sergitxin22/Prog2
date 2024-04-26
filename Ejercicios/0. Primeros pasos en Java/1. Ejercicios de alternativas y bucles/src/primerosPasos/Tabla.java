package primerosPasos;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Número? ");
		int numero = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		
		entrada.close();
	}

}
