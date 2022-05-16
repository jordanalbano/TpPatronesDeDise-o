package ar.unrn.edu.modelo;

public class RemerasImportadas extends Remeras {

	public RemerasImportadas(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	protected double recargoFinal(double precioUnitario) {
		return (double) (precioUnitario * 0.25) + precioUnitario;
	}

	@Override
	protected double impuestoAduanero(double precioUnitario) {
		return (double) (precioUnitario * 0.05) + precioUnitario;

	}

	@Override
	protected double recargo(double precioUnitario) {
		return (double) (precioUnitario * 0.03) + precioUnitario;
	}

	@Override
	protected double bonificacion(double precioUnitario2) {
		// TODO Esbozo de método generado automáticamente
		return precioUnitario2;
	}

}
