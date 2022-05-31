package junit.unrn.ar.edu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import unrn.ar.edu.modelo.DescuentoEstampada;
import unrn.ar.edu.modelo.DescuentoLisa;
import unrn.ar.edu.modelo.Fecha;
import unrn.ar.edu.modelo.Remera;
import unrn.ar.edu.modelo.RemeraEstampada;
import unrn.ar.edu.modelo.RemeraLisa;
import unrn.ar.edu.modelo.Remeras;

class RemerasTest {

	@Test
	void calcularDescuentoTotalRemerasEstampadasConDescuentoSabado() {
		ArrayList<Remera> listaRemerasEstampadas = new ArrayList<Remera>();
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 7, 10, 55));
		DescuentoEstampada descuento = new DescuentoEstampada(fecha);
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		Remeras remeras = new Remeras(listaRemerasEstampadas);
		remeras.calcularPrecioTotal();
		assertEquals(remeras.calcularPrecioTotal(), 8800, 0.0);

	}

	// hacer desde comienzo a fin
	// implementacion de mentira con email
	//
	@Test
	void calcularDescuentoTotalRemerasEstampadasConDescuentoDomingo() {
		ArrayList<Remera> listaRemerasEstampadas = new ArrayList<Remera>();
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 10, 55));
		DescuentoEstampada descuento = new DescuentoEstampada(fecha);
		System.out.println(fecha.diaDeLaSemana());
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		Remeras remeras = new Remeras(listaRemerasEstampadas);
		remeras.calcularPrecioTotal();
		assertEquals(remeras.calcularPrecioTotal(), 9000, 0.0);

	}

	@Test
	void calcularDescuentoTotalRemerasEstampadasSinDescuento() {
		ArrayList<Remera> listaRemerasEstampadas = new ArrayList<Remera>();
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 4, 10, 55));
		DescuentoEstampada descuento = new DescuentoEstampada(fecha);
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		listaRemerasEstampadas.add(new RemeraEstampada(descuento, 2500));
		Remeras remeras = new Remeras(listaRemerasEstampadas);
		assertEquals(remeras.calcularPrecioTotal(), 10000, 0.0);

	}

	@Test
	void testCalcularPrecioTotalDeRemerasLisasSinDescuento() {
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 4, 1, 10, 55));
		ArrayList<Remera> listaRemerasLisas = new ArrayList<Remera>();
		DescuentoLisa descuento = new DescuentoLisa(fecha);
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		Remeras remeras = new Remeras(listaRemerasLisas);
		assertEquals(remeras.calcularPrecioTotal(), 8000, 0.0);

	}

	@Test
	void testCalcularPrecioTotalDeRemerasLisasConDescuentoHorario() {
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 4, 1, 9, 55));
		ArrayList<Remera> listaRemerasLisas = new ArrayList<Remera>();
		DescuentoLisa descuento = new DescuentoLisa(fecha);
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		listaRemerasLisas.add(new RemeraLisa(descuento, 2000));
		Remeras remeras = new Remeras(listaRemerasLisas);
		assertEquals(remeras.calcularPrecioTotal(), 7600, 0.0);

	}
}
