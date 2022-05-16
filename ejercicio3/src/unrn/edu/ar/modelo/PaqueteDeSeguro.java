package unrn.edu.ar.modelo;

import java.util.ArrayList;
import java.util.List;

public class PaqueteDeSeguro implements ComponenteSeguro {
	private List<ComponenteSeguro> paquetes;
	private List<ComponenteSeguro> seguros;

	public PaqueteDeSeguro() {

		this.paquetes = new ArrayList<ComponenteSeguro>();
		this.seguros = new ArrayList<ComponenteSeguro>();
	}

	@Override
	public void agregarPaquete(ComponenteSeguro componenteSeguro) {
		this.paquetes.add(componenteSeguro);
	}

	public void agregarSeguro(ComponenteSeguro seguro) {
		this.seguros.add(seguro);
	}

	public double precioTotalConDescuento() {
		double montoDescuentoDePaquete = this.seguros.stream().mapToDouble(s -> s.precioTotalConDescuento()).sum();
		return montoDescuentoDePaquete + this.paquetes.stream().mapToDouble(p -> p.precioTotalConDescuento()).sum();
	}

	@Override
	public void agregarSeguro(Seguro seguro) {
		this.seguros.add(seguro);

	}

}
