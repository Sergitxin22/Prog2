package poo;

public class Rectangulo {
	private double altura;
	private double base;
	

	public Rectangulo() {
		super();
		this.altura = 0;
		this.base = 0;
	}


	public Rectangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}

}
