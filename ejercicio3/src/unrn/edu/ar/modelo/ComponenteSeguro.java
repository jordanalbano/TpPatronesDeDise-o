package unrn.edu.ar.modelo;

public interface ComponenteSeguro {

	void agregarSeguro(Seguro seguro);

	double precioTotalConDescuento();

	void agregarPaquete(ComponenteSeguro componenteSeguro);
}
