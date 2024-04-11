package deustoTrain;

public class Tren {
	private static int contador = 1;
	
	protected int cv;
	protected String modelo;
	protected int codigo;
	
	public Tren(int cv, String modelo, int codigo) {
		super();
		this.cv = cv;
		this.modelo = modelo;
		this.codigo = Tren.contador;
		Tren.contador++;
	}
}
