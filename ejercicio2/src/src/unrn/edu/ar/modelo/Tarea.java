package src.unrn.edu.ar.modelo;

public class Tarea implements Item {
	private double tiempo;

	public Tarea(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public double calcularTiempoFinalizacion() {

		return this.tiempo;
	}

}
