package ar.unrn.edu.modelo;

public class RemerasNacionales extends Remeras {

	public RemerasNacionales(double precioUnitario) {
		super(precioUnitario);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	protected double recargoFinal(double precioUnitario) {

		return (precioUnitario * 0.15) + precioUnitario;
	}

	@Override
	protected double impuestoAduanero(double precioUnitario) {
		// TODO Esbozo de método generado automáticamente
		return precioUnitario;
	}

	@Override
	protected double recargo(double precioUnitario) {
		// TODO Esbozo de método generado automáticamente
		return this.bonificacion(precioUnitario * 0.015) + precioUnitario;
	}

	@Override
	protected double bonificacion(double precioUnitario) {
		// TODO Esbozo de método generado automáticamente
		return (precioUnitario * 0.20) + precioUnitario;
	}

}
