package primerosPasos;

import java.util.Scanner;

public class Adivino {

	public static void main(String[] args) {
		int secreto = (int) (Math.random() * 100) + 1;
		int numero;
		int intentos = 5;
		boolean acertado = false;
		Scanner entrada = new Scanner(System.in);
		
		while (!acertado && intentos > 0) {
			// Pedir número
			System.out.print("Introduce un número: ");
			numero = entrada.nextInt();
			
			// Comprobar si es mayor, menor o igual
			if (numero > secreto) {
				System.out.println("El número secreto es menor");
			} else if (numero < secreto) {
				System.out.println("El numero secreto es mayor");
			} else {
				System.out.println("¡Has acertado!");
				acertado = true;
			}
			
			intentos--;
		}
	}

}
