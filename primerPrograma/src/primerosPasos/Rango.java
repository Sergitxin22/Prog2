package primerosPasos;

import java.util.ArrayList;
import java.util.Collections;

public class Rango {
	public static void rango(ArrayList<Integer> nums) {
		int menor = nums.get(0);
		int mayor = nums.get(0);
		
		/*for (int i = 0; i < nums.size(); i++) {
			int numeroActual = nums.get(i);
			
			if (numeroActual < menor) {
				menor = numeroActual;
			}
			
			if (numeroActual > mayor) {
				mayor = numeroActual;
			}
			
		}
		
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El numero menor es " + menor);
		System.out.println("############");*/
		
		for (Integer numero : nums) {
			if (numero < menor) {
				menor = numero;
			}
			
			if (numero > mayor) {
				mayor = numero;
			}
		}
		
		int rango = mayor-menor;
		
		System.out.println("Rango: " + rango + "(" + menor + "-" + mayor + ")");
	}
	
	public static int media(ArrayList<Integer> nums) {
		int sum = 0;
		for (Integer numero : nums) {
			sum += numero;
		}
		
		int resultado = sum / nums.size();
		
		return resultado;
	}
	
	public static void rango2(ArrayList<Integer> nums) {
		int menor = Collections.min(nums);
		int mayor = Collections.max(nums);
		
		int rango = mayor-menor;
		
		System.out.println("Rango: " + rango + "(" + menor + "-" + mayor + ")");
	}

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			numeros.add((int) (Math.random()*1000+1));
		}
		
		System.out.println(numeros);
		rango(numeros);
		rango2(numeros);
		
		int resultado = media(numeros);
		
		System.out.println(resultado);

	}

}
