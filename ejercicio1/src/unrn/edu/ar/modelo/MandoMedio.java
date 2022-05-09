package unrn.edu.ar.modelo;

public class MandoMedio implements Empleado {
	private LiderDeProyecto liderDeProyectoACargo;
	private double salarioMandoMedio;

	public MandoMedio(LiderDeProyecto liderDeProyecto, double salario) {
		this.liderDeProyectoACargo = liderDeProyecto;
		this.salarioMandoMedio = salario;
	}

	@Override
	public double calcularMontoTotalSalarial() {

		return this.salarioMandoMedio + this.liderDeProyectoACargo.calcularMontoTotalSalarial();

	}

}
