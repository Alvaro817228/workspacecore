package ejerciciopoo;

import java.util.ArrayList;

public class MainCasa {
	public static void main(String[] args) {
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		Direccion direccion = new Direccion();

		direccion.setTipoVia("Calle");
		direccion.setNombreVia("Serrano");
		direccion.setNumero("378");
		direccion.setCp("28001");
		direccion.setCiudad("Madrid");
		
		Habitacion salon = new Habitacion();
		salon.setTipoHabitacion("Salón");
		salon.setM2(50);
		
		Habitacion cocina = new Habitacion();		 
		cocina.setTipoHabitacion("Cocina");
		cocina.setM2(20);
		
		listaHabitaciones.add(cocina);
		listaHabitaciones.add(salon);
		
		Persona duenio = new Persona();
		duenio.setNombre("Manuel López");
		duenio.setDireccion(direccion);
		
		Casa chalet = new Casa(); 
		chalet.setListaHabitaciones(listaHabitaciones);
		chalet.setDireccion(direccion);
		chalet.setDuenio(duenio);
		chalet.setPrecio(3000000);
		//maneras de cambiar los metros cuadrados del salon
		//1
		salon.setM2(60);
		//2
		listaHabitaciones.get(1).setM2(60);
		//3
		chalet.getListaHabitaciones().get(1).setM2(60);
		
		System.out.println(chalet);
	}
}



