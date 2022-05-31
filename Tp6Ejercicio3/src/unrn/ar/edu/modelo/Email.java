package unrn.ar.edu.modelo;

public class Email {
	private String email;

	public Email(String email) throws ExcepcionPorEmailInvalido {
		if (!esEmailValido(email)) {
			throw new ExcepcionPorEmailInvalido("ingrese un email valido");
		}
		this.email = email;
	}

	public String email() {
		return this.email;
	}

	private boolean esEmailValido(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

}
