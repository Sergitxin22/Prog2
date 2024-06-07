package alternativasybucles;

import java.util.Scanner;

public class PrimerosPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("inicio: ");
		int inicio = entrada.nextInt();
		
		System.out.print("fin: ");
		int fin = entrada.nextInt();
		int contador = 0;
		
		while (inicio <= fin && contador < 5) {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
				contador++;
			}
			inicio++;
		}
		
		entrada.close();
	}

}
