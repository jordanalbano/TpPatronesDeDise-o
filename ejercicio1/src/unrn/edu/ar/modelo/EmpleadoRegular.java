package unrn.edu.ar.modelo;

public class EmpleadoRegular implements Empleado {

	private double salario;

	public EmpleadoRegular(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularMontoTotalSalarial() {

		return this.salario;
	}

}
