package ski;

import java.util.ArrayList;

public class Estacion {
	public static void main(String[] args) {
		ArrayList<Pista> pistas = new ArrayList<Pista>();
		
		for (int i = 0; i < 20; i++) {
			pistas.add(new Pista());
		}
		
		System.out.println(pistas);
	}
}
