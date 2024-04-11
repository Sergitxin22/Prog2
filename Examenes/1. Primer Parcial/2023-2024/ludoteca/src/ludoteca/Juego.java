package ludoteca;

import java.util.Objects;

public class Juego extends Recurso implements Comparable<Juego> {
	protected int id;
	protected String titulo;
	protected double duracion;
	protected int edad;
	
	public Juego(String titulo, double duracion, int edad) {
		super();
		this.id = super.cod;
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
	}
	
	public Juego() {
		super();
		this.id = super.cod;
		this.titulo = "Sin título";
		this.duracion = 0;
		this.edad = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, edad, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		return Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion) && edad == other.edad
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Juego [titulo=" + titulo + ", duracion=" + duracion + ", edad=" + edad  + ", id=" + id + "]";
	}

	@Override
	protected boolean esFamiliar() {
		return this.edad < 10;
	}

	@Override
	public int compareTo(Juego o) {
		return this.edad - o.edad;
	}
	
}
