package zoo;

public class Ave extends Animal {
	protected boolean vuela;
	protected int huevos;
	
	public Ave(String nombre, double peso, double edad, double altura, double longitud, String dieta, boolean vuela,
			int huevos) {
		super(nombre, peso, edad, altura, longitud, dieta);
		this.vuela = vuela;
		this.huevos = huevos;
	}
	
	public Ave() {
		super();
		this.vuela = true;
		this.huevos = 0;
	}
	
	public Ave(Ave a) {
		super(a.nombre, a.peso, a.edad, a.altura, a.longitud, a.dieta);
		this.vuela = a.vuela;
		this.huevos = a.huevos;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public int getHuevos() {
		return huevos;
	}

	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}

	@Override
	public String toString() {
		return "Ave [vuela=" + vuela + ", huevos=" + huevos + ", nombre=" + nombre + ", peso=" + peso + ", edad=" + edad
				+ ", altura=" + altura + ", longitud=" + longitud + ", dieta=" + dieta + "]";
	}
	
	public String hablar() {
		return "pio pio";
	}
}
