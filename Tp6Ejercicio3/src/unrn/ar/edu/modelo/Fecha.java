package unrn.ar.edu.modelo;

import java.time.LocalDateTime;

public class Fecha implements ProveedorDeFechaHora{
	private LocalDateTime fecha;
	public Fecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	@Override
	public int diaDeLaSemana() {
		return  fecha.getDayOfWeek().getValue();
	}
	
	public int hora() {
		return this.fecha.getHour();
	}
}
