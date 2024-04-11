package primerosPasos;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {
		System.out.print("Dime tu nombre:");
		Scanner entrada = new Scanner(System.in);
		String nombre = entrada.next();

		System.out.print("Dime tu edad:");
		Scanner entrada2 = new Scanner(System.in);
		int edad = entrada2.nextInt();

		System.out.println("Te llamas " + nombre + " y tienes " + edad + "años.");
		entrada.close();
		entrada2.close();
	}

}
