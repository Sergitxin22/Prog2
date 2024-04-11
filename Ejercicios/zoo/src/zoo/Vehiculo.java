package zoo;

public class Vehiculo implements Imprimible {
	protected int ruedas;
	protected boolean electrico;
	
	public Vehiculo(int ruedas, boolean electrico) {
		super();
		this.ruedas = ruedas;
		this.electrico = electrico;
	}
	
	public Vehiculo() {
		super();
		this.ruedas = 2;
		this.electrico = true;
	}
	
	public Vehiculo(Vehiculo v) {
		super();
		this.ruedas = v.ruedas;
		this.electrico = v.electrico;
	}

	@Override
	public String imprimir() {
		return "🏎️";
	}
}
