package src.unrn.edu.ar.modelo;

public class HistoriaDeUsuario implements Item {
	// hace falta crear un Tareas que manipule a las tareas?
	// porque dice que "las historias se componen de tareas"
	private Tarea tarea;
	private double tiempo;

	public HistoriaDeUsuario(Tarea tarea, double tiempo) {
		this.tarea = tarea;
		this.tiempo = tiempo;
	}

	@Override
	public double calcularTiempoFinalizacion() {

		return tiempo + this.tarea.calcularTiempoFinalizacion();
	}

}
