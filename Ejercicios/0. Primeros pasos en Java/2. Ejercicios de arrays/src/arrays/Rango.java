package arrays;

public class Rango {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		int menor;
		int mayor;
		int rango;
		
		for (int i = 0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random()*1000 + 1);
			numeros[i] = numeroAleatorio;
		}
		
		menor = numeros[0];
		mayor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			int numeroActual = numeros[i];

			if (numeroActual < menor) {
				menor = numeroActual;
			} else if (numeroActual > mayor) {
				mayor = numeroActual;
			}
		}
		
		rango = mayor - menor;
		
		System.out.println("Rango: " + rango + " (" + menor + "-" + mayor + ").");
	}

}
