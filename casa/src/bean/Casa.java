package bean;

import java.util.ArrayList;

public class Casa {
	private double precio;
	private ArrayList<Habitacion> listaHabitaciones;
	private Persona propietario;
	private Direccion direccion;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", listaHabitaciones=" + listaHabitaciones + ", propietario=" + propietario
				+ ", Direccion=" + direccion + "]";
	}

}