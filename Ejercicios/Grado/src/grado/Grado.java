package grado;

import java.util.ArrayList;
import java.util.Collections;

public class Grado {
	protected String nombre;
	protected ArrayList<Estudiante> estudiantes;
	
	public Grado(String nombre, ArrayList<Estudiante> estudiantes) {
		super();
		this.nombre = nombre;
		this.estudiantes = new ArrayList<Estudiante>(estudiantes);
	}
	
	public Grado() {
		super();
		this.nombre = "";
		this.estudiantes = new ArrayList<Estudiante>();
	}
	
	public Grado(Grado g) {
		super();
		this.nombre = g.nombre;
		this.estudiantes = new ArrayList<Estudiante>(g.estudiantes);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Grado [nombre=" + nombre + ", estudiantes=" + estudiantes + "]";
	}
	
	public void ordenar() {
		Collections.sort(estudiantes);
	}
}
