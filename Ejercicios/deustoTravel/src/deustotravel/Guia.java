package deustotravel;

import java.util.Objects;

public class Guia implements Cobrable, Comparable<Guia> {
	protected String nombre;
	protected double precio;
	protected int personas;
	protected boolean pagado;
	
	public Guia(String nombre, double precio, int personas, boolean pagado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.personas = personas;
		this.pagado = pagado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	@Override
	public String toString() {
		return "Guia [nombre=" + nombre + ", precio=" + precio + ", personas=" + personas + ", pagado=" + pagado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, pagado, personas, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guia other = (Guia) obj;
		return Objects.equals(nombre, other.nombre) && pagado == other.pagado && personas == other.personas
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public double calcularCoste() {
		return this.precio * this.personas;
	}

	@Override
	public boolean cobrar() {
		// Habría que llamar a una pasarela de pago...
		this.pagado = true;
		return true;
	}

	@Override
	public int compareTo(Guia o) {
		return (int) (this.getPrecio() - o.getPrecio());
	}
	
	
}
