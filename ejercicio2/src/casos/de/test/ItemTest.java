package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.unrn.edu.ar.modelo.InterfaceItem;
import src.unrn.edu.ar.modelo.Item;
import src.unrn.edu.ar.modelo.Scrum;
import src.unrn.edu.ar.modelo.Spike;

class ItemTest {

	@Test
	void testCalcularTiempoFinalizacionHU() {
		Item tarea = new Item(10);
		Item tarea2 = new Item(10);
		Item tarea3 = new Item(10);
		Item historia = new Item(20);
		historia.agregarItem(tarea);
		historia.agregarItem(tarea2);
		historia.agregarItem(tarea3);

		assertEquals(30.0, historia.calcularTiempoFinalizacion(), 30);
	}

	@Test
	void testCalcularTiempoFinalizacionScrum() {
		Item tarea = new Item(10);
		Item tarea2 = new Item(10);
		Item tarea3 = new Item(10);
		Item historiaDeUsuario = new Item(20);
		historiaDeUsuario.agregarItem(tarea);
		historiaDeUsuario.agregarItem(tarea2);
		historiaDeUsuario.agregarItem(tarea3);
		InterfaceItem scrum = new Scrum();
		InterfaceItem spike = new Spike(3);
		scrum.agregarItem(spike);
		scrum.agregarItem(historiaDeUsuario);
		assertEquals(spike.calcularTiempoFinalizacion(), spike.calcularTiempoFinalizacion(), 33);
	}

}
