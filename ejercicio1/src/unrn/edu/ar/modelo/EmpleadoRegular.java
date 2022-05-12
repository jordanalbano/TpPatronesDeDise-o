package unrn.edu.ar.modelo;

public class EmpleadoRegular implements InterfaceEmpleado {
	private double salario;

	public EmpleadoRegular(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularMontoTotalSalarial() {
		return salario;
	}

}
