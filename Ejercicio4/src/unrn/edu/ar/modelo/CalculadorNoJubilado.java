package unrn.edu.ar.modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Esbozo de constructor generado automáticamente
	}

	private LogTransaction log;
	private int mesEnPromocion;

	@Override
	protected double mesSinPromocion(double monto) {
		// TODO Esbozo de método generado automáticamente
		return (monto * 0.21) + monto;
	}

	@Override
	protected double mesEnPromocion(double monto) {
		// TODO Esbozo de método generado automáticamente
		return (monto * 0.15) + monto;
	}

}
