package unrn.edu.ar.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements InterfaceEmpleado {
	private double salario;
	private List<InterfaceEmpleado> empleadosACargo;

	public Empleado(double salario) {
		this.salario = salario;
		empleadosACargo = new ArrayList<InterfaceEmpleado>();

	}

	public void agregarEmpleado(InterfaceEmpleado empleado) {
		this.empleadosACargo.add(empleado);
	}

	@Override
	public double calcularMontoTotalSalarial() {
		return (double) salario + empleadosACargo.stream().mapToDouble(e -> e.calcularMontoTotalSalarial()).sum();
	}

}
