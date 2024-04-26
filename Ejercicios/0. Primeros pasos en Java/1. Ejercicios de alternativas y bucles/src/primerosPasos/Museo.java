package primerosPasos;

import java.util.Scanner;

public class Museo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String precio = "";
		
		System.out.print("Edad: ");
		int edad = entrada.nextInt();
		
		System.out.print("¿Es miércoles? ");
		boolean esMiercoles = entrada.nextBoolean();
		
		if (esMiercoles || edad < 5) {
			precio = "Es gratis";
		} else {
			if (edad <= 18) {
				precio = "5 €";
			} else if (edad <= 64) {
				precio = "10 €";
			} else {
				precio = "7 €";
			}
		}
		
		System.out.println("Precio: " + precio);
		entrada.close();
	}
	
}
