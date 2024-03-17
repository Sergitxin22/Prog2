package deustoTrain;

import java.util.ArrayList;

public abstract class Ruta {
	protected Tren tren;
	protected ArrayList<Trayecto> trayectos;

	public abstract double getBeneficioPorKm();
}
