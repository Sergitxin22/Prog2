package ludoteca;

public class Libro extends Recurso implements Reservable {
	protected String titulo;
	protected String autoria;
	protected String genero;
	protected Usuario usuario;
	
	@Override
	public boolean reservar(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean anular(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}
}
