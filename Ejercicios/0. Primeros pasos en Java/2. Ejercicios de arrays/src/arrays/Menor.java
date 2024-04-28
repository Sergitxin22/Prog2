package arrays;

public class Menor {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		int posicion = 0;
		int menor;
		
		for (int i = 0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random()*1000 + 1);
			numeros[i] = numeroAleatorio;
		}
		
		menor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			int numeroActual = numeros[i];
			if (numeroActual < menor) {
				menor= numeroActual;
				posicion = i;
			}
		}
		
		System.out.println("El menor número es " + menor + " y está en la posición " + posicion + ".");
	}

}
