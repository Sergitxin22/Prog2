package equipos;

import java.util.ArrayList;

public class GestionEquipos {
	public static void main(String[] args) {
		ArrayList<Desarrollador> dev = new ArrayList<Desarrollador>();
		ArrayList<Disenador> dis = new ArrayList<Disenador>();
		
		for (int i = 0; i < 10; i++) {
			Desarrollador nuevoDev = new Desarrollador();
			dev.add(nuevoDev);
			
			Disenador nuevoDis = new Disenador("dni-" + i, "nombre-" + i, "herr-" + i);
			dis.add(nuevoDis);
		}
		
		Equipo equipo1 = new Equipo(dev.get(0), dev, dis);
		Equipo equipo2 = new Equipo(dev.get(1), dev, dis);
		
		System.out.println(equipo1);
	}

}
