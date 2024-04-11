package paint;

import java.awt.Color;
import java.util.ArrayList;

public class Dibujo implements Dibujable {
	protected ArrayList<Forma> formas;
	protected ArrayList<Texto> textos;
	protected Color fondo;
	
	public Dibujo(ArrayList<Forma> formas, ArrayList<Texto> textos, Color fondo) {
		super();
		this.formas = new ArrayList<Forma>(formas);
		this.textos = new ArrayList<Texto>(textos);
		this.fondo = fondo;
	}
	
	public Dibujo() {
		super();
		this.formas = new ArrayList<Forma>();
		this.textos = new ArrayList<Texto>();
		this.fondo = Color.WHITE;
	}

	public ArrayList<Forma> getFormas() {
		return formas;
	}

	public void setFormas(ArrayList<Forma> formas) {
		this.formas = formas;
	}

	public ArrayList<Texto> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<Texto> textos) {
		this.textos = textos;
	}

	public Color getFondo() {
		return fondo;
	}

	public void setFondo(Color fondo) {
		this.fondo = fondo;
	}

	@Override
	public String toString() {
		return "Dibujo [formas=" + formas + ", textos=" + textos + ", fondo=" + fondo + "]";
	}

	@Override
	public void dibujar() {
		for (Forma forma : formas) {
			forma.dibujar();
		}
		for (Texto texto: textos) {
			texto.dibujar();
		}		
	}
	
	
}
