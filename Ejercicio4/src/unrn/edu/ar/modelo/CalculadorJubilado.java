package unrn.edu.ar.modelo;

public class CalculadorJubilado extends Calculador {
	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Esbozo de constructor generado autom�ticamente
	}

	private LogTransaction log;
	private int mesEnPromocion;

	@Override
	protected double mesSinPromocion(double monto) {
		return (monto * 0.1) + monto;
	}

	@Override
	protected double mesEnPromocion(double monto) {

		return monto;
	}
}
