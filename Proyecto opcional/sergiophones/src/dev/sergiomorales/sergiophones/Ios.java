package dev.sergiomorales.sergiophones;

public class Ios extends Movil {

	public Ios(String nombre, String modelo, int ram, int almacenamiento, String color, double precio) {
		super(nombre, "Apple", modelo, SISTEMA_OPERATIVO.IOS, ram, almacenamiento, color, precio);
	}

	// Apple es mas caro que android
	@Override
	public void mejorarRam(int ramExtra) {
		// Mejoramos la ram
		int nuevaRam = this.getRam() + ramExtra;
		this.setRam(nuevaRam);
		
		// Aumentamos el precio (20€/GB)
		double nuevoPrecio = this.getPrecio() + ramExtra*100;
		this.setPrecio(nuevoPrecio);
	}

	@Override
	public void mejorarAlmacenamiento(int almacenamientoExtra) {
		// Mejoramos el almacenamiento
		int nuevoAlmacenamiento = this.getAlmacenamiento() + almacenamientoExtra;
		this.setAlmacenamiento(nuevoAlmacenamiento);
		
		// Aumentamos el precio (10€/GB)
		double nuevoPrecio = this.getPrecio() + almacenamientoExtra*10;
		this.setPrecio(nuevoPrecio);
	}
}
