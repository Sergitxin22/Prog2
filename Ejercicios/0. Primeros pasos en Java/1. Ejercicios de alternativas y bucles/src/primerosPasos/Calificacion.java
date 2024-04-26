package primerosPasos;

import java.util.Scanner;

public class Calificacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nota? ");
		int nota = entrada.nextInt();
		
		String calificacion = "";
		
		if (nota < 5) {
			calificacion = "INSUFICIENTE";
		} else if (nota < 6) {
			calificacion = "SUFICIENTE";
		} else if (nota < 7) {
			calificacion = "BIEN";
		} else if (nota < 9) {
			calificacion = "NOTABLE";
		} else {
			calificacion = "SOBRESALIENTE";
		}
		
		System.out.println("Calificación: " + calificacion);
		
		entrada.close();
	}

}
