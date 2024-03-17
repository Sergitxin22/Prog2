package primerosPasos;

public class Frases {
	
	public static String cifradoVigenere(String frase, int[] clave) {
		String resultado = "";
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			int posicion = i % clave.length;
			String letraCifrada = cifradoCesar("" + letra, clave[posicion]);
			resultado += letraCifrada;
		}
		
		return resultado;
	}
	
	public static String descifradoCesar(String frase, int clave) {
		return cifradoCesar(frase, -clave);
	}
	
	public static String cifradoCesar(String frase, int clave) {
		String resultado = "";
		String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		frase = frase.toUpperCase();
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			int posicion = alfabeto.indexOf(letra);
			
			if (posicion != -1) {
				posicion += clave;
				posicion = posicion % alfabeto.length();
				
				if (posicion < 0) {
					posicion = alfabeto.length() + posicion;
				}
				letra = alfabeto.charAt(posicion);
			}
			
			resultado += letra;
		}
		
		return resultado;
	}
	
	public static int contarVocales(String frase) {
		int resultado = 0;
		String vocales = "aeiouAEIOUáéíóú";
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if (vocales.indexOf(letra) != -1) {
				resultado++;
			}
		}
		
		return resultado;
	}

	public static void main(String[] args) {
		String frase = "Hola Mundo";
		int[] clave = new int[4];
		clave[0] = 3;
		clave[1] = 3;
		clave[2] = 3;
		clave[3] = 3;
		// System.out.println(contarVocales(frase));
		System.out.println(cifradoCesar(frase, 3));
		System.out.println(cifradoVigenere(frase, clave));
		
		// System.out.println(descifradoCesar("abc xyz", 3));
	}

}
