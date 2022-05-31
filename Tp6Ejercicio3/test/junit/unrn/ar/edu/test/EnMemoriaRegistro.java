package junit.unrn.ar.edu.test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

import unrn.ar.edu.modelo.RepositorioVentasSalida;

public class EnMemoriaRegistro implements RepositorioVentasSalida {
	private String registro;

	public EnMemoriaRegistro() {
	}

	public Optional<String> registro() {
		return Optional.of(Objects.requireNonNull(this.registro, "no hay ningun registro guardado"));

	}

	@Override
	public void registrarVenta(LocalDate fecha, int cantidad, double montoTotal) throws IOException {
		this.registro = fecha + "," + cantidad + "," + montoTotal;

	}

}
