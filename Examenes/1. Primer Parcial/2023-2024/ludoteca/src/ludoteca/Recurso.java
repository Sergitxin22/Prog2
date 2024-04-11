package ludoteca;

public abstract class Recurso {
	private static int contador = 1;
	
	protected int cod;

	public Recurso() {
		super();
		this.cod = contador;
		Recurso.contador++;
	}
	
	protected abstract boolean esFamiliar();

	@Override
	public String toString() {
		return "Recurso";
	}	
}
