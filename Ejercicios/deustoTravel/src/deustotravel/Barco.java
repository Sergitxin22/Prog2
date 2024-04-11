package deustotravel;

public class Barco extends Transporte {
	protected double calado;
	protected boolean diesel;
	
	public Barco(int personas, double calado, boolean diesel) {
		super(personas);
		this.calado = calado;
		this.diesel = diesel;
	}

	public double getCalado() {
		return calado;
	}

	public void setCalado(double calado) {
		this.calado = calado;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

	@Override
	public String toString() {
		return "Barco [calado=" + calado + ", diesel=" + diesel + ", codigo=" + codigo + ", personas=" + personas + "]";
	}

	@Override
	public double getPrecioPorKm() {
		if (this.diesel) {
			return this.calado * 0.8;
		} else {
			return this.calado * 1.5;			
		}
	}
	
	
}
