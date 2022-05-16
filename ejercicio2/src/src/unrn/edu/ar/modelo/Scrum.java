package src.unrn.edu.ar.modelo;

import java.util.ArrayList;
import java.util.List;

public class Scrum implements InterfaceItem {
	private List<InterfaceItem> items;

	public Scrum() {
		items = new ArrayList<InterfaceItem>();

	}

	public Scrum(ArrayList<InterfaceItem> items) {
		this.items = items;
	}

	@Override
	public int calcularTiempoFinalizacion() {

		return (int) items.stream().mapToInt(i -> i.calcularTiempoFinalizacion()).sum();
	}

	@Override
	public void agregarItem(InterfaceItem item) {
		this.items.add(item);

	}

}
