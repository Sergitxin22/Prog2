package poo;

public class Circulo {
	
	private double radio;
	private String color;

	public Circulo() {
		this.radio = 0;
		this.color = "rojo";
	}

	public Circulo(double radio, String color) {
		super();
		this.radio = radio;
		this.color = color;
	}

	// Getters
	public double getRadio() {
		return radio;
	}
	
	public String getColor() {
		return color;
	}

	// Setters
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
