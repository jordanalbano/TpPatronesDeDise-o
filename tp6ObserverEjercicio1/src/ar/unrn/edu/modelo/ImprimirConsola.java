package ar.unrn.edu.modelo;

public class ImprimirConsola implements Observer{
	@Override
	public void actualizar(String valor) {
		/*//le resta al string los ultimos dos caracteres, en este caso c y el espacio " "
		 * y luego se parsea a Integer*/
		Integer numero =Integer.valueOf( valor.substring (0,valor.length()-2));
		if(numero<12) {
			System.out.println("Hace frio, Se encendera la caldera");
		}
		if(numero>17) {
			System.out.println("Hace calor, Se encendera el aire acondicionado");
		}
	}

}
