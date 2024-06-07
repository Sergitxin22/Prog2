package arrays;

import java.util.Scanner;

public class ArrayOrdenado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int[] listaNumeros = new int[10];
		int numeroMinimo = 0;
		
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.print("Dime un número (>= " + numeroMinimo + "): ");
			numero = entrada.nextInt();
			
			while (numero < numeroMinimo) {
				System.out.println("Error!");
				System.out.print("Dime un número (>= " + numeroMinimo + "): ");
				numero = entrada.nextInt();				
			}
			listaNumeros[i] = numero;
			numeroMinimo = numero;
		}

		System.out.print("El contenido del array es: ");
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.print(listaNumeros[i]);
			
			if (i != listaNumeros.length - 1) {
				System.out.print(", ");
			}
		}
		
		entrada.close();

	}

}
