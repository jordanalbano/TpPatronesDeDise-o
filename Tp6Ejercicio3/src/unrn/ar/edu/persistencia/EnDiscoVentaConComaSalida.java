package unrn.ar.edu.persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

import unrn.ar.edu.modelo.RepositorioVentasSalida;

public class EnDiscoVentaConComaSalida implements RepositorioVentasSalida {
	private String path;

	public EnDiscoVentaConComaSalida(String path) {
		this.path = path;
	}

	@Override
	public void registrarVenta(LocalDate fecha, int cantidadRemeras, double montoTotal) throws IOException {
		String detalles = fecha + "," + cantidadRemeras + "," + montoTotal + "\n";
		File f = new File(path);
		if (!f.exists()) {
			f.createNewFile();
		}
		Files.write(Paths.get("C:\\Users\\usuario\\Desktop\\RegistroDeVentasConComa.txt"), detalles.getBytes(),
				StandardOpenOption.APPEND);

	}

}
