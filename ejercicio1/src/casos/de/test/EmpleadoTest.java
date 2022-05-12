package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unrn.edu.ar.modelo.Empleado;
import unrn.edu.ar.modelo.EmpleadoRegular;

class EmpleadoTest {

	@Test
	void calcularSalarioDesdeDirector() {
		EmpleadoRegular empleadoNormal = new EmpleadoRegular(2000);

		Empleado empleadoLider = new Empleado(2500);
		Empleado empleadoMandoMedio = new Empleado(3500);
		Empleado empleadoGerente = new Empleado(4000);
		Empleado empleadoGerente2 = new Empleado(4000);
		Empleado empleadoDirector = new Empleado(5000);
		empleadoDirector.agregarEmpleado(empleadoGerente);
		empleadoDirector.agregarEmpleado(empleadoGerente2);
		empleadoGerente.agregarEmpleado(empleadoMandoMedio);
		empleadoMandoMedio.agregarEmpleado(empleadoLider);
		empleadoLider.agregarEmpleado(empleadoNormal);
		assertEquals(21000, empleadoDirector.calcularMontoTotalSalarial());
	}

	@Test
	void calcularSalarioDesdeGerente() {
		EmpleadoRegular empleadoNormal = new EmpleadoRegular(2000);
		Empleado empleadoLider = new Empleado(2500);
		Empleado empleadoMandoMedio = new Empleado(3500);
		Empleado empleadoGerente = new Empleado(4000);
		Empleado empleadoDirector = new Empleado(5000);
		empleadoDirector.agregarEmpleado(empleadoGerente);
		empleadoGerente.agregarEmpleado(empleadoMandoMedio);
		empleadoMandoMedio.agregarEmpleado(empleadoLider);
		empleadoLider.agregarEmpleado(empleadoNormal);
		assertEquals(12000, empleadoGerente.calcularMontoTotalSalarial());

	}
}
