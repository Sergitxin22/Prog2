package alternativasybucles;

import java.util.Scanner;

public class Penalty {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int puntosJ1 = 0;
		int puntosJ2 = 0;
		
		boolean tuTurno = true;
		
		while (puntosJ1 + puntosJ2 < 5) {
			int opcionJ1 = dibujarMenu(tuTurno);
			System.out.println(opcionJ1);
			
			int opcionJ2 = (int) (Math.random()*5 + 1);
			System.out.println("j1 -> " + opcionJ1);
			System.out.println("j2 -> " + opcionJ2);
			
			if (tuTurno) {
				if (opcionJ1 != opcionJ2) {
					System.out.println("¡Has marcado gol!");
					puntosJ1++;					
				} else {
					System.out.println("¡NO has marcado gol!");
					puntosJ2++;
				}
			} else {
				if (opcionJ1 != opcionJ2) {
					System.out.println("Te han marcado gol.");
					puntosJ2++;					
				} else {
					System.out.println("¡Has parado el gol!");
					puntosJ1++;
				}
			}
			
			imprimirPuntuacion(puntosJ1, puntosJ2);
			tuTurno = !tuTurno;
			
		}
		
	}

	private static int dibujarMenu(boolean tuTurno) {
		if (tuTurno) {
			System.out.println("Elige dónde tirar:");
		} else {
			System.out.println("Elige dónde parar:");
		}
		
		System.out.printf(" ___________\r\n"
				+ "|2    3    4|\r\n"
				+ "|1    	   5|\r\n"
				+ "");
		
		System.out.println("Opción? ");
		return entrada.nextInt();
	}
	
	private static void imprimirPuntuacion(int puntosJ1, int puntosJ2) {
		if (puntosJ1 == puntosJ2) {
			System.out.println("Vas empatando " + puntosJ1 + " – " + puntosJ2 + ".");
		} else if (puntosJ1 > puntosJ2) {
			System.out.println("Vas ganando " + puntosJ1 + " – " + puntosJ2 + ".");
		} else {
			System.out.println("Vas perdiendo " + puntosJ1 + " – " + puntosJ2 + ".");
		}
	}

}
