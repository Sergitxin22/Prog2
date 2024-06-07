package dev.sergiomorales.sergiophones;

public class Android extends Movil {
	
	public Android(String nombre, String marca, String modelo, int ram, int almacenamiento, String color,
			double precio) {
		super(nombre, marca, modelo, SISTEMA_OPERATIVO.ANDROID, ram, almacenamiento, color, precio);
	}

	@Override
	public void mejorarRam(int ramExtra) {
		// Mejoramos la ram
		int nuevaRam = this.getRam() + ramExtra;
		this.setRam(nuevaRam);
		
		// Aumentamos el precio (20€/GB)
		double nuevoPrecio = this.getPrecio() + ramExtra*20;
		this.setPrecio(nuevoPrecio);
	}

	@Override
	public void mejorarAlmacenamiento(int almacenamientoExtra) {
		// Mejoramos el almacenamiento
		int nuevoAlmacenamiento = this.getAlmacenamiento() + almacenamientoExtra;
		this.setAlmacenamiento(nuevoAlmacenamiento);
		
		// Aumentamos el precio (1€/GB)
		double nuevoPrecio = this.getPrecio() + almacenamientoExtra;
		this.setPrecio(nuevoPrecio);
	}
}
