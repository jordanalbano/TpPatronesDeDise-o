package src.unrn.edu.ar.modelo;

public class Spike implements InterfaceItem {
	private int tiempo;

	public Spike(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int calcularTiempoFinalizacion() {

		return this.tiempo();
	}

	@Override
	public void agregarItem(Item item) {
		// TODO Esbozo de método generado automáticamente

	}

	@Override
	public int tiempo() {

		return this.tiempo;
	}

}
