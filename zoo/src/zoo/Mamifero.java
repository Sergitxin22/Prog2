package zoo;

public class Mamifero extends Animal{
	protected boolean terrestre;
	protected int camada;
	
	public Mamifero(String nombre, double peso, double edad, double altura, double longitud, String dieta,
			boolean terrestre, int camada) {
		super(nombre, peso, edad, altura, longitud, dieta);
		this.terrestre = terrestre;
		this.camada = camada;
	}

	public Mamifero() {
		super();
		this.terrestre = true;
		this.camada = 1;
	}
	
	public Mamifero(Mamifero m) {
		super(m.nombre, m.peso, m.edad, m.altura, m.longitud, m.dieta);
		this.terrestre = m.terrestre;
		this.camada = m.camada;
	}
	
	public boolean isTerrestre() {
		return terrestre;
	}

	public void setTerrestre(boolean terrestre) {
		this.terrestre = terrestre;
	}

	public int getCamada() {
		return camada;
	}

	public void setCamada(int camada) {
		this.camada = camada;
	}

	@Override
	public String toString() {
		return "Mamifero [terrestre=" + terrestre + ", camada=" + camada + ", nombre=" + nombre + ", peso=" + peso
				+ ", edad=" + edad + ", altura=" + altura + ", longitud=" + longitud + ", dieta=" + dieta + "]";
	}
	
	public String hablar() {
		return "pio pio";
	}
}
