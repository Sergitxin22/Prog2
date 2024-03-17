package zoo;

public class Reptil extends Animal {
	protected boolean venenoso;

	public Reptil(String nombre, double peso, double edad, double altura, double longitud, String dieta,
			boolean venenoso) {
		super(nombre, peso, edad, altura, longitud, dieta);
		this.venenoso = venenoso;
	}
	
	public Reptil() {
		super();
		this.venenoso = true;
	}
	
	public Reptil(Reptil r) {
		super(r.nombre, r.peso, r.edad, r.altura, r.longitud, r.dieta);
		this.venenoso = r.venenoso;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	@Override
	public String toString() {
		return "Reptil [venenoso=" + venenoso + ", nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", altura="
				+ altura + ", longitud=" + longitud + ", dieta=" + dieta + "]";
	}

	@Override
	public String hablar() {
		return "zzz zzz";
	}
}
