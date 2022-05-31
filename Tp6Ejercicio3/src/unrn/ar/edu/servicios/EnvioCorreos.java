package unrn.ar.edu.servicios;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import unrn.ar.edu.modelo.ProveedorDeEnvioCorreo;

public class EnvioCorreos implements ProveedorDeEnvioCorreo {
	// private static String to;
	// Put sender�s address
	// private static String from;
	private final static String username = "93699ce560f514";// username generated by Mailtrap
	private final static String password = "5196ff03c7b4da";// password generated by Mailtrap
	private static String mensaje;
	// Paste host address from the SMTP settings tab in your Mailtrap Inbox
	private static String host = "smtp.mailtrap.io";
	private static Properties props;

	@Override
	public String enviarCorreo(String emailEmisor, String emailReceptor, String detalles) {
		props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");// it�s optional in Mailtrap
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "2525");// use one of the options in the SMTP settings tab in your Mailtrap Inbox
		// Get the Session object.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field
			message.setFrom(new InternetAddress(emailReceptor));

			// Set To: header field
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailEmisor));

			// Put the content of your message
			message.setText(mensaje);

			// Send message
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return "Enviado con exito";
	}
}
