package dev.sergiomorales.sergiophones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class SergioPhones {

	public static void main(String[] args) {
		ArrayList<Movil> listaMoviles = leerMovilesCSV();
		//System.out.println(listaMoviles);
		
		ArrayList<Trabajador> listaEmpleados = generarEmpleados();
		//System.out.println(listaEmpleados);
		
		ArrayList<Cliente> listaClientes = generarClientes();
		//System.out.println(listaClientes);
		
		LinkedList<Venta> colaVentas = generarVentas(listaEmpleados, listaClientes, listaMoviles);
		System.out.println(colaVentas);
		
		guardarMovilesVendidosCSV(colaVentas);
		
		double mediaPrecios = mediaPrecioMoviles(listaMoviles);
		System.out.println("Media precios: " + String.format("%.2f", mediaPrecios) + "€");
		
		SISTEMA_OPERATIVO soMasVendido = sistemaOperativoMasVendido(colaVentas);
		System.out.println(soMasVendido);
		
		double totalCaja = cobrarVentas(colaVentas);
		System.out.println(colaVentas);
		System.out.println(String.format("%.2f", totalCaja));
	}

	private static double cobrarVentas(LinkedList<Venta> colaVentas) {
		double totalCaja = 0;
		while (!colaVentas.isEmpty()) {
			Venta v = colaVentas.removeFirst();
			totalCaja += v.cobrarVenta();
		}
		
		return totalCaja;
	}
	
	private static SISTEMA_OPERATIVO sistemaOperativoMasVendido(LinkedList<Venta> colaVentas) {
		TreeMap<SISTEMA_OPERATIVO, Integer> movilesPorSO = new TreeMap<>();
		for (Venta venta : colaVentas) {
			HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> mapaMoviles = venta.getMoviles();
			for (SISTEMA_OPERATIVO so : mapaMoviles.keySet()) {
				ArrayList<Movil> listaMoviles = mapaMoviles.get(so);
				for (Movil movil : listaMoviles) {
					if (!movilesPorSO.containsKey(so)) {
						movilesPorSO.put(so, 1);
					} else {
						int valorAnterior = movilesPorSO.get(so);
						movilesPorSO.put(so, valorAnterior + 1);
					}
				}
			}
		}
		System.out.println(movilesPorSO);
		
		int mayorNumSO = 0;
		SISTEMA_OPERATIVO mayorSO = SISTEMA_OPERATIVO.ANDROID;
		
		for (SISTEMA_OPERATIVO so : movilesPorSO.keySet()) {
			int valor = movilesPorSO.get(so);
			if (valor > mayorNumSO) {
				mayorNumSO = valor;
				mayorSO = so;
			}
		}
		return mayorSO;
	}
	
	public static double mediaPrecioMoviles(ArrayList<Movil> listaMoviles) {
		double total = 0;
		for (Movil movil : listaMoviles) {
			total += movil.getPrecio();
		}
		
		return total/listaMoviles.size();
	}
	
	private static void guardarMovilesVendidosCSV(LinkedList<Venta> colaVentas) {
		File f = new File("moviles_vendidos.csv");
		
		HashMap<Movil, Integer> movilesUnicos = new HashMap<>();
		
		for (Venta venta : colaVentas) {
			HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> mapaMoviles = venta.getMoviles();
			for (SISTEMA_OPERATIVO so : mapaMoviles.keySet()) {
				ArrayList<Movil> listaMoviles = mapaMoviles.get(so);
				for (Movil movil : listaMoviles) {
					if (!movilesUnicos.containsKey(movil)) {
						movilesUnicos.put(movil, 1);
					} else {
						int valorAnterior = movilesUnicos.get(movil);
						movilesUnicos.put(movil, valorAnterior + 1);
					}
				}
			}
		}
		
		try {
			PrintWriter pw = new PrintWriter(f);
			for (Movil movil : movilesUnicos.keySet()) {
				int unidades = movilesUnicos.get(movil);
				pw.println(movil.getNombre() + "," + movil.getMarca() + "," + movil.getModelo() + "," + movil.getRam() + "," + movil.getAlmacenamiento() + "," + movil.getColor() + "," + movil.getPrecio() + "," + unidades);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static LinkedList<Venta> generarVentas(ArrayList<Trabajador> listaEmpleados,
			ArrayList<Cliente> listaClientes, ArrayList<Movil> listaMoviles) {
		LinkedList<Venta> colaVentas = new LinkedList<Venta>();

		for (int i = 0; i < 20; i++) {
			Venta venta = generarVenta(listaEmpleados, listaClientes, listaMoviles);
			colaVentas.add(venta);
		}
		return colaVentas;
	}

	private static Venta generarVenta(ArrayList<Trabajador> listaEmpleados, ArrayList<Cliente> listaClientes, ArrayList<Movil> listaMoviles) {
		ArrayList<Trabajador> listaEmpleadosOrdenadaPorVenta = new ArrayList<Trabajador>(listaEmpleados);
		//System.out.println(listaEmpleadosOrdenadaPorVenta);
		
		ArrayList<Trabajador> vendedores = new ArrayList<Trabajador>();
		// Ordeno la lista por puesto para sacar unicamente los vendedores
		listaEmpleadosOrdenadaPorVenta.sort((empleado, o) -> empleado.getPuesto().compareTo(o.getPuesto()));
		for (Trabajador trabajador : listaEmpleadosOrdenadaPorVenta) {
			// Al estar la lista ordenada por puestos y empieza por "VENDEDOR",
			// si llega a un momento en el que el puesto del trabajador no es
			// "VENDEDOR" podemos dejar de comprobar lo que queda de la lista
			if (trabajador.getPuesto() == PUESTO.VENDEDOR) {
				vendedores.add(trabajador);
			} else {
				break;
			}
		}
		
		int indiceVendedor = (int) (Math.random()*vendedores.size());
		Trabajador trabajador = vendedores.get(indiceVendedor);
		
		int indiceCliente = (int) (Math.random()*listaClientes.size());
		Cliente cliente = listaClientes.get(indiceCliente);
		
		Venta venta = new Venta(trabajador, cliente);
		
		int numeroMoviles = (int) (Math.random() * 5) + 1;
		TreeSet<Movil> moviles = new TreeSet<Movil>();
		
		while (moviles.size() < numeroMoviles) {
			int indiceMovil = (int) (Math.random()*listaMoviles.size());
			Movil m = listaMoviles.get(indiceMovil);
			moviles.add(m);
		}
		
		HashMap<SISTEMA_OPERATIVO, ArrayList<Movil>> mapaMoviles = new HashMap<>();
		for (Movil movil : moviles) {
			SISTEMA_OPERATIVO so = movil.getSistemaOperativo();
			
			if (!mapaMoviles.containsKey(so)) {
				mapaMoviles.put(so, new ArrayList<Movil>());
			}
			mapaMoviles.get(so).add(movil);
		}
		
		venta.setMoviles(mapaMoviles);
		return venta;
	}

	private static ArrayList<Cliente> generarClientes() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		// Generamos 10 clientes
		int contador = 1;
		
		for (int i = 0; i < 10; i++) {
			int dniParcialAleatorio = (int) (Math.random() * 90000000) + 10000000;
			String dni = dniParcialAleatorio + calcularLetraDNI(dniParcialAleatorio);
			int edad = (int) (Math.random() * 81) + 18;
			// 25% de clientes socios
			boolean esSocio = Math.random() < 0.25;
			Cliente c = new Cliente(dni, "nombre-" + contador, edad, "direccion-" + contador, esSocio);
			
			listaClientes.add(c);
			contador++;
		}
		
		return listaClientes;
	}

	private static String calcularLetraDNI(int dniNumber) {
		final String[] LETRAS = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int indice = dniNumber % 23;
        return LETRAS[indice];
    }

	private static ArrayList<Trabajador> generarEmpleados() {
		ArrayList<Trabajador> listaEmpleados = new ArrayList<Trabajador>();
		
		// Generamos 4 empleados de cada puesto
		int contador = 1;
		for (PUESTO puesto : PUESTO.values()) {
			for (int i = 0; i < 4; i++) {
				int dniParcialAleatorio = (int) (Math.random() * 90000000) + 10000000;
				String dni = dniParcialAleatorio + calcularLetraDNI(dniParcialAleatorio);
				int edad = (int) (Math.random() * 81) + 18;
				int antiguedad = (int) (Math.random() * 50) + 1;
				Trabajador t = new Trabajador(dni, "nombre-" + contador, edad, "direccion-" + contador, puesto, antiguedad);
				
				listaEmpleados.add(t);
				contador++;
			}
		}
		
		// Desordeno la lista de empleados
		Collections.shuffle(listaEmpleados);
		
		return listaEmpleados;
	}

	private static ArrayList<Movil> leerMovilesCSV() {
		ArrayList<Movil> listaMoviles = new ArrayList<Movil>();

		// Guardamos los datos del csv en la lista
		File f = new File("smartphones.csv");
		
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				// Smartphone,Brand,Model,RAM,Storage,Color,Final Price
				String linea = sc.nextLine();
				String[] campos = linea.split(",");
				
				String nombre = campos[0];
				String marca = campos[1];
				String modelo = campos[2];
				
				int ram;
				if (campos[3].equalsIgnoreCase("")) {
					ram = 0;
				} else {
					ram = Integer.parseInt(campos[3]);
				}
				
				int almacenamiento;
				if (campos[4].equalsIgnoreCase("")) {
					almacenamiento = 0;
				} else {
					almacenamiento = Integer.parseInt(campos[4]);
				}

				String color = campos[5];
				double precio = Double.parseDouble(campos[6]);
				
				Movil m;
				if (marca.equalsIgnoreCase("Apple")) {
					m = new Ios(nombre, modelo, ram, almacenamiento, color, precio);
				} else {
					m = new Android(nombre, marca, modelo, ram, almacenamiento, color, precio);
				}
				listaMoviles.add(m);
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMoviles;
	}

}
