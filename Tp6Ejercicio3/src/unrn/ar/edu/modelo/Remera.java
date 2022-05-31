package unrn.ar.edu.modelo;

public abstract class Remera {
	protected double precio;
	protected Descuento descuento;

	public Remera(Descuento descuento,double precio) {

		this.descuento = descuento;
		this.precio = precio;
	}

	public double precio() {
		return this.precio;
	}

	public abstract int id();

	public double calcularDescuento(int cantRemeras) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

}
