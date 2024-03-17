package ventanasGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import utils.ventanas.ventanaBitmap.VentanaGrafica;

public class Ejemplo {

	/** M�todo principal donde hacemos unos ejemplos de VentanaGrafica
	 * @param args	argumentos recibidos por consola (no se usan).
	 */
	public static void main(String[] args) {
		final int ancho = 800;
		final int alto = 600;
		
		int personajeX = ancho/2;
		int personajeY = alto/2;
		int personajeO = 0;
		int personajeV = 3;
		
		int maloX = 0;
		int maloY = 0;
		int maloO = 0;
		int maloVX = 5;
		int maloVY = 5;
		double maloZ = 0.1;
		
		VentanaGrafica v = new VentanaGrafica(ancho, alto, "Hola");

		for (int i = 0; i < 1000; i++) {
			int an = (int) (Math.random() * ancho);
			int al = (int) (Math.random() * alto);
			int gr = (int) (Math.random() * 5) + 1;
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			
			v.dibujaFlecha(ancho/2, alto/2, an, al, gr, new Color(r, g, b));
		}
		
		v.dibujaTexto(ancho/2 - 70, alto/2 + 10, "Hola mundo", new Font("Arial", Font.BOLD, 30), Color.YELLOW);

		v.esperaAClick();
		
		v.borra();
		
		boolean salir = false;
		
		while (!salir) {
			// Atender eventos
			double d = Math.sqrt((maloX - personajeX) * (maloX - personajeX) + (maloY - personajeY) * (maloY - personajeY));
			if (d < 20) {
				salir = true;
			}
			if (v.isTeclaPulsada(KeyEvent.VK_X)) {
				salir = true;
			}
			if (v.isTeclaPulsada(KeyEvent.VK_UP) && personajeY > 0) {
				personajeY -= personajeV;
			}
			if (v.isTeclaPulsada(KeyEvent.VK_DOWN) && personajeY < alto) {
				personajeY += personajeV;
			}
			if (v.isTeclaPulsada(KeyEvent.VK_LEFT) && personajeX > 0) {
				personajeX -= personajeV;
			}
			if (v.isTeclaPulsada(KeyEvent.VK_RIGHT) && personajeX < ancho) {
				personajeX += personajeV;
			}
			// Modificar el estado del juego
			maloX += maloVX;
			maloY += maloVY;
			if (maloX < 0 || maloX > ancho) {
				maloVX = -maloVX;
			}
			if (maloY < 0 || maloY > alto) {
				maloVY = -maloVY;
			}
			maloZ += 0.0001;
			// Dibujar el nuevo estado
			v.borra();
			v.dibujaImagen("img/sonic.png", personajeX, personajeY, 1.0, personajeO, 1.0f);
			v.dibujaImagen("img/UD-green.png", maloX, maloY, maloZ, maloO, 1.0f);
			v.espera(10);
		}
		
		v.acaba();
	}

}