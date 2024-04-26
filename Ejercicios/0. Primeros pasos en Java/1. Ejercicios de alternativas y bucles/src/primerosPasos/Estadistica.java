package primerosPasos;

import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        ArrayList<Integer> listaAlturas = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
        	System.out.print("Altura " + (i+1) + "? ");
    		int altura = entrada.nextInt();
    		listaAlturas.add(altura);
			
		}

        // Paso 1: Calcular la media de la listaAlturas
        double mediaAlturas = calcularMedia(listaAlturas);

        // Paso 2: Calcular la suma de los cuadrados de las diferencias
        double sumaCuadradosDiferencias = 0;
        for (double dato : listaAlturas) {
            sumaCuadradosDiferencias += Math.pow(dato - mediaAlturas, 2);
        }

        // Paso 3: Dividir por el número total de datos - 1 (para muestras)
        double varianzaMuestral = sumaCuadradosDiferencias / (listaAlturas.size() - 1);

        // Paso 4: Calcular la raíz cuadrada de la varianza muestral para obtener la desviación típica muestral
        double desviacionTipicaMuestral = Math.sqrt(varianzaMuestral);

        System.out.printf("Altura media: %.2f", mediaAlturas);
        System.out.println();
        System.out.printf("Desv. típica: %.2f", desviacionTipicaMuestral);
        
        double alturaMin = alturaMinima(listaAlturas);
        System.out.println();
        System.out.printf("Altura mínima: %.2f", alturaMin);
        
        double alturaMax = alturaMaxima(listaAlturas);
        System.out.println();
        System.out.printf("Altura máxima: %.2f", alturaMax);
        
        entrada.close();
    }

	// Método para calcular la media de una muestra
    public static double calcularMedia(ArrayList<Integer> listaAlturas) {
        double suma = 0;
        for (double dato : listaAlturas) {
            suma += dato;
        }
        return suma / listaAlturas.size();
    }
    
    private static double alturaMinima(ArrayList<Integer> listaAlturas) {
    	double min = listaAlturas.get(0);
    	for (double dato : listaAlturas) {
            if (dato < min) {
				min = dato;
			}
        }
        return min;
	}
    
    private static double alturaMaxima(ArrayList<Integer> listaAlturas) {
    	double max = listaAlturas.get(0);
    	for (double dato : listaAlturas) {
            if (dato > max) {
            	max = dato;
			}
        }
        return max;
	}

}
