package deustoTrain;

import java.util.ArrayList;

public class Estacion implements Reservable {
	protected String nombre;
	protected double latitud;
	protected double longitud;
	protected boolean cafeteria;
	protected ArrayList<Pasajero> pasajeros;

	@Override
	public boolean reservar(Pasajero pasajero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anular(Pasajero pasajero) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
