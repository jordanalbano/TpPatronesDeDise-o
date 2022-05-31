package unrn.ar.edu.modelo;

public class ExcepcionPorEmailInvalido extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3291256907490148422L;

	public ExcepcionPorEmailInvalido(String message) {
		super(message);
	}
}
