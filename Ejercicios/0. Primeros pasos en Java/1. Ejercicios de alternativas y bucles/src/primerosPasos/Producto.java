package primerosPasos;

import java.util.Scanner;

public class Producto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Número? ");
		int numero = entrada.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		System.out.println(numero + "! = " + resultado);
		
		entrada.close();

	}

}
