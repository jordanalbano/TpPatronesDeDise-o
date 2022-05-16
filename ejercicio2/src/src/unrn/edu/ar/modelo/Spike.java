package src.unrn.edu.ar.modelo;

public class Spike implements InterfaceItem {
	private int tiempo;

	public Spike(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int calcularTiempoFinalizacion() {

		return tiempo;
	}

	@Override
	public void agregarItem(InterfaceItem item) {
		// TODO Auto-generated method stub

	}

}
