package equipos;

import java.util.ArrayList;

public class Equipo {
	protected Empleado jefe;
	protected ArrayList<Desarrollador> desarrolladores;
	protected ArrayList<Disenador> disenadores;
	
	public Equipo(Empleado jefe, ArrayList<Desarrollador> desarrolladores, ArrayList<Disenador> disenador) {
		super();
		this.jefe = jefe;
		this.desarrolladores = new ArrayList<Desarrollador>(desarrolladores);
		this.disenadores = new ArrayList<Disenador>(disenador);
	}
	
	public Equipo() {
		super();
		this.jefe = null;
		this.desarrolladores = new ArrayList<Desarrollador>();
		this.disenadores = new ArrayList<Disenador>();
	}
	
	public Equipo(Equipo e) {
		super();
		this.jefe = e.jefe;
		this.desarrolladores = new ArrayList<Desarrollador>(e.desarrolladores);
		this.disenadores = new ArrayList<Disenador>(e.disenadores);
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public ArrayList<Desarrollador> getDesarrolladores() {
		return desarrolladores;
	}

	public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {
		this.desarrolladores = desarrolladores;
	}

	public ArrayList<Disenador> getDisenadores() {
		return disenadores;
	}

	public void setDisenadores(ArrayList<Disenador> disenadores) {
		this.disenadores = disenadores;
	}

	@Override
	public String toString() {
		return "Equipo [jefe=" + jefe + ", desarrolladores=" + desarrolladores + ", disenadores=" + disenadores + "]";
	}
}
