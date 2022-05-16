package ar.unrn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unrn.edu.ar.modelo.PaqueteDeSeguro;
import unrn.edu.ar.modelo.Seguro;

class SegurosTest {

	@Test
	void test() {
		Seguro seguroMedico = new Seguro(500.0);
		Seguro seguroDeVida = new Seguro(500.0);
		Seguro seguroDeAuto = new Seguro(500.0);
		Seguro seguroMoto = new Seguro(500.0);
		Seguro seguroHogar = new Seguro(500.0);
		Seguro seguroBici = new Seguro(500.0);
		PaqueteDeSeguro paquete1 = new PaqueteDeSeguro();
		paquete1.agregarSeguro(seguroMedico);
		paquete1.agregarSeguro(seguroDeVida);
		paquete1.agregarSeguro(seguroDeAuto);
		paquete1.agregarSeguro(seguroHogar);
		paquete1.agregarSeguro(seguroMoto);
		paquete1.agregarSeguro(seguroBici);

		PaqueteDeSeguro paquete2 = new PaqueteDeSeguro();
		Seguro seguroHijo = new Seguro(500.0);
		Seguro seguroContraTerceros = new Seguro(500.0);
		paquete2.agregarSeguro(seguroHijo);
		paquete2.agregarSeguro(seguroContraTerceros);

		paquete1.agregarPaquete(paquete2);
		assertEquals(paquete1.precioTotalConDescuento(), 3800, 0.0);
		PaqueteDeSeguro paquete3 = new PaqueteDeSeguro();
	}

}
