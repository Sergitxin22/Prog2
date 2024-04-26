package primerosPasos;

import java.util.Scanner;

public class Factoriales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("inicio: ");
		int inicio = entrada.nextInt();
		
		System.out.print("fin: ");
		int fin = entrada.nextInt();
		
		for (int i = inicio; i <= fin; i++) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			
			System.out.println(factorial);
		}
		
		entrada.close();
	}

}
