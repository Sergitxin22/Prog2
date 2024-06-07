package arrays;

public class Busca {

	public static void main(String[] args) {
		int[] listaNumeros = new int[100];
		int indiceNumero = -1;
		
		// Crear lista
		for (int i = 0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random() * 1_000 + 1);
			listaNumeros[i] = numeroAleatorio;
		}
		
		// Buscar en la lista
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] == 37) {
				indiceNumero = i;
				break;
			}
		}
		
		if (indiceNumero == -1) {
			System.out.println("El número no está en la lista");
		} else {
			System.out.println("El número está en la posición " + indiceNumero + ".");	
		}
	}

}
