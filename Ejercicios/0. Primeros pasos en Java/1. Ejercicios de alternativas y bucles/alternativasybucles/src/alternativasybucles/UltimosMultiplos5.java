package alternativasybucles;

import java.util.Scanner;

public class UltimosMultiplos5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("inicio: ");
		int inicio = entrada.nextInt();
		
		System.out.print("fin: ");
		int fin = entrada.nextInt();
		int contador = 0;
		
		while (inicio <= fin && contador < 3) {
			if (fin % 5 == 0) {
				System.out.println(fin);
				contador++;
			}
			fin--;
		}
		
		entrada.close();
	}

}
