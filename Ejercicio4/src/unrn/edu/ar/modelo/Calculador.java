package unrn.edu.ar.modelo;

import java.time.LocalDate;
import java.time.Month;

public abstract class Calculador {
	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.log = new LogTransaction();
		this.mesEnPromocion = mesEnPromocion;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		System.out.println(Month.of(mesEnPromocion));
		System.out.println(LocalDate.now().getMonth());
		if (Month.of(mesEnPromocion).equals(LocalDate.now().getMonth())) {
			System.out.println("entra ca");
			precioTotal = mesEnPromocion(precioProducto);

		} else {

			precioTotal = mesSinPromocion(precioProducto)/* 0.15 */;
		}
		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;
	}

	protected abstract double mesSinPromocion(double precioProducto);

	protected abstract double mesEnPromocion(double precioProducto);

}
