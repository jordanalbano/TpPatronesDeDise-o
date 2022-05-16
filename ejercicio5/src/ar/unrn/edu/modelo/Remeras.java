package ar.unrn.edu.modelo;

public abstract class Remeras {
	private double precioUnitario;

	public Remeras(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double calcularPrecio() {
		double recargo = this.recargo(this.precioUnitario);
		double impuestoAduanero = this.impuestoAduanero(recargo);
		double bonificacion = this.bonificacion(impuestoAduanero);
		double recargoFinal = this.recargoFinal(bonificacion);
		return (recargoFinal);

	}

	protected abstract double bonificacion(double precioUnitario2);

	protected abstract double recargo(double precioUnitario2);

	protected abstract double impuestoAduanero(double precioUnitario2);

	protected abstract double recargoFinal(double precioUnitario2);

}
