package alternativasybucles;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

	public static void main(String[] args) {
		ArrayList<String> valores = new ArrayList<String>();
		Collections.addAll(valores, "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey");
		
		ArrayList<String> palos = new ArrayList<String>();
		Collections.addAll(palos, "Corazones", "Picas", "Rombos", "Tréboles");
		
		for (String palo : palos) {
			
			for (String valor : valores) {
				System.out.println(valor + " de " + palo);				
			}
		}

	}

}
