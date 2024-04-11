package deustotravel;

import java.util.ArrayList;
import java.util.Objects;

public class Excursion implements Cobrable {
	protected String nombre;
	protected ArrayList<Trayecto> trayectos;
	protected boolean pagada;
	
	public Excursion(String nombre, ArrayList<Trayecto> trayectos, boolean pagada) {
		super();
		this.nombre = nombre;
		this.trayectos = new ArrayList<Trayecto>(trayectos);
		this.pagada = pagada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Trayecto> getTrayectos() {
		return trayectos;
	}

	public void setTrayectos(ArrayList<Trayecto> trayectos) {
		this.trayectos = trayectos;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	@Override
	public String toString() {
		return "Excursion [nombre=" + nombre + ", trayectos=" + trayectos + ", pagada=" + pagada + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Excursion other = (Excursion) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public double calcularCoste() {
		double resultado = 0;
		
		for (Trayecto trayecto : trayectos) {
			resultado += trayecto.getDistancia() * trayecto.getTransporte().getPrecioPorKm();
		}
		
		return resultado;
	}

	@Override
	public boolean cobrar() {
		this.pagada = true;
		return true;
	}
	
	
}
