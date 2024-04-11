package primerosPasos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		int resultado = 1;
		for (int i = numero; i >= 1; i--) {
			resultado *= i;
		}
		
		System.out.print(numero + "! = " + resultado);
	}

}
