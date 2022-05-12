package src.unrn.edu.ar.modelo;

public class Spike implements InterfaceItem {
	private int tiempo;

	public Spike(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int calcularTiempoFinalizacion() {

		return tiempo;
	}

}
