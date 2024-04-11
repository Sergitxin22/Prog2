package grado;

import java.time.LocalDateTime;

public class Asignatura {
	protected String nombre;
	protected int codigo;
	protected int curso;
	protected double creditos;
	protected LocalDateTime fecha;
	
	public Asignatura(String nombre, int codigo, int curso, double creditos, LocalDateTime fecha) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.curso = curso;
		this.creditos = creditos;
		this.fecha = fecha;
	}
	
	public Asignatura() {
		super();
		this.nombre = "Sin nombre";
		this.codigo = 0;
		this.curso = 0;
		this.creditos = 0;
		this.fecha = LocalDateTime.now();
	}
	
	public Asignatura(Asignatura a) {
		super();
		this.nombre = a.nombre;
		this.codigo = a.codigo;
		this.curso = a.curso;
		this.creditos = a.creditos;
		this.fecha = a.fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso + ", creditos=" + creditos
				+ ", fecha=" + fecha + "]";
	}
}
