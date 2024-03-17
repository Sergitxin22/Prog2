package paint;

import java.awt.Color;
import java.awt.Font;

public class Texto implements Dibujable, Imprimible {
	protected double x;
	protected double y;
	protected Color color;
	protected String texto;
	protected Font tipografia;
	
	public Texto(double x, double y, Color color, String texto, Font tipografia) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
		this.texto = texto;
		this.tipografia = tipografia;
	}
	
	public Texto(double x, double y, String texto) {
		super();
		this.x = x;
		this.y = y;
		this.color = Color.BLACK;
		this.texto = texto;
		this.tipografia = new Font("Arial", Font.PLAIN, 16);
	}
	

	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public String getTexto() {
		return texto;
	}



	public void setTexto(String texto) {
		this.texto = texto;
	}



	public Font getTipografia() {
		return tipografia;
	}



	public void setTipografia(Font tipografia) {
		this.tipografia = tipografia;
	}


	@Override
	public String toString() {
		return "Texto [x=" + x + ", y=" + y + ", color=" + color + ", texto=" + texto + ", tipografia=" + tipografia
				+ "]";
	}


	@Override
	public void dibujar() {
		System.out.println("Dibujando " + this + "...");
	}

	@Override
	public void imprimir() {
		System.out.println(texto);
	}
	
}
