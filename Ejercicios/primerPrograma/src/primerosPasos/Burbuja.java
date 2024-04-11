package primerosPasos;

import java.util.ArrayList;
import java.util.Iterator;

public class Burbuja {
	
	 public static void bubbleSort(ArrayList<Integer> lista) {
	        int n = lista.size();
	        boolean intercambiado;
	        
	        for (int i = 0; i < n - 1; i++) {
	            intercambiado = false;
	            
	            // Últimos i elementos ya están ordenados, no es necesario revisarlos
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (lista.get(j) > lista.get(j + 1)) {
	                    // Intercambiar elementos si están en el orden incorrecto
	                    int temp = lista.get(j);
	                    lista.set(j, lista.get(j + 1));
	                    lista.set(j + 1, temp);
	                    intercambiado = true;
	                }
	            }
	            System.out.println(lista);

	            // Si no hubo intercambios en la pasada, la lista está ordenada
	            if (!intercambiado) {
	                break;
	            }
	        }
	    }

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 10 + 1);
			numeros.add(n);
		}

		/*for (int i = 0; i < numeros.size() - 1; i++) {
			// Comparamos los elementos de dos en dos
			// desde el final hasta i
			for (int j = numeros.size() - 1; j > i; j--) {
				// Comparamos j y j-1
				if (numeros.get(i) > numeros.get(i + 1)) {
					// Los intercambiamos
					int temp = numeros.get(j);
					numeros.set(j, numeros.get(j - 1));
					numeros.set(j - 1, temp);
				}

			}
			System.out.println(numeros);
		}*/
		bubbleSort(numeros);

	}

}