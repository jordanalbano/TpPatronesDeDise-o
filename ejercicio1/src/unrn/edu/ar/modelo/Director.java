package unrn.edu.ar.modelo;

public class Director implements Empleado {
	private Gerente gerente;
	private double MontoDirector;

	public Director(Gerente gerente, double montoDirector) {
		this.gerente = gerente;
		this.MontoDirector = montoDirector;
	}

	@Override
	public double calcularMontoTotalSalarial() {

		return this.MontoDirector + gerente.calcularMontoTotalSalarial();
	}

}
