package primerosPasos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		
		System.out.println("1. Sumar \t 3. Multiplicar");
		System.out.println("2. Restar \t 4. Dividir");
		
		System.out.print("Opción? ");
		int opcion = entrada.nextInt();
		String operador = "";
		
		System.out.print("Primer operando? ");
		int n1 = entrada.nextInt();
		
		System.out.print("Segundo operando? ");
		int n2 = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			operador = "+";
			resultado = n1 + n2;
			break;
		case 2:
			operador = "-";
			resultado = n1 - n2;
			break;
		case 3:
			operador = " X ";
			resultado = n1 * n2;
			break;
		default:
			operador = " / ";
			resultado = (double) n1 / n2;
			break;
		}
		
		System.out.println(n1 + operador + n2 + " = " + resultado);
	}

}
