package unrn.ar.edu.menu;

import java.time.LocalDateTime;

import unrn.ar.edu.modelo.Fecha;
import unrn.ar.edu.modelo.ProveedorDeEnvioCorreo;
import unrn.ar.edu.modelo.ProveedorDeFechaHora;
import unrn.ar.edu.modelo.VentasEntrada;
import unrn.ar.edu.persistencia.EnDiscoVentaConPipeSalida;
import unrn.ar.edu.servicios.EnvioCorreos;
import unrn.ar.edu.ui.ComprarRemeras;

public class MenuPipes {
	public static void main(String[] args) {
		EnDiscoVentaConPipeSalida salida = new EnDiscoVentaConPipeSalida(
				"C:\\Users\\usuario\\Desktop\\RegistroDeVentasConPipe.txt");
		ProveedorDeEnvioCorreo envioCorreo = new EnvioCorreos();
		ProveedorDeFechaHora fecha = new Fecha(LocalDateTime.now());
		ComprarRemeras gui = new ComprarRemeras(new VentasEntrada(salida, envioCorreo, fecha));
		gui.setVisible(true);
	}

}
