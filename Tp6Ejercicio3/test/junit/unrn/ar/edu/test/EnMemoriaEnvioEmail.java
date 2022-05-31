package junit.unrn.ar.edu.test;

import unrn.ar.edu.modelo.ProveedorDeEnvioCorreo;

public class EnMemoriaEnvioEmail implements ProveedorDeEnvioCorreo {
	String resultado;

	public EnMemoriaEnvioEmail(String message) {
		this.resultado = message;
	}

	@Override
	public String enviarCorreo(String emailEmisor, String emailReceptor, String detalles) {
		return resultado;
	}

}
