package ar.unrn.edu.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class EnArchivoDeTexto implements Observer{
	private Path path;
	public  EnArchivoDeTexto(Path path) {
		this.path = path;
	}

	@Override
	public void actualizar(String valor) {
		valor += " fecha: " + LocalDate.now().toString()+"\n";
		try {
			Files.write(this.path, valor.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
