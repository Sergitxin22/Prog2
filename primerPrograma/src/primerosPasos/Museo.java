package primerosPasos;

import java.util.Scanner;

public class Museo {

	public static void main(String[] args) {
		int precio = 0;
		
		System.out.print("Edad: ");
		Scanner entrada = new Scanner(System.in);
		int edad = entrada.nextInt();
		
		System.out.print("¿Es miércoles? ");		
		boolean esMiercoles = entrada.nextBoolean();
		
		entrada.close();
		
		if (esMiercoles) {
			System.out.println("Precio: " + precio + "€");
		} else {
			if (edad < 5) {
				precio = 0;
			} else if (edad < 18) {
				precio = 5;
			} else if (edad < 65) {
				precio = 10;
			} else {
				precio = 7;
			}
			
			System.out.println("Precio: " + precio + "€");
		}	

	}

}
