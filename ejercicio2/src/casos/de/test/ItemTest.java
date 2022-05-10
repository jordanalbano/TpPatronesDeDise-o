package casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.unrn.edu.ar.modelo.HistoriaDeUsuario;
import src.unrn.edu.ar.modelo.Spike;
import src.unrn.edu.ar.modelo.Tarea;

class ItemTest {

	@Test
	void testCalcularTiempoFinalizacionHU() {
		Tarea tarea = new Tarea(10.0);
		HistoriaDeUsuario historia = new HistoriaDeUsuario(tarea, 20.0);
		assertEquals(30.0, historia.calcularTiempoFinalizacion(), 0.0);
	}
	@Test
	void testCalcularTiempoFinalizacionSpike() {
		Spike spike = new Spike(3.0);
		
		assertEquals(3.0, spike.calcularTiempoFinalizacion(), 0.0);
	}

}
