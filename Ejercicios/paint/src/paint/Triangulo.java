package paint;

import java.awt.Color;

public class Triangulo extends Forma {
	protected double base;
	protected double altura;
	
	public Triangulo(double x, double y, Color color, double base, double altura) {
		super(x, y, color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
