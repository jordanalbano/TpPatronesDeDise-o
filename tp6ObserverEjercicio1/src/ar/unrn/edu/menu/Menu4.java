package ar.unrn.edu.menu;

import java.nio.file.Path;
import java.util.List;

import ar.unrn.edu.modelo.EnArchivoDeTexto;
import ar.unrn.edu.modelo.ImprimirConsola;
import ar.unrn.edu.modelo.Medidor;
import ar.unrn.edu.modelo.WeatherChannelService;
public class Menu4 {
	public static void main(String [] args) {
		WeatherChannelService servicio = new WeatherChannelService();
		Path path = Path.of("C:\\Users\\J.albano\\Desktop\\ejemplo.txt");
		Medidor medidor = new Medidor(servicio,List.of(new EnArchivoDeTexto(path), new ImprimirConsola()));
		medidor.leerTemperatura();
		medidor.leerTemperatura();
		medidor.leerTemperatura();
		medidor.leerTemperatura();
		medidor.leerTemperatura();
	}
}
