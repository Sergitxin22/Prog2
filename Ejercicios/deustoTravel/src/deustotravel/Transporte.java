package deustotravel;

import java.util.Objects;

public abstract class Transporte {
	private static int contador = 1;
	
	protected int codigo;
	protected int personas;
	
	public Transporte(int personas) {
		super();
		this.codigo = Transporte.contador;
		Transporte.contador++;
		this.personas = personas;
	}

	public Transporte() {
		super();
		this.codigo = Transporte.contador;
		Transporte.contador++;
		this.personas = 0;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Transporte [codigo=" + codigo + ", personas=" + personas + "]";
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
		Transporte other = (Transporte) obj;
		return codigo == other.codigo;
	}
	
	public abstract double getPrecioPorKm();
	
}
