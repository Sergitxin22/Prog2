package deustospace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/** Clase de agencia espacial, contenedora de datos
 */
public class DeustoSpace implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Mision> misiones;
	private ArrayList<Personal> personal;
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones y personal. Se inicia con la lista de misiones y personal vacías
	 */
	public DeustoSpace() {
		super();
		this.misiones = new ArrayList<Mision>();
		this.personal = new ArrayList<Personal>();
	}
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones y personal.
	 * @param misiones	Misiones iniciales de la agencia
	 * @param personal	Personal inicial de la agencia
	 */
	public DeustoSpace(ArrayList<Mision> misiones, ArrayList<Personal> personal) {
		super();
		this.misiones = new ArrayList<Mision>(misiones);
		this.personal = new ArrayList<Personal>(personal);
	}

	public ArrayList<Mision> getMisiones() {
		return misiones;
	}

	public ArrayList<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "DeustoSpace [misiones=" + misiones + ", personal=" + personal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(misiones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeustoSpace other = (DeustoSpace) obj;
		return Objects.equals(misiones, other.misiones);
	}
	
	/** Crea datos de prueba iniciales de la agencia: una serie de misiones y una lista de personal
	 */
	public void datosIniciales() {
		Mision m0 = new Mision("DS I", "Florida USA", "ISS", 2025, 3, 20);
		m0.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m1 = new Mision("DS II", "Florida USA", "ISS", 2025, 7, 21);
		m1.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m2 = new Mision("DS III", "Guayana Francesa", "Luna", 2026, 2, 12);
		m2.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m3 = new Mision("DS IV", "Houston USA", "ISS", 2026, 3, 14);
		m3.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m4 = new Mision("DS V", "Guayana Francesa", "Luna", 2027, 2, 12);
		m4.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m5 = new Mision("DS VI", "Baikonur", "ISS", 2027, 3, 11);
		m5.setNave(new Nave("Soyuz", "Roscosmos", 38, 7020));
		personal.add(new Astronauta("Pablo Álvarez Fernández", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Sara García Alonso", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Andrea Patassa", "Italy", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Tierra("Ana García", "Spain", 1));
		personal.add(new Tierra("Andrea Ors", "Italy", 1));
		personal.add(new Tierra("Laura Johnson", "UK", 1));
		personal.add(new Tierra("Andrea Johnson", "Spain", 1));
		personal.add(new Tierra("Mark Becker", "France", 1));
		personal.add(new Tierra("Ana García", "Spain", 2));
		personal.add(new Tierra("Andrea Ors", "Italy", 2));
		personal.add(new Tierra("Laura Johnson", "UK", 2));
		personal.add(new Tierra("John Becker", "Spain", 2));
		personal.add(new Tierra("Mark Bocelli", "Italy", 2));
		personal.add(new Tierra("Ana García", "Spain", 3));
		personal.add(new Tierra("Mark Ors", "Germany", 3));
		personal.add(new Tierra("John Johnson", "Spain", 3));
		personal.add(new Tierra("Laura Becker", "Germany", 3));
		personal.add(new Tierra("Andrea Bocelli", "Spain", 3));
		personal.add(new Tierra("Ana García", "Spain", 4));
		personal.add(new Tierra("Laura Ors", "UK", 4));
		personal.add(new Tierra("Mark Johnson", "Italy", 4));
		personal.add(new Tierra("Andrea Becker", "Spain", 4));
		personal.add(new Tierra("John Bocelli", "UK", 4));
		personal.add(new Tierra("Ana García", "Spain", 5));
		personal.add(new Tierra("Ana Ors", "Belgium", 5));
		personal.add(new Tierra("Ana Johnson", "UK", 5));
		personal.add(new Tierra("Ana Becker", "Germany", 5));
		personal.add(new Tierra("Ana Bocelli", "Italy", 5));
		m1.setPersonal(personal);
		m2.setPersonal(personal);
		m3.setPersonal(personal);
		m4.setPersonal(personal);
		m5.setPersonal(personal);
		misiones.add(m0);
		misiones.add(m1);
		misiones.add(m2);
		misiones.add(m3);
		misiones.add(m4);
		misiones.add(m5);
	}

	// TAREA 1A: cargarMisionesCSV
	public void cargarMisionesCSV() {
		File f = new File("misiones.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				
				try {
					String nombre = campos[0];
					String lugar = campos[1];
					String destino = campos[2];
					int dia = Integer.parseInt(campos[3]);
					int mes = Integer.parseInt(campos[4]);
					int anyo = Integer.parseInt(campos[8]);
					
					// Crear nave
					String nombreNave = campos[6];
					String proveedor = campos[7];
					double coste = Double.parseDouble(campos[8]);
					double carga = Double.parseDouble(campos[9]);
					
					Nave nave = new Nave(nombreNave, proveedor, coste, carga);
					
					// m.nave = null;
					// m.personal = new ArrayList<Personal>();
					Mision m = new Mision(nombre, lugar, destino, anyo, mes, dia);
					m.setNave(nave);
					
					this.misiones.add(m);
				} catch (IndexOutOfBoundsException ex) {
					System.err.println("Faltan datos");
				} catch (NumberFormatException ex) {
					System.err.println("Un dato entero o real es erroneo");
				} catch (DateTimeException ex) {
					System.err.println("Una fecha es erronea");
				} catch (Exception ex) {
					System.err.println("Ha ocurrido un error desconocido");
				}				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el archivo especificado");
		}
	}

	// TAREA 1B: cargarPersonalCSV
	public void cargarPersonalCSV() {
		File f = new File("personal.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				
				try {
					String tipo = campos[0];
					String nombre = campos[1];
					String pais = campos[2];
					String caracteristicas = campos[3];
					
					Personal p = null;
					
					if (tipo.equalsIgnoreCase("Astronauta")) {
						String[] listaHabilidades = caracteristicas.split(",");
						ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
						for (String caracteristica : listaHabilidades) {
							Habilidad habilidad = Habilidad.valueOf(caracteristica);
							habilidades.add(habilidad);
						}
						
						p = new Astronauta(nombre, pais, habilidades);
					} else if (tipo.equalsIgnoreCase("Personal de Tierra")) {
						int nivel = Integer.parseInt(caracteristicas);
						p = new Tierra(nombre, pais, nivel);
					}
					
					this.personal.add(p);
				} catch (IndexOutOfBoundsException ex) {
					//System.err.println("faltan datos");
				} catch (NumberFormatException ex) {
					//System.err.println("un dato entero o real es erroneo");
				}
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TAREA 1C: asignarPersonal
	public void asignarPersonal() {
		HashSet<Astronauta> astronautasUnicos = new HashSet<Astronauta>();
		HashSet<Tierra> personalTierraUnicos = new HashSet<Tierra>();
		
		// Cada persona solo está una vez
		for (Personal persona : this.personal) {
			if (persona instanceof Astronauta) {
				astronautasUnicos.add((Astronauta) persona);
			} else {
				personalTierraUnicos.add((Tierra) persona);
			}
		}
		
		for (Mision mision : this.misiones) {
			ArrayList<Astronauta> astronautas = new ArrayList<Astronauta>(astronautasUnicos);
			ArrayList<Tierra> personalTierra = new ArrayList<Tierra>(personalTierraUnicos);
			
			boolean astronautaPiloto = false;
			for (int i = 0; i < 3; i++) { // 3 astronautas
				int random = (int) (Math.random()*astronautas.size());
				Astronauta a = astronautas.get(random);
				
				
				// Comprobamos el minimo de un astronauta puiloto
				if (a.getHabilidades().contains(Habilidad.PILOTAR)) {
					astronautaPiloto = true;
				} 
				
				if ((i == 2) && !astronautaPiloto) {
					while (!a.getHabilidades().contains(Habilidad.PILOTAR)) {
						random = (int) (Math.random()*astronautas.size());
						a = astronautas.get(random);
						
					}
					astronautaPiloto = true;
					//System.out.println("Recalcular");
				}
				
				mision.getPersonal().add(a);
				astronautas.remove(a);
				
				//System.out.println("Vuelta");
			}
			
			for (int j = 0; j < 25; j++) { // 25 personal de tierra
				int random = (int) (Math.random()*personalTierra.size());
				Tierra t = personalTierra.get(random);
				mision.getPersonal().add(t);
				personalTierra.remove(t);
				//System.out.println(personalTierra.size());
			}
		}
		
	}
	
	// TAREA 3A: costesPorPais
	// public ... costesPorPais() {
	// TODO tarea 3a
	public void costesPorPais() {
		HashMap<String, Double> costePorPais = new HashMap<>();
		
		for (Mision mision : misiones) {
			String pais = mision.getLugar();
			
			// Calculo el coste del personal
			double costeMision = mision.getCosteTotal();
			double costeNave = 0;
			
			// Sumo valor totalMision
			if (!costePorPais.containsKey(pais)) {
				costePorPais.put(pais, costeMision);
			} else {
				double valorAnterior = costePorPais.get(pais);
				costePorPais.put(pais, costeMision+valorAnterior);
			}
			
			// Elijo el pais de la nave
			if (mision.getNave().getProveedor().equalsIgnoreCase("Arianespace")) {
				pais = "France";
			} else if (mision.getNave().getProveedor().equalsIgnoreCase("SpaceX")) {
				pais = "USA";
			} else {
				pais = "Russia";
			}
			
			// Sumo valor nave
			double precioNave = mision.getNave().getCoste();
			if (!costePorPais.containsKey(pais)) {
				costePorPais.put(pais, precioNave);
			} else {
				double valorAnterior = costePorPais.get(pais);
				costePorPais.put(pais, precioNave+valorAnterior);
			}
			
		}
	}
	
	// TAREA 3B: destinosPorCoste
	public void destinosPorCoste() {
		HashMap<String, ArrayList<Mision>> misionesPorDestino = new HashMap<>();
		
		// Creo el mapa
		for (Mision mision : misiones) {
			String destino = mision.getDestino();
			if (!misionesPorDestino.containsKey(destino)) {
				misionesPorDestino.put(destino, new ArrayList<Mision>());
				
			}
			misionesPorDestino.get(destino).add(mision);
		}
		
		// Imprimo el mapa
		for (String clave : misionesPorDestino.keySet()) {
			System.out.println("Misiones a " + clave + "...");
			ArrayList<Mision> misiones = misionesPorDestino.get(clave);
			
			for (Mision mision : misiones) {
				System.out.println("\t -" + mision);
			}
			
		}
		
	}

}
