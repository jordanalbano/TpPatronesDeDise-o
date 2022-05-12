package src.unrn.edu.ar.modelo;

import java.util.ArrayList;
import java.util.List;

public class Item implements InterfaceItem {
	List<InterfaceItem> items;
	private int tiempo;

	public Item(int tiempo) {
		this.tiempo = tiempo;
		items = new ArrayList<InterfaceItem>();
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}

	@Override
	public int calcularTiempoFinalizacion() {
		return (int) this.tiempo + this.items.stream().mapToInt(i -> i.calcularTiempoFinalizacion()).sum();
	}

}
