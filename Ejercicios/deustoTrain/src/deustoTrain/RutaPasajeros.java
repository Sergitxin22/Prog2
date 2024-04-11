package deustoTrain;

import java.util.ArrayList;

public class RutaPasajeros extends Ruta implements Reservable {
	protected int vagonesPrimera;
	protected int vagonesSegunda;
	protected int vagonesCocheCama;
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

	@Override
	public double getBeneficioPorKm() {
		// TODO Auto-generated method stub
		return 0;
	}

}
