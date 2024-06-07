package alternativasybucles;

import java.util.Scanner;

public class Angry {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numPajaros = 3;
		int distancia = (int) (Math.random() * 95 + 5 + 1);;
		int puntos = 0;
		double distanciaRestante;
		boolean acertado = false;
		
		System.out.println("El cerdito está a " + distancia + " m.");
		
		while (numPajaros > 0) {
			if (acertado) {
				distancia = (int) (Math.random() * 95 + 5 + 1);
				System.out.println("El cerdito está a " + distancia + " m.");
				acertado = false;
			}
			
			/*distancia = 22;*/
			
			
			System.out.print("Velocidad? ");
			int velocidad = entrada.nextInt();
			
			System.out.print("Angulo? ");
			int angulo = entrada.nextInt();
			
			double longitud = Math.pow(velocidad, 2) * Math.sin(2*angulo)/8.766;
			double longitudRedondeada = Math.round(longitud * 100.0) / 100.0;
			
			distanciaRestante = Math.round((distancia - longitudRedondeada) * 100.0) / 100.0;
			
			if (distanciaRestante >= -1 && distanciaRestante <= 1) {
				System.out.println("¡Has avanzado " + longitudRedondeada + " m y has dado al cerdito!");
				System.out.println("Ganas 1 punto y vuelves a tener 3 pájaros.");
				numPajaros = 3;
				puntos++;
				acertado = true;				
			} else {
				System.out.println("Has avanzado " + longitudRedondeada + " m, te has quedado a " + distanciaRestante + " m.");
				numPajaros--;
				System.out.println("Te quedan " + numPajaros + " pájaros.");
			}
			distanciaRestante = distancia;
			
		}
		System.out.println("FIN DE LA PARTIDA");
		System.out.println("Has conseguido un total de " + puntos + " puntos.");
		
		entrada.close();
	}

}
