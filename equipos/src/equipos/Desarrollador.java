package equipos;

import java.util.ArrayList;

public class Desarrollador extends Empleado {
	protected ArrayList<String> lenguajes;

	public Desarrollador(String dni, String nombre, ArrayList<String> lenguajes) {
		super(dni, nombre);
		this.lenguajes = new ArrayList<String>(lenguajes);
	}
	
	public Desarrollador() {
		super();
		this.lenguajes = new ArrayList<String>();
	}
	
	public Desarrollador(Desarrollador d) {
		super(d.dni, d.nombre);
		this.lenguajes = new ArrayList<String>(lenguajes);
	}

	public ArrayList<String> getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(ArrayList<String> lenguajes) {
		this.lenguajes = lenguajes;
	}
}
