package unrn.ar.edu.modelo;

import java.io.IOException;
import java.time.LocalDate;

public class VentasEntrada implements RepositorioVentasEntrada {
	private RepositorioVentasSalida repoSalida;
	private ProveedorDeEnvioCorreo envioCorreos;
	private Venta venta;
	private ProveedorDeFechaHora fecha;

	// Interfaz de envio de mail, va en modelo y se inyecta
	public VentasEntrada(RepositorioVentasSalida salida, ProveedorDeEnvioCorreo envioCorreos,
			ProveedorDeFechaHora fecha) {
		this.envioCorreos = envioCorreos;
		this.repoSalida = salida;
		this.fecha = fecha;
	}

	public double calcularMontoTotalAPagar(String cantidadRemeras, int idRemera)
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		return new Venta(cantidadRemeras, idRemera, fecha).calcularMontoTotalDeLaCompra();

	}

	@Override
	public void agregarVenta(String cantidadRemeras, int idRemera, String email)
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {
		this.venta = new Venta(cantidadRemeras, idRemera, this.fecha);

		this.repoSalida.registrarVenta(venta.fecha(), venta.cantidadDeRemeras(), venta.calcularMontoTotalDeLaCompra());
		Email emailComprador = new Email(email);

		this.enviarEmail(venta.fecha(), emailComprador, venta.calcularMontoTotalDeLaCompra(), cantidadRemeras);

	}

	private void enviarEmail(LocalDate fechaCompra, Email emailReceptor, double montoTotal, String cantidadDeRemeras)
			throws ExcepcionPorEmailInvalido {
		String detalles = fechaCompra.toString() + " " + "monto total:" + montoTotal + "cantidad de remeras:"
				+ cantidadDeRemeras;
		Email correoEmisor = new Email("juanitoAlcachofa@gmail.com");
		this.envioCorreos.enviarCorreo(correoEmisor.email(), emailReceptor.email(), detalles);

	}

	@Override
	public double montoAPagar(String cantidadRemeras, Integer id)
			throws ExcepcionPorNoIndicarCantidad, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras {

		Venta venta = new Venta(cantidadRemeras, id, fecha);

		return venta.calcularMontoTotalDeLaCompra();
	}

	public double montoTotal() {
		return this.venta.montoTotalDeLaCompra();
	}

}
