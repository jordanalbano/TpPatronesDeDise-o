package unrn.ar.edu.modelo;

import java.io.IOException;
import java.time.LocalDate;

public interface RepositorioVentasSalida {
	void registrarVenta(LocalDate fecha, int cantidad, double montoTotal) throws IOException;

}
