package deustopintxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DeustoPintxos {
	// Tipo_Prod;Nombre_Prod;Precio_Prod;Caracteristica_Prod
	// TAREA 1A: cargarProductosCSV
	private static Set<Producto> cargarProductosCSV() {
		Set<Producto> productos = new HashSet<Producto>();
		
		try {
			File f = new File("deustopintxos.csv");
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				Producto p = null;
				
				String linea = sc.nextLine();
				
				String[] datos = linea.split(",");
				
				String tipoProducto = datos[0];
				String nombreProducto = datos[1];
				double precioProducto = Double.parseDouble(datos[2]);
				
				if (tipoProducto.equalsIgnoreCase("bebida")) {
					double alcohol =  Double.parseDouble(datos[3]);
					p = new Bebida(nombreProducto, precioProducto, alcohol);
				} else {
					boolean caliente = Boolean.parseBoolean(datos[3]);
					p = new Pintxo(nombreProducto, precioProducto, caliente);
				}
				
				productos.add(p);				
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productos;
	}
	
	// TAREA 1B: generarPedidos
	private static void generarPedidos(Set<Producto> productos, List<Bar> bares) {

		// Por cada dia de la semana
		for (Dia dia : Dia.values()) {
			
			// por  cada bar
			for (Bar bar : bares) {
				
				// Creo 100 pedidos
				for (int i = 0; i < 100; i++) {
					int id = (int) (Math.random()*5000);
					Pedido pedido = new Pedido(id, dia);
					
					// Genero el mapa de productos
					HashMap<Producto, Integer> productosConsumidos = new HashMap<Producto, Integer>();
					ArrayList<Producto> listaProductos = new ArrayList<Producto>(productos);
					
					// Creo los 6 productos
					for (int j = 0; j < 6; j++) {
						int indiceProducto = (int) (Math.random()*listaProductos.size());
						Producto p = listaProductos.get(indiceProducto);
						
						// compruebo si está el producto en el mapa
						if (productosConsumidos.containsKey(p)) {
							int valor = productosConsumidos.get(p);
							productosConsumidos.put(p, valor + 1);
						} else {
							productosConsumidos.put(p, 1);
						}
					}
					
					pedido.setProductos(productosConsumidos);
					bar.getPedidos().add(pedido);
				}
			}
			
		}
		
	}
	
	// TAREA 2D: diaMayorRecaudacion
	private static String diaMayorRecaudacion(List<Bar> bares) {
		TreeMap<Dia, Double> totalRecaudacionDia = new TreeMap<Dia, Double>();
		double mayorRecaudacion = 0.0;
		Dia diaMayorRecaudacion = Dia.LUNES;
		
		for (Bar bar : bares) {
			System.out.println(bar);
			for (Dia dia : bar.getRecaudacion().keySet()) {
				if (totalRecaudacionDia.containsKey(dia)) {
					double valorAnterior = totalRecaudacionDia.get(dia);
					totalRecaudacionDia.put(dia, valorAnterior + bar.getRecaudacion().get(dia));
				} else {
					totalRecaudacionDia.put(dia, bar.getRecaudacion().get(dia));
				}
			}
		}
		
		System.out.println(totalRecaudacionDia);
		for (Dia dia : totalRecaudacionDia.keySet()) {
			double valor = totalRecaudacionDia.get(dia);
			
			if (valor > mayorRecaudacion) {
				mayorRecaudacion = valor;
				diaMayorRecaudacion = dia;
			}
		}
		
		return String.valueOf(diaMayorRecaudacion);
	}
	
	public static void main(String[] args) {
		Set<Producto> productos = new HashSet<Producto>();
		List<Bar> bares = new ArrayList<Bar>();
		
		// TAREA 1A: cargarProductosCSV
		productos = cargarProductosCSV();
		
		// Creamos los 4 bares
		String[] nombres = {"Kupela", "Zaharra", "Sagarra", "Epelde"};
		for (String nombre : nombres) {
			bares.add(new Bar(nombre));
		}
		
		// TAREA 1B: generarPedidos
		generarPedidos(productos, bares);

		// Descomenta esta linea solamente si no has sabido hacer la TAREA 1
		//datosIniciales(productos, bares);

		//System.out.println(productos);
		System.out.println(bares);
		/*System.out.println(bares.get(0).getPedidos());
		System.out.println(bares.get(0).getPedidos().get(0));
		System.out.println(bares.get(0).getPedidos().get(0).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(1).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(2).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(3).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(4).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(5).totalPedido());
		System.out.println(bares.get(0).getPedidos().get(6).totalPedido());*/
		//bares.get(0).cobrarPedidos();
		//bares.get(0).getRecaudacion();
		//System.out.println(bares.get(0));
		
		// TAREA 2C: recorre el mapa de bares, ejecuta cobrarPedidos y muestra como ha quedado la recaudacion
		for (Bar bar : bares) {
			bar.cobrarPedidos();
			//System.out.println(bar.getNombre() + ": " + bar.getRecaudacion());
		}
		
		// TAREA 2D: diaMayorRecaudacion
		System.out.println("El dia de mayor recaudacion ha sido el " + diaMayorRecaudacion(bares));
	}

	private static void datosIniciales(Set<Producto> productos, List<Bar> bares) {
		// IMPORTANTE: no copies parte de este codigo en tus soluciones. 
		// Este metodo esta programado de la manera mas manual posible y 
		// NO sera considerado como una solucion valida en tus tareas.
		
		productos.add(new Bebida("Txakoli", 1.50, 10.5));
		productos.add(new Bebida("Estrella Galicia", 1.75, 5.5));
		productos.add(new Bebida("Coca-cola", 1.75, 0.0));
		productos.add(new Bebida("Radler", 2.0, 3.5));
		productos.add(new Bebida("Verdejo", 1.50, 11.5));
		productos.add(new Bebida("Rioja", 1.50, 10.5));
		productos.add(new Bebida("Fanta", 1.75, 0.0));
		productos.add(new Bebida("Mosto", 1.25, 0.0));
		productos.add(new Pintxo("Gilda", 1.50, false));
		productos.add(new Pintxo("Tortilla", 2.25, true));
		productos.add(new Pintxo("Mejillon relleno", 1.75, true));
		productos.add(new Pintxo("Croqueta de boletus", 1.50, false));
		productos.add(new Pintxo("Champi", 1.50, true));
		productos.add(new Pintxo("Brocheta de gambas", 2.25, false));
		productos.add(new Pintxo("Tartaleta de txangurro", 1.50, false));
		productos.add(new Pintxo("Txapela", 1.50, false));
		
		HashMap<Producto, Integer> mapa1 = new HashMap<>();
		mapa1.put(new Pintxo("Tortilla", 2.25, true), 2);
		mapa1.put(new Pintxo("Txapela", 1.50, false), 1);
		HashMap<Producto, Integer> mapa2 = new HashMap<>();
		mapa2.put(new Bebida("Coca-cola", 1.75, 0.0), 1);
		mapa2.put(new Bebida("Txakoli", 1.50, 10.5), 2);
		HashMap<Producto, Integer> mapa3 = new HashMap<>();
		mapa3.put(new Pintxo("Tortilla", 2.25, true), 2);
		mapa3.put(new Bebida("Txakoli", 1.50, 10.5), 2);
		HashMap<Producto, Integer> mapa4 = new HashMap<>();
		mapa4.put(new Pintxo("Txapela", 1.50, false), 1);
		mapa4.put(new Bebida("Coca-cola", 1.75, 0.0), 1);
		HashMap<Producto, Integer> mapa5 = new HashMap<>();
		mapa5.put(new Pintxo("Txapela", 1.50, false), 1);
		mapa5.put(new Bebida("Coca-cola", 1.75, 0.0), 1);
		mapa5.put(new Bebida("Txakoli", 1.50, 10.5), 2);
		HashMap<Producto, Integer> mapa6 = new HashMap<>();
		mapa6.put(new Pintxo("Tortilla", 2.25, true), 2);
		mapa6.put(new Pintxo("Txapela", 1.50, false), 1);
		mapa6.put(new Bebida("Coca-cola", 1.75, 0.0), 1);
		HashMap<Producto, Integer> mapa7 = new HashMap<>();
		mapa7.put(new Pintxo("Tortilla", 2.25, true), 2);
		mapa7.put(new Pintxo("Txapela", 1.50, false), 1);
		mapa7.put(new Bebida("Coca-cola", 1.75, 0.0), 1);
		mapa7.put(new Bebida("Txakoli", 1.50, 10.5), 2);
		
		Pedido p1 = new Pedido(1, Dia.LUNES, mapa1);
		Pedido p2 = new Pedido(2, Dia.MARTES, mapa2);
		Pedido p3 = new Pedido(3, Dia.MIERCOLES, mapa3);
		Pedido p4 = new Pedido(4, Dia.JUEVES, mapa4);
		Pedido p5 = new Pedido(5, Dia.VIERNES, mapa5);
		Pedido p6 = new Pedido(6, Dia.SABADO, mapa6);
		Pedido p7 = new Pedido(7, Dia.DOMINGO, mapa7);
		
		String[] nombres = {"Kupela", "Zaharra", "Sagarra", "Epelde"};
		for (String nombre : nombres) {
			bares.add(new Bar(nombre));
		}
		
		for (Bar bar : bares) {
			bar.getPedidos().add(p1);
			bar.getPedidos().add(p2);
			bar.getPedidos().add(p3);
			bar.getPedidos().add(p4);
			bar.getPedidos().add(p5);
			bar.getPedidos().add(p6);
			bar.getPedidos().add(p7);
		}
	}

}
