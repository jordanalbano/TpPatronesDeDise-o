package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.unrn.edu.ar.modelo.Item;
import src.unrn.edu.ar.modelo.Spike;

class ItemTest {

	@Test
	void testCalcularTiempoFinalizacionHU() {
		Item historiaDeUsuario = new Item(6);
		Item tarea1 = new Item(1);
		Item tarea2 = new Item(2);
		Item tarea3 = new Item(3);
		historiaDeUsuario.agregarItem(tarea1);
		historiaDeUsuario.agregarItem(tarea2);
		historiaDeUsuario.agregarItem(tarea3);
		assertEquals(historiaDeUsuario.calcularTiempoFinalizacion(), 12);
	}

	@Test
	void testCalcularTiempoFinalizacionSpike() {
		Spike spike = new Spike(6);

	}

}
