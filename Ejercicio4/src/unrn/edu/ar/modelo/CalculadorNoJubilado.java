package unrn.edu.ar.modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Esbozo de constructor generado autom�ticamente
	}

	private LogTransaction log;
	private int mesEnPromocion;

	@Override
	protected double mesSinPromocion(double monto) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return (monto * 0.21) + monto;
	}

	@Override
	protected double mesEnPromocion(double monto) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return (monto * 0.15) + monto;
	}

}
