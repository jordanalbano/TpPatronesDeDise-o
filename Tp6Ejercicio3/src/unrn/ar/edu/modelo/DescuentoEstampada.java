package unrn.ar.edu.modelo;

public class DescuentoEstampada implements Descuento {
	private int diaDeDescuentoSabado;
	private int diaDeDescuentoDomingo;
	private double porcentajeDeDescuentoSabado;
	private double porcentajeDeDescuentoDomingo;
	private int cantRemerasParaDescuento;
	private ProveedorDeFechaHora fecha;

	public DescuentoEstampada(ProveedorDeFechaHora fecha) {
		this.cantRemerasParaDescuento = 3;
		this.diaDeDescuentoSabado = 6;
		this.diaDeDescuentoDomingo = 7;
		this.porcentajeDeDescuentoDomingo = 10;
		this.porcentajeDeDescuentoSabado = 12;
		this.fecha = fecha;
	}

	@Override
	public double calcularDescuento(double precio, int cantRemeras) {
		int diaDeLaSemana = fecha.diaDeLaSemana();
		if (diaDeLaSemana == diaDeDescuentoDomingo) {
			return precio * (1 - (porcentajeDeDescuentoDomingo / 100));
		}

		if (diaDeLaSemana == diaDeDescuentoSabado && cantRemeras > this.cantRemerasParaDescuento) {

			return precio * (1 - (porcentajeDeDescuentoSabado / 100));
		}
		return precio;
	}

}
