package ejerciciopoo;

import java.util.ArrayList;

public class Casa {

	private double precio;
	private Direccion direccion; 
	private ArrayList<Habitacion> listaHabitaciones; 
	private Persona duenio;
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Persona getDuenio() {
		return duenio;
	}
	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", listaHabitaciones=" + listaHabitaciones
				+ ", duenio=" + duenio + "]";
	} 
	
	
	
}