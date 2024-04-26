package primerosPasos;

import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int intentos = 3;
		int pinCorrecto = 1029;
		boolean acertado = false;
		
		while (intentos > 0 && !acertado) {
			System.out.print("PIN: ");
			int pin = entrada.nextInt();
			
			if (pin == pinCorrecto) {
				acertado = true;
				System.out.println("PIN correcto.");
			} else {
				System.out.println("PIN incorrecto.");
			}
			intentos--;
		}
		
		if (acertado) {
			System.out.print("El saldo de tu cuenta corriente es: 1.000 euros");
		} else {
			System.out.print("Tarjeta bloqueada.");
		}
		
		entrada.close();
	}

}
