package unrn.ar.edu.modelo;

public class RemeraEstampada extends Remera {
	private final int id = 2;

	public RemeraEstampada(DescuentoEstampada descuento, double precio) {
		super(descuento,precio);

	}

	@Override
	public double calcularDescuento(int cantRemeras) {
		return this.descuento.calcularDescuento(this.precio, cantRemeras);
	}

	public int id() {
		return this.id;
	}
}
