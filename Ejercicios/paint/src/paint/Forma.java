package paint;

import java.awt.Color;

public class Forma implements Dibujable {
	protected double x;
	protected double y;
	protected Color color;
	
	public Forma(double x, double y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
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

	
	@Override
	public String toString() {
		return "Forma [x=" + x + ", y=" + y + ", color=" + color + "]";
	}


	@Override
	public void dibujar() {
		System.out.println("Dibujando " + this + "...");
	}

}
