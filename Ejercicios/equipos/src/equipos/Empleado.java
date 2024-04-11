package equipos;

public class Empleado {
	protected String dni;
	protected String nombre;
	
	public Empleado(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Empleado() {
		super();
		this.dni = "Sin DNI";
		this.nombre = "Sin nombre";
	}
	
	public Empleado(Empleado e) {
		super();
		this.dni = e.dni;
		this.nombre = e.nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
