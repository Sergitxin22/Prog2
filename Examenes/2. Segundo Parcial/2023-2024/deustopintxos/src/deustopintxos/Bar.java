package deustopintxos;

import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeMap;

public class Bar {
	private String nombre;
	private LinkedList<Pedido> pedidos;
	// TAREA 2A: nuevo atributo recaudacion
	private TreeMap<Dia, Double> recaudacion;
		
	public Bar(String nombre, LinkedList<Pedido> pedidos) {
		super();
		this.nombre = nombre;
		this.pedidos = new LinkedList<Pedido>(pedidos);
		this.recaudacion = new TreeMap<Dia, Double>();
	}
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
		this.pedidos = new LinkedList<Pedido>();
		this.recaudacion = new TreeMap<Dia, Double>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public TreeMap<Dia, Double> getRecaudacion() {
		return this.recaudacion;
	}

	@Override
	public String toString() {
		return "Bar " + nombre + ", " + pedidos.size() + " pedidos. Recaudación: " + this.getRecaudacion();
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
		Bar other = (Bar) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	// TAREA 2C: metodo cobrarPedidos
	public void cobrarPedidos() {
		while (!pedidos.isEmpty()) {
			Pedido p = pedidos.removeFirst();
			Dia d = p.getDia();
			double totalPedido = p.totalPedido();
			
			if (this.recaudacion.containsKey(d)) {
				double valorAnterior = this.recaudacion.get(d);
				this.recaudacion.put(d, valorAnterior + totalPedido);
			} else {
				this.recaudacion.put(d, totalPedido);
			}
		}
	}
	
}
