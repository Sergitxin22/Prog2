package zoo;

import java.util.ArrayList;

public class Zoo {
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		for (int i = 0; i < 100; i++) {
			Vehiculo nuevo = new Vehiculo();			
			vehiculos.add(nuevo);			
		}
		
		for (int i = 0; i < 100; i++) {
			Animal nuevo;
			double aleatorio = Math.random();
			
			if (aleatorio < 0.25) {
				nuevo = new Pez();
			} else if (aleatorio < 0.50) {
				nuevo = new Ave();
			} else if (aleatorio < 0.75) {
				nuevo = new Reptil();
			} else {
				nuevo = new Mamifero();
			}
			
			animales.add(nuevo);			
		}

		for (Animal animal : animales) {
			System.out.println(animal.hablar());
		}
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.imprimir());
		}
	}

}
