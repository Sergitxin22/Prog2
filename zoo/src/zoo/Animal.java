package zoo;

public abstract class Animal {
	protected String nombre;
	protected double peso;
	protected double edad;
	protected double altura;
	protected double longitud;
	protected String dieta;
	
	public Animal(String nombre, double peso, double edad, double altura, double longitud, String dieta) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.altura = altura;
		this.longitud = longitud;
		this.dieta = dieta;
	}
	
	public Animal() {
		super();
		this.nombre = "Sin nombre";
		this.peso = 0;
		this.edad = 0;
		this.altura = 0;
		this.longitud = 0;
		this.dieta = "Sin dieta definida";
	}

	public Animal(Animal a) {
		super();
		this.nombre = a.nombre;
		this.peso = a.peso;
		this.edad = a.edad;
		this.altura = a.altura;
		this.longitud = a.longitud;
		this.dieta = a.dieta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getEdad() {
		return edad;
	}
	
	public void setEdad(double edad) {
		this.edad = edad;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public String getDieta() {
		return dieta;
	}
	
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", altura=" + altura + ", longitud="
				+ longitud + ", dieta=" + dieta + "]";
	}
	
	public abstract String hablar();
}
