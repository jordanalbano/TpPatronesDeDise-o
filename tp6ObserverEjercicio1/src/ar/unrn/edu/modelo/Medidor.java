package ar.unrn.edu.modelo;

import java.util.ArrayList;
import java.util.List;
//es el objeto a observar
public class Medidor extends Observable{
	private String temperatura;
	 private ClimaOnline clima;
	 public Medidor(ClimaOnline clima,List<Observer> list) {
		 this.clima = clima;
		 for(Observer o : list) {
			 this.agregarObservable(o);
		 }
	 }
	 public String leerTemperatura() {
		 //leo la temperatura del servicio web
		 this.temperatura = this.clima.temperatura();
		 this.notificar(this.temperatura);//cuando cambia la temperatura se notifica a los observadores
		 return this.temperatura;
	 }


}
