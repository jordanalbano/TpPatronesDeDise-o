package src.unrn.edu.ar.modelo;

public class Spike implements Item {
	private double tiempo;

	public Spike(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public double calcularTiempoFinalizacion() {

		return tiempo;
	}

}
