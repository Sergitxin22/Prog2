package ludoteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class ActividadCultural implements Reservable {
	protected String descripcion;
	protected TipoActividad tipo;
	protected LocalDate fecha;
	protected Trabajador tabajador;
	protected ArrayList<Usuario> listaAsistentes;
	
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
