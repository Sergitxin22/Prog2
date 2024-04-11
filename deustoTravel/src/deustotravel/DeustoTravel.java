package deustotravel;

import java.util.ArrayList;
import java.util.Collections;

public class DeustoTravel {
	public static Guia guiaMasCara(ArrayList<Guia> guias) {
		Guia mayor = guias.get(0);
		
		for (Guia guia : guias) {
			if (guia.getPrecio() > mayor.getPrecio()) {
				mayor = guia;
			}
		}
		
		return mayor;
	}
	
	public static Guia guiaSegundaMasBarata(ArrayList<Guia> guias) {
		ArrayList<Guia> guiasOrdenada = new ArrayList<Guia>(guias);

		Collections.sort(guiasOrdenada);
		
		return guiasOrdenada.get(1);
	}

	public static void main(String[] args) {
		ArrayList<Excursion> excursiones = new ArrayList<Excursion>();
		ArrayList<Guia> guias = new ArrayList<Guia>();
		ArrayList<Trayecto> trayectos = new ArrayList<Trayecto>();
		
		for (int i = 0; i < 15; i++) {
			guias.add(new Guia("guia"+i, Math.random()*10 + 5, 10, false));
		}
		
		for (int i = 0; i < 30; i++) {
			double latOrig = Math.random() * 3 + 40;
			double latDest = Math.random() * 3 + 40;

			double longOrig = Math.random() + 2;
			double longDest = Math.random() + 2;
			Transporte transporte;
			
			if (Math.random() > 0.5) {
				transporte = new Avioneta(5, 2500, 7);
			} else {
				transporte = new Barco(i, longDest, false);
			}
			
			trayectos.add(new Trayecto(latOrig, longOrig, latDest, longDest, transporte));
		}
		
		for (int i = 0; i < 50; i++) {
			ArrayList<Trayecto> trays = new ArrayList<Trayecto>();
			
			for (int j = 0; j < 50; j++) {
				int alea = (int) (Math.random() * trayectos.size());
				trays.add(trayectos.get(alea));
			}
			excursiones.add(new Excursion("excursion"+i, trays, false));
		}
	}
}
