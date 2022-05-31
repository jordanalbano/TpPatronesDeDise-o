package junit.unrn.ar.edu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import unrn.ar.edu.modelo.ExcepcionPorCantidadDeRemeras;
import unrn.ar.edu.modelo.ExcepcionPorCantidadIncorrecta;
import unrn.ar.edu.modelo.ExcepcionPorEmailInvalido;
import unrn.ar.edu.modelo.ExcepcionPorNoIndicarCantidad;
import unrn.ar.edu.modelo.ExcepcionPorNoIndicarEmail;
import unrn.ar.edu.modelo.Fecha;
import unrn.ar.edu.modelo.VentasEntrada;

class VentasTest {

	@Test
	void generarVenta() throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail,
			ExcepcionPorEmailInvalido, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		// settup
		String cantidadDeRemeras = "5";
		int idRemera = 1;
		String correo = "micorreo@gmail.com";
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 10, 55));

		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		ventas.agregarVenta(cantidadDeRemeras, idRemera, correo);
		// verificacion
		assertEquals(ventas.montoTotal(), 10000);

	}

	@Test
	void calcularMontoAPagarDeVenta() throws ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail,
			ExcepcionPorEmailInvalido, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras, IOException {
		// settup
		String cantidadDeRemeras = "5";
		int idRemera = 1;
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 13, 55));
		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		double montoTotalAPagar = ventas.calcularMontoTotalAPagar(cantidadDeRemeras, idRemera);
		// verificacion
		assertEquals(montoTotalAPagar, 10000);
	}

	@Test
	void agregarVentaDeRemerasLisasSinDescuento()
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		// settup
		String cantidadDeRemeras = "5";
		int idRemera = 1;
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 4, 55));
		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		double montoTotalAPagar = ventas.calcularMontoTotalAPagar(cantidadDeRemeras, idRemera);
		// verificacion
		assertEquals(montoTotalAPagar, 10000);
	}

	@Test
	void agregarVentaDeRemerasLisasConDescuento()
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		// settup
		String cantidadDeRemeras = "5";
		int idRemera = 1;
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 9, 55));
		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		double montoTotalAPagar = ventas.calcularMontoTotalAPagar(cantidadDeRemeras, idRemera);
		// verificacion
		assertEquals(montoTotalAPagar, 9500);
	}

	@Test
	void agregarVentaDeRemerasEstampadasConDescuentoDomingo()
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		String cantidadDeRemeras = "2";
		int idRemera = 2;
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 8, 4, 55));
		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		double montoTotalAPagar = ventas.calcularMontoTotalAPagar(cantidadDeRemeras, idRemera);
		// verificacion
		assertEquals(montoTotalAPagar, 4500);
	}

	@Test
	void agregarVentaDeRemerasEstampadasConDescuentoSabado()
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {

		String cantidadDeRemeras = "4";
		int idRemera = 2;
		EnMemoriaRegistro registroEnMemoria = new EnMemoriaRegistro();
		EnMemoriaEnvioEmail envioEmail = new EnMemoriaEnvioEmail("Envio con exito");
		Fecha fecha = new Fecha(LocalDateTime.of(2022, 5, 7, 4, 55));
		System.out.println(fecha.diaDeLaSemana());
		VentasEntrada ventas = new VentasEntrada(registroEnMemoria, envioEmail, fecha);
		// testeo
		double montoTotalAPagar = ventas.calcularMontoTotalAPagar(cantidadDeRemeras, idRemera);
		// verificacion
		assertEquals(montoTotalAPagar, 8800);
	}

}
