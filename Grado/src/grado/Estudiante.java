package grado;

import java.util.ArrayList;

public class Estudiante implements Comparable<Estudiante> {
	protected String nombre;
	protected String dni;
	protected int curso;
	protected ArrayList<Asignatura> matricula;
	
	public Estudiante(String nombre, String dni, int curso, ArrayList<Asignatura> matricula) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
		this.matricula = new ArrayList<Asignatura>(matricula);
	}
	
	public Estudiante() {
		super();
		this.nombre = "Nombre";
		this.dni = "";
		this.curso = 0;
		this.matricula = new ArrayList<Asignatura>();
	}

	public Estudiante(Estudiante e) {
		super();
		this.nombre = e.nombre;
		this.dni = e.dni;
		this.curso = e.curso;
		this.matricula = new ArrayList<Asignatura>(e.matricula);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public ArrayList<Asignatura> getMatricula() {
		return matricula;
	}

	public void setMatricula(ArrayList<Asignatura> matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", dni=" + dni + ", curso=" + curso + ", matricula=" + matricula + "]";
	}

	@Override
	public int compareTo(Estudiante otro) {
		if (this.curso < otro.curso) {
			return -1;
		} else if (this.curso > otro.curso) {
			return 1;
		} else {
			return this.dni.compareTo(otro.dni);
		}
		// return this.curso - otro.curso;
	}
}
