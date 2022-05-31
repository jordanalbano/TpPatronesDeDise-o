package unrn.ar.edu.modelo;

import java.io.IOException;

public interface RepositorioVentasEntrada {
	void agregarVenta(String cantidadRemeras, int idRemera, String email)
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras;

	double montoAPagar(String cantidadRemeras, Integer id)
			throws ExcepcionPorNoIndicarCantidad, ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras;

	double calcularMontoTotalAPagar(String cantidadRemeras, int idRemera)
			throws IOException, ExcepcionPorNoIndicarCantidad, ExcepcionPorNoIndicarEmail, ExcepcionPorEmailInvalido,
			ExcepcionPorCantidadIncorrecta, ExcepcionPorCantidadDeRemeras;

}
