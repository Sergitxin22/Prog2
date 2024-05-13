package deustopintxos;

import java.util.HashMap;
import java.util.Objects;

public class Pedido {
	private int codigo;
	private Dia dia;
	private HashMap<Producto, Integer> productos;
	
	public Pedido(int codigo, Dia dia, HashMap<Producto, Integer> productos) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.productos = new HashMap<Producto, Integer>(productos);
	}
	
	public Pedido(int codigo, Dia dia) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.productos = new HashMap<Producto, Integer>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public HashMap<Producto, Integer> getProductos() {
		return productos;
	}

	public void setProductos(HashMap<Producto, Integer> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Pedido " + codigo + ", " + dia + ": " + productos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return codigo == other.codigo;
	}
	
	// TAREA 2B: método totalPedido
	public double totalPedido() {
		double resultado = 0.0;
		
		for (Producto producto : this.productos.keySet()) {
			int unidades = this.productos.get(producto);			
			double precioPorProducto = producto.getPrecio()*unidades;
			
			resultado += precioPorProducto;
		}
		
		return resultado;
	}
	
}
