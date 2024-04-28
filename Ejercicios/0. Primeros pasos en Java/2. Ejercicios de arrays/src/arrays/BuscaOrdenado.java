package arrays;

import java.util.Scanner;

public class BuscaOrdenado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número (1-100): ");
		int numero = entrada.nextInt();
		entrada.nextLine(); // Consumir la línea en blanco
		
		int posibleNumero = 50;
		boolean numeroEncontrado = false;
		
		int menor = 1;
		int mayor = 100;
		
		do {
			System.out.print("(" + menor + "-" + mayor + ") Está en la posición " + posibleNumero + "? ");
			String respuesta = entrada.nextLine();
			
			if (respuesta.equalsIgnoreCase("Sí")) {
				numeroEncontrado = true;
			} else if (respuesta.equalsIgnoreCase("No, es mayor")) {
				menor = posibleNumero;
				posibleNumero = (int) ((Math.ceil((double) (mayor-menor)/2)) + posibleNumero);
			} else {
				mayor = posibleNumero;
				posibleNumero = (int)(posibleNumero - (Math.ceil((double) (mayor-menor)/2)));
			}
			
		} while (!numeroEncontrado);
		
		

	}

}
