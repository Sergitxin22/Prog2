package dev.sergiomorales.sergiophones;

import java.util.Objects;

public abstract class Persona {
	protected String dni;
	protected String nombre;
	protected int edad;
	protected String direccion;
	
	public Persona(String dni, String nombre, int edad, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, dni, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return direccion == other.direccion && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombre, other.nombre);
	}
}
