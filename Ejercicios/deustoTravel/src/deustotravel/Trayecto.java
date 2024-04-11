package deustotravel;

import java.util.Objects;

public class Trayecto {
	protected double latitudOrigen;
	protected double longitudOrigen;
	protected double latitudDestino;
	protected double longitudDestino;
	protected Transporte transporte;
	
	public Trayecto(double latitudOrigen, double longitudOrigen, double latitudDestino, double longitudDestino,
			Transporte transporte) {
		super();
		this.latitudOrigen = latitudOrigen;
		this.longitudOrigen = longitudOrigen;
		this.latitudDestino = latitudDestino;
		this.longitudDestino = longitudDestino;
		this.transporte = transporte;
	}

	public double getLatitudOrigen() {
		return latitudOrigen;
	}

	public void setLatitudOrigen(double latitudOrigen) {
		this.latitudOrigen = latitudOrigen;
	}

	public double getLongitudOrigen() {
		return longitudOrigen;
	}

	public void setLongitudOrigen(double longitudOrigen) {
		this.longitudOrigen = longitudOrigen;
	}

	public double getLatitudDestino() {
		return latitudDestino;
	}

	public void setLatitudDestino(double latitudDestino) {
		this.latitudDestino = latitudDestino;
	}

	public double getLongitudDestino() {
		return longitudDestino;
	}

	public void setLongitudDestino(double longitudDestino) {
		this.longitudDestino = longitudDestino;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	@Override
	public String toString() {
		return "Trayecto [latitudOrigen=" + latitudOrigen + ", longitudOrigen=" + longitudOrigen + ", latitudDestino="
				+ latitudDestino + ", longitudDestino=" + longitudDestino + ", transporte=" + transporte + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitudDestino, latitudOrigen, longitudDestino, longitudOrigen, transporte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trayecto other = (Trayecto) obj;
		return Double.doubleToLongBits(latitudDestino) == Double.doubleToLongBits(other.latitudDestino)
				&& Double.doubleToLongBits(latitudOrigen) == Double.doubleToLongBits(other.latitudOrigen)
				&& Double.doubleToLongBits(longitudDestino) == Double.doubleToLongBits(other.longitudDestino)
				&& Double.doubleToLongBits(longitudOrigen) == Double.doubleToLongBits(other.longitudOrigen)
				&& Objects.equals(transporte, other.transporte);
	}
	
	private double haversine(double val) {
	    return Math.pow(Math.sin(val / 2), 2);
	}

	private double calcularDistancia(double startLat, double startLong, double endLat, double endLong) {
		final double EARTH_RADIUS = 6371;
	    double dLat = Math.toRadians((endLat - startLat));
	    double dLong = Math.toRadians((endLong - startLong));

	    startLat = Math.toRadians(startLat);
	    endLat = Math.toRadians(endLat);

	    double a = haversine(dLat) + Math.cos(startLat) * Math.cos(endLat) * haversine(dLong);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

	    return EARTH_RADIUS * c;
	}
	
	public double getDistancia() {
		return calcularDistancia(latitudOrigen, longitudOrigen, latitudDestino, longitudDestino);
	}
}
