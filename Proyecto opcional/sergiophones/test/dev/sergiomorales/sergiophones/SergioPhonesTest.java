package dev.sergiomorales.sergiophones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SergioPhonesTest {

	@Test
	void testMediaPrecioMoviles() {
		ArrayList<Movil> listaMoviles = new ArrayList<>();
		Movil m1 = new Android("Realme C55 8/256GB Sunshower Libre", "Realme", "C55", 8, 256, "Yellow", 231.6);
		Movil m2 = new Ios("Apple iPhone 14 128GB Medianoche Libre", "iPhone 14", 0, 128, "Black", 1008.90);
		
		listaMoviles.add(m1);
		listaMoviles.add(m2);
		
		double media = SergioPhones.mediaPrecioMoviles(listaMoviles);
		assertEquals(media, 620.25);
	}

}
