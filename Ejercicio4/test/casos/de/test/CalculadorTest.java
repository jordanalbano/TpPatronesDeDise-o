package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import unrn.edu.ar.modelo.Calculador;
import unrn.edu.ar.modelo.CalculadorJubilado;
import unrn.edu.ar.modelo.CalculadorNoJubilado;

class CalculadorTest {

	@Test
	void testJubiladosSinPromocion() { //
		// System.out.println(LocalDate.now().getMonthValue() - 1);
		CalculadorJubilado calculador = new CalculadorJubilado((LocalDate.now().getMonth().getValue()) - 1);
		assertEquals(110d, calculador.calcularPrecio(100), 0.01f);

	}

	@Test
	void testNoJubiladosSinPromocion() {
		CalculadorNoJubilado calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());
		// resultado esperado y el obtenido?
		assertEquals(115d, calculador.calcularPrecio(100), 0.01f);

	}

	@Test
	void testJubiladosConPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue());
		calculador.calcularPrecio(100);
		assertEquals(100, calculador.calcularPrecio(100), 0.01f);

	}

	@Test
	void testNoJubiladosConPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);
		calculador.calcularPrecio(100);
		assertEquals(121d, calculador.calcularPrecio(100), 0.01f);

	}

}
