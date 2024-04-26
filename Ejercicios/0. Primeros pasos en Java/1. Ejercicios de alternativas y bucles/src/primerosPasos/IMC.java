package primerosPasos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Peso? ");
		double peso = entrada.nextDouble();
		
		System.out.print("¿Altura? ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		System.out.printf("Value: %.2f", imc);
		System.out.println();

		if (imc < 18.5) {
			System.out.println("Bajo peso");
		} else if (imc <= 25) {
			System.out.println("Peso normal");
		} else if (imc <= 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidad");
		}
		
		entrada.close();
	}

}
