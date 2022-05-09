package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unrn.edu.ar.modelo.Director;
import unrn.edu.ar.modelo.EmpleadoRegular;
import unrn.edu.ar.modelo.Gerente;
import unrn.edu.ar.modelo.LiderDeProyecto;
import unrn.edu.ar.modelo.MandoMedio;

class EmpleadoTest {

	@Test
	void testCalcularMontoTotalSalarialDesdeDirector() {
		EmpleadoRegular empleado = new EmpleadoRegular(1000);
		LiderDeProyecto lider = new LiderDeProyecto(empleado, 2000);
		MandoMedio mandoMedio = new MandoMedio(lider, 3000);
		Gerente gerente = new Gerente(mandoMedio, 4000);
		Director director = new Director(gerente, 5000);
		assertEquals(director.calcularMontoTotalSalarial(), 15000.0, 0.0);

	}

	@Test
	void testCalcularMontoTotalSalarialDesdeGerente() {
		EmpleadoRegular empleado = new EmpleadoRegular(1000);
		LiderDeProyecto lider = new LiderDeProyecto(empleado, 2000);
		MandoMedio mandoMedio = new MandoMedio(lider, 3000);
		Gerente gerente = new Gerente(mandoMedio, 4000);
		assertEquals(gerente.calcularMontoTotalSalarial(), 10000.0, 0.0);

	}
}
