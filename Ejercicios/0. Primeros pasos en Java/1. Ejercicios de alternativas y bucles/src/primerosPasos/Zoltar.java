package primerosPasos;

import java.util.Scanner;

public class Zoltar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Como te llamas? ");
		String nombre = entrada.next();
		String mensaje = "";
		
		Character inicial = nombre.toLowerCase().charAt(0);
		
		if (inicial.compareTo('h') <= 0) {
			mensaje = "te auguro un futuro lleno de éxitos.";
		} else if (inicial.compareTo('q') <= 0) {
			mensaje = "segundo mensaje";
		} else if (inicial.compareTo('z') <= 0) {
			mensaje = "tercer mensaje";
		}
		
		System.out.println(nombre + ",  " + mensaje);
		
		entrada.close();
	}

}
