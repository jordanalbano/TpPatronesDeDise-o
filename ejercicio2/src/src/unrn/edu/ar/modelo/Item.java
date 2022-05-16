package src.unrn.edu.ar.modelo;

import java.util.ArrayList;
import java.util.List;

public class Item implements InterfaceItem {
	List<InterfaceItem> items;
	private int tiempo;

	public Item(int tiempo) {
		//
		this.tiempo = tiempo;
		items = new ArrayList<InterfaceItem>();
	}

	@Override
	public int calcularTiempoFinalizacion() {
		return (int) this.tiempo + this.items.stream().mapToInt(i -> i.calcularTiempoFinalizacion()).sum();
	}

	@Override
	public void agregarItem(InterfaceItem item) {
		this.items.add(item);

	}

}
