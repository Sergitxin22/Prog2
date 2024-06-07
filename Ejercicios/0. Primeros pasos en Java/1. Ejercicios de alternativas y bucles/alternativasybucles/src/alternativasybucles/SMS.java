package alternativasybucles;

import java.util.Scanner;

public class SMS {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = entrada.nextLine();		
		
		imprimirFrase(frase);		
		entrada.close();
	}

	private static void imprimirLetra(int[] pulsacionesLetra) {
		if (pulsacionesLetra == null) {
			return;
		}
		
		int boton = pulsacionesLetra[0] + 2;
		int vecesPulsadas = pulsacionesLetra[1] + 1;
		
		String resultado = "";
		
		for (int i = 0; i < vecesPulsadas; i++) {
			resultado += String.valueOf(boton);
		}
		
		System.out.println(resultado);
		
	}

	private static int[] encontrarLetra(String letra) {		
		String[][] arrrayLetras = new String[8][4];
		
		// Inicializar la matriz con algunos valores
		arrrayLetras[0][0] = "A";
		arrrayLetras[0][1] = "B";
		arrrayLetras[0][2] = "C";
		arrrayLetras[1][0] = "D";
		arrrayLetras[1][1] = "E";
		arrrayLetras[1][2] = "F";
		arrrayLetras[2][0] = "G";
		arrrayLetras[2][1] = "H";
		arrrayLetras[2][2] ="I";
		arrrayLetras[3][0] = "J";
		arrrayLetras[3][1] = "K";
		arrrayLetras[3][2] ="L";
		arrrayLetras[4][0] = "M";
		arrrayLetras[4][1] = "N";
		arrrayLetras[4][2] ="O";
		arrrayLetras[5][0] = "P";
		arrrayLetras[5][1] = "Q";
		arrrayLetras[5][2] ="R";
		arrrayLetras[5][3] ="S";
		arrrayLetras[6][0] = "T";
		arrrayLetras[6][1] = "U";
		arrrayLetras[6][2] ="V";
		arrrayLetras[7][0] = "W";
		arrrayLetras[7][1] = "X";
		arrrayLetras[7][2] ="Y";
		arrrayLetras[7][3] ="Z";
		
		for (int i = 0; i < arrrayLetras.length; i++) {
			String[] letrasNumero = arrrayLetras[i];
			
			for (int j = 0; j < letrasNumero.length; j++) {
				String letraPulsaciones = letrasNumero[j];
				//System.out.println("Letra: " + letraPulsaciones + "; i -> " + i + "; j -> " + j);
				if (letraPulsaciones != null && letraPulsaciones.equalsIgnoreCase(letra)) {
					int[] pulsacionesLetra = {i, j};
					return pulsacionesLetra;
				}
			}
		}
		int[] noEncontrado = null;
		return noEncontrado;
	}
	
	private static void imprimirFrase(String frase) {
		for (int i = 0; i < frase.length(); i++) {
			int[] pulsacionesLetra = encontrarLetra(String.valueOf(frase.charAt(i)));
			imprimirLetra(pulsacionesLetra);
		}
		
	}

}
