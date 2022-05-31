package unrn.ar.edu.modelo;

public class RemeraLisa extends Remera {
	private final int id = 1;

	public RemeraLisa(Descuento descuento, double precio) {
		super(descuento,precio);

	}

	@Override
	public double calcularDescuento(int cantidadRemeras) {

		return descuento.calcularDescuento(this.precio, cantidadRemeras);
	}

	@Override
	public int id() {
		// TODO Esbozo de método generado automáticamente
		return id;
	}

}
