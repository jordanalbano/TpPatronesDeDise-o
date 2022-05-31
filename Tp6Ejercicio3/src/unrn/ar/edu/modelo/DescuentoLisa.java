package unrn.ar.edu.modelo;

public class DescuentoLisa implements Descuento {
	private int horaMaximaDescuento;
	private int horaMinimaDescuento;
	private double descuento;
	private ProveedorDeFechaHora fecha;

	public DescuentoLisa(ProveedorDeFechaHora fecha) {
		this.fecha = fecha;
		this.horaMaximaDescuento = 10;
		this.horaMinimaDescuento = 8;
		this.descuento = 5;

	}

	@Override
	public double calcularDescuento(double precio, int cantRemeras) {
		int horaActual = this.fecha.hora();

		if (horaActual < horaMaximaDescuento && horaActual > horaMinimaDescuento) {
			return precio * (1 - (descuento / 100));
		}
		return precio;

	}

}
