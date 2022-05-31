package ar.unrn.edu.modelo;

import java.util.ArrayList;

public class Observable {
	private ArrayList<Observer> observadores;
	
	public Observable() {
		this.observadores = new ArrayList<Observer>();
	}

	public void notificar(String valor) {
		for(Observer observadores: this.observadores) {
			observadores.actualizar(valor);
		}
	}
	public void agregarObservable(Observer e) {
		this.observadores.add(e);
	}


	

}
