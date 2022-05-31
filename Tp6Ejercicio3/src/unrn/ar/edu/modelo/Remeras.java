package unrn.ar.edu.modelo;

import java.util.ArrayList;

public class Remeras {

	private ArrayList<Remera> remeras;
	private int cantRemeras;

	public Remeras(ArrayList<Remera> remeras) {
		this.remeras = remeras;
	}

	public Remeras(int cantidad, int idRemera, ProveedorDeFechaHora fecha) {
		Remera remera = null;
		remeras = new ArrayList<>();
		double precio;
		if (idRemera == 1) {
			precio = 2000;
			remera = new RemeraLisa(new DescuentoLisa(fecha), precio);
		}
		if (idRemera == 2) {
			precio = 2500;
			remera = new RemeraEstampada(new DescuentoEstampada(fecha), precio);
		}
		for (int i = 0; i < cantidad; i++) {

			this.remeras.add(remera);
		}
		this.cantRemeras = cantidad;
	}

	public void agregarRemera(Remera nuevaRemera) {
		this.remeras.add(nuevaRemera);
	}

	public double calcularPrecioTotal() {
		return (double) this.remeras.stream().mapToDouble(r -> r.calcularDescuento(this.cantRemeras)).sum();
	}

	public void eliminarRemera(Remera nuevaRemera) {
		this.remeras.remove(nuevaRemera);
	}

	public int cantidadDeRemeras() {
		return this.remeras.size();
	}

}
