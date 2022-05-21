package ar.unrn.decorator.modelo;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DefaultReport implements Report {

	private String reporte;

	public DefaultReport(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {

		// Exportar el reporte a un archivo.
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(reporte);
			bw.close();
		} catch (IOException e) {
			throw new RuntimeException("Error escribiendo el reporte...", e);
		}
	}
}