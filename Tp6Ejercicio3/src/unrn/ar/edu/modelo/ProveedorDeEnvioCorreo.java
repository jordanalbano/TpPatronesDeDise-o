package unrn.ar.edu.modelo;

public interface ProveedorDeEnvioCorreo {

	String enviarCorreo(String emailEmisor, String emailReceptor, String detalles);

}
