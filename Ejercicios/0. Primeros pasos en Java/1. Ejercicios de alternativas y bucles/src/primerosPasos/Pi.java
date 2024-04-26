package primerosPasos;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("n? ");
		int n = entrada.nextInt();
		
		int numerador = 0;
		int denominador = 0;		
		double resultado = 0;

		for (int i = 0; i <= n; i++) {
			numerador = (int) Math.pow(-1, i);
			denominador = (2*i) + 1;
			
			resultado += (double) numerador / denominador;
		}
		
		resultado = resultado * 4;

		double resultadoTruncado = Math.floor(resultado * 100) / 100;
        System.out.printf("PI: %.2f", resultadoTruncado);
        
        entrada.close();
	}

}
