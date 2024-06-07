package dev.sergiomorales.sergiophones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Venta implements Cobrable {
	protected static int contador = 1;
	
	protected int id;
	protected Trabajador empleado;
	protected Cliente cliente;
	protected HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> moviles;
	
	public Venta(Trabajador empleado, Cliente cliente) {
		super();
		this.empleado = empleado;
		this.cliente = cliente;
		this.moviles = new HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>>();
		this.id = contador;
		contador++;
	}

	public Trabajador getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Trabajador empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> getMoviles() {
		return moviles;
	}

	public void setMoviles(HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> moviles) {
		this.moviles = moviles;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", empleado=" + empleado + ", cliente=" + cliente + ", moviles=" + moviles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, empleado, id, moviles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(empleado, other.empleado) && id == other.id
				&& Objects.equals(moviles, other.moviles);
	}

	@Override
	public double cobrarVenta() { // Si es socio 20% de descuento
		double total = 0;
		for (SISTEMA_OPERATIVO so : moviles.keySet()) {
			ArrayList<Movil> listaMoviles = moviles.get(so);
			
			for (Movil movil : listaMoviles) {
				total += movil.getPrecio();
			}
		}
		
		if (cliente.isSocio()) {
			return total * 0.8;
		}
		return total;
	}
}
