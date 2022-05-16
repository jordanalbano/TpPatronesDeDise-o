package unrn.edu.ar.modelo;

public class Seguro implements ComponenteSeguro {
	private double precio;

	public Seguro(double precio) {
		this.precio = precio;
	}

	@Override
	public double precioTotalConDescuento() {
		return this.precio * (1 - (5.0 / 100));
	}

	@Override
	public void agregarSeguro(Seguro seguro) {
		// TODO Esbozo de m�todo generado autom�ticamente

	}

	@Override
	public void agregarPaquete(ComponenteSeguro componenteSeguro) {
		// TODO Esbozo de m�todo generado autom�ticamente

	}

}
