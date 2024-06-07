package alternativasybucles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int numero = entrada.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		System.out.println(numero + "! = " + resultado);
		
		entrada.close();
	}

}
