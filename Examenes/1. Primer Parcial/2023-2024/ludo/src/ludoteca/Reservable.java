package ludoteca;

public interface Reservable {
	boolean reservar(Usuario u);
	boolean anular(Usuario u);
}
