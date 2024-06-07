package dev.sergiomorales.sergiophones;

public class Cliente extends Persona {
	protected boolean socio;

	public Cliente(String dni, String nombre, int edad, String direccion, boolean socio) {
		super(dni, nombre, edad, direccion);
		this.socio = socio;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	@Override
	public String toString() {
		return "Cliente [socio=" + socio + ", dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", direccion="
				+ direccion + "]";
	}
}
