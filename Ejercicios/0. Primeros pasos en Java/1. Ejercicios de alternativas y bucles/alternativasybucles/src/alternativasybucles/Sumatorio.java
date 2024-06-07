package alternativasybucles;

import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Número? ");
		int numero = entrada.nextInt();
		
		int resultado = 0;
		
		for (int i = 1; i <= numero; i++) {
			resultado += i;
		}
		
		System.out.println(resultado);
		
		entrada.close();

	}

}
