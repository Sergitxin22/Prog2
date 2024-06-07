package dev.sergiomorales.sergiophones;

public class Trabajador extends Persona {
	protected PUESTO puesto;
	protected int antiguedad;
	
	public Trabajador(String dni, String nombre, int edad, String string, PUESTO puesto, int antiguedad) {
		super(dni, nombre, edad, string);
		this.puesto = puesto;
		this.antiguedad = antiguedad;
	}
	
	public PUESTO getPuesto() {
		return puesto;
	}
	
	public void setPuesto(PUESTO puesto) {
		this.puesto = puesto;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public String toString() {
		return "Trabajador [puesto=" + puesto + ", antiguedad=" + antiguedad + ", dni=" + dni + ", nombre=" + nombre
				+ ", edad=" + edad + ", direccion=" + direccion + "]";
	}	
}
