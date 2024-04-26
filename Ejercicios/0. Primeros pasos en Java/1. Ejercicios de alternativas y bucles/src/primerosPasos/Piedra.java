package primerosPasos;

import java.util.Scanner;

public class Piedra {

	public static void main(String[] args) {
		int puntosJ1 = 0;
		int puntosJ2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1. Piedra \n2. Papel \n3. Tijera");		
		
		do {
			System.out.print("Opción? ");
			int opcionJ1 = entrada.nextInt();
			int opcionJ2 = (int) (Math.random()*3 + 1);
			
			if (opcionJ1 == opcionJ2) {
				System.out.println("Empate");
			} else if (opcionJ1 == 1 && opcionJ2 == 2) {
				System.out.println("Tu eliges piedra y yo papel, tú pierdes.");
				puntosJ2++;
			} else if (opcionJ1 == 1 && opcionJ2 == 3) {
				System.out.println("Tu eliges piedra y yo tijera, tú ganas.");
				puntosJ1++;
			} else if (opcionJ1 == 2 && opcionJ2 == 1) {
				System.out.println("Tu eliges papel y yo piedra, tú ganas.");
				puntosJ1++;
			} else if (opcionJ1 == 2 && opcionJ2 == 3) {
				System.out.println("Tu eliges papel y yo tijera, tú pierdes.");
				puntosJ2++;
			} else if (opcionJ1 == 3 && opcionJ2 == 1) {
				System.out.println("Tu eliges tijera y yo piedra, tú pierdes.");
				puntosJ2++;
			} else if (opcionJ1 == 3 && opcionJ2 == 2) {
				System.out.println("Tu eliges tijera y yo papel, tú ganas.");
				puntosJ1++;
			}
		} while (puntosJ1 + puntosJ2 < 3);
		
		if (puntosJ1 > puntosJ2) {
			System.out.println("Tu has ganado " + puntosJ1 + " veces y yo " + puntosJ2 + ", tú ganas.");
		} else {
			System.out.println("Tu has ganado " + puntosJ1 + " veces y yo " + puntosJ2 + ", tú pierdes.");
		}
		
		entrada.close();
	}

}
