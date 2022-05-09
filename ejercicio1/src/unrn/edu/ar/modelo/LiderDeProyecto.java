package unrn.edu.ar.modelo;

public class LiderDeProyecto implements Empleado {
	private EmpleadoRegular empleadoRegularACargo;
	private double salario;

	public LiderDeProyecto(EmpleadoRegular empleadoACargo, double salario) {
		this.empleadoRegularACargo = empleadoACargo;
		this.salario = salario;
	}

	@Override
	public double calcularMontoTotalSalarial() {
		// TODO Esbozo de método generado automáticamente
		return this.salario + this.empleadoRegularACargo.calcularMontoTotalSalarial();
	}
}
