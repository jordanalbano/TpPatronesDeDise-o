package unrn.edu.ar.modelo;

public class Gerente implements Empleado {
	private MandoMedio mandoMedioACargo;
	private double montoSalarialGerente;

	public Gerente(MandoMedio mandoMedio, double montoSalarial) {
		this.mandoMedioACargo = mandoMedio;
		this.montoSalarialGerente = montoSalarial;
	}

	@Override
	public double calcularMontoTotalSalarial() {

		return this.montoSalarialGerente + this.mandoMedioACargo.calcularMontoTotalSalarial();
	}
}
