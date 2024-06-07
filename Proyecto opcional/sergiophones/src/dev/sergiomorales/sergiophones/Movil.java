package dev.sergiomorales.sergiophones;

import java.util.Objects;

public abstract class Movil implements Mejorable, Comparable<Movil> {
	protected String nombre;
	protected String marca;
	protected String modelo;
	protected SISTEMA_OPERATIVO sistemaOperativo;
	protected int ram;
	protected int almacenamiento;
	protected String color;
	protected double precio;
	
	public Movil(String nombre, String marca, String modelo, SISTEMA_OPERATIVO sistemaOperativo, int ram, int almacenamiento, String color, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOperativo = sistemaOperativo;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.color = color;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public SISTEMA_OPERATIVO getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(SISTEMA_OPERATIVO sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Movil [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", sistemaOperativo="
				+ sistemaOperativo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", color=" + color
				+ ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(almacenamiento, color, marca, modelo, nombre, precio, ram, sistemaOperativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		return almacenamiento == other.almacenamiento && Objects.equals(color, other.color)
				&& Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && ram == other.ram
				&& sistemaOperativo == other.sistemaOperativo;
	}
	
	@Override
	public int compareTo(Movil o) {
		int compararSO = this.sistemaOperativo.compareTo(o.sistemaOperativo);
        if (compararSO != 0) {
            return compararSO;
        }
        return this.nombre.compareTo(o.nombre);
	}
}
