package ar.unrn.edu.modelo;

public class RemerasNacionales extends Remeras {

	public RemerasNacionales(double precioUnitario) {
		super(precioUnitario);
		// TODO Esbozo de constructor generado autom�ticamente
	}

	@Override
	protected double recargoFinal(double precioUnitario) {

		return (precioUnitario * 0.15) + precioUnitario;
	}

	@Override
	protected double impuestoAduanero(double precioUnitario) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return precioUnitario;
	}

	@Override
	protected double recargo(double precioUnitario) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return this.bonificacion(precioUnitario * 0.015) + precioUnitario;
	}

	@Override
	protected double bonificacion(double precioUnitario) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return (precioUnitario * 0.20) + precioUnitario;
	}

}
