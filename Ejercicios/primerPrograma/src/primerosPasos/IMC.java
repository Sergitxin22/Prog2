package primerosPasos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Peso? ");
		double peso = entrada.nextDouble();
		
		System.out.print("¿Altura? ");
		double altura = entrada.nextDouble();		
		entrada.close();
		
		double imc = peso / (Math.pow(altura, 2));		
		System.out.println("IMC: " + imc);
		
		String valorPeso = "obesidad";
		if (imc < 18.5) {
			valorPeso = "bajo peso";
		} else if (imc <25) {
			valorPeso = "peso normal";
		} else if (imc <=30) {
			valorPeso = "sobrepeso";
		}
		
		System.out.println(valorPeso);
	}

}
