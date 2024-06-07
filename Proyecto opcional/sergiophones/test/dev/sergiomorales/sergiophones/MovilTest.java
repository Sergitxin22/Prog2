package dev.sergiomorales.sergiophones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovilTest {

	@Test
	void testConstructor() {
		Movil m1 = new Android("Realme C55 8/256GB Sunshower Libre", "Realme", "C55", 8, 256, "Yellow", 231.6);
		
		assertEquals(m1 instanceof Android, true);
		assertEquals(m1.getAlmacenamiento(), 256);
		assertEquals(m1.getPrecio(), 231.6);
		m1.mejorarAlmacenamiento(5);
		assertEquals(m1.getPrecio(), 236.6);
		
		try {
			Movil m2 = new Ios("Apple iPhone 14 128GB Medianoche Libre", "iPhone 14", 0, 128, "Black", -1008.9999999999999);
		    fail("Error: debería haber fallado y no ha fallado");
		} catch (Exception e) {
			// Ok
		}		
	}

}
