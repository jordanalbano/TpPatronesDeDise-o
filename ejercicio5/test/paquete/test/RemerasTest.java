package paquete.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.edu.modelo.RemerasImportadas;
import ar.unrn.edu.modelo.RemerasNacionales;

class RemerasTest {

	@Test
	void testRemerasImportadas() {
		RemerasImportadas remerasImportadas = new RemerasImportadas(100);
		double resultado = remerasImportadas.calcularPrecio();
		assertEquals(resultado, 135.1875, 0.0);
	}

	@Test
	void testRemerasNacionales() {
		RemerasNacionales remerasImportadas = new RemerasNacionales(100);
		double resultado = remerasImportadas.calcularPrecio();
		assertEquals(resultado, 140.48399999999998, 0.0);
	}
}
