package equipos;

public class Disenador extends Empleado {
	protected String herramienta;

	public Disenador(String dni, String nombre, String herramienta) {
		super(dni, nombre);
		this.herramienta = herramienta;
	}
	
	public Disenador() {
		super();
		this.herramienta = "Ninguna";
	}
	
	public Disenador(Disenador d) {
		super(d.dni, d.nombre);
		this.herramienta = d.herramienta;
	}

	public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}
}
