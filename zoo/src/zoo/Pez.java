package zoo;

public class Pez extends Animal implements Imprimible {
	protected int tipoAgua; // 0: dulce, 1: salada, 2: ambas
	protected double tempAgua;
	
	public Pez(String nombre, double peso, double edad, double altura, double longitud, String dieta, int tipoAgua,
			double tempAgua) {
		super(nombre, peso, edad, altura, longitud, dieta);
		this.tipoAgua = tipoAgua;
		this.tempAgua = tempAgua;
	}

	public Pez() {
		super();
		this.tipoAgua = 0;
		this.tempAgua = 0;
	}
	
	public Pez(Pez p) {
		super(p.nombre, p.peso, p.edad, p.altura, p.longitud, p.dieta);
		this.tipoAgua = p.tipoAgua;
		this.tempAgua = p.tempAgua;
	}

	public int getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(int tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public double getTempAgua() {
		return tempAgua;
	}

	public void setTempAgua(double tempAgua) {
		this.tempAgua = tempAgua;
	}

	@Override
	public String toString() {
		return "Pez [tipoAgua=" + tipoAgua + ", tempAgua=" + tempAgua + ", nombre=" + nombre + ", peso=" + peso
				+ ", edad=" + edad + ", altura=" + altura + ", longitud=" + longitud + ", dieta=" + dieta + "]";
	}
	
	public String hablar() {
		return "blu glu";
	}

	@Override
	public String imprimir() {
		return "🐠";
	}
}
