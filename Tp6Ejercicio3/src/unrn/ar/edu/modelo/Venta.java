package unrn.ar.edu.modelo;

import java.time.LocalDate;

public class Venta {
	private Remeras remerasDeLaCompra;
	private LocalDate fechaCompra;
	private double montoTotal;
	private int cantidadDeRemeras;

	public Venta(String cantidadRemeras, int idRemera, ProveedorDeFechaHora fecha)
			throws ExcepcionPorNoIndicarCantidad, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		validarDatos(cantidadRemeras);
		this.cantidadDeRemeras = Integer.parseInt(cantidadRemeras);
		this.fechaCompra = LocalDate.now();
		this.remerasDeLaCompra = new Remeras(this.cantidadDeRemeras, idRemera, fecha);
		this.cantidadDeRemeras = remerasDeLaCompra.cantidadDeRemeras();
		this.montoTotal = calcularMontoTotalDeLaCompra();

	}

	private void validarDatos(String cantidadRemeras)
			throws ExcepcionPorNoIndicarCantidad, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		if (cantidadRemeras.equals("")) {
			throw new ExcepcionPorNoIndicarCantidad("rellene el campo cantidad de remeras");
		}
		try {
			int cantRem = Integer.parseInt(cantidadRemeras);
			if (cantRem <= 0) {
				throw new ExcepcionPorCantidadDeRemeras("Debe indicar mas 1 o mas remeras");
			}
		} catch (NumberFormatException e) {
			throw new ExcepcionPorCantidadIncorrecta("Ingrese una cantidad correcta");
		}
	}

	public double montoTotalDeLaCompra() {
		return this.montoTotal;
	}

	public double calcularMontoTotalDeLaCompra() {
		return this.remerasDeLaCompra.calcularPrecioTotal();

	}

	public void agregarRemera(Remera remera) {
		this.remerasDeLaCompra.agregarRemera(remera);
	}

	public void eliminarRemera(Remera remera) {
		this.remerasDeLaCompra.eliminarRemera(remera);
	}

	public LocalDate fecha() {
		return this.fechaCompra;
	}

	public int cantidadDeRemeras() {

		return this.cantidadDeRemeras;
	}
}
