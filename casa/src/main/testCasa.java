package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;

public class testCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direccion d1 = new Direccion();
		d1.setCiudad("Madrid");
		d1.setTipovia("calle");
		d1.setNombreVia("Betanzos");
		d1.setCp("28029");
		
		Persona p1 = new Persona();
		p1.setNombre("Alvaro");
		p1.setEdad(36);
		p1.setPeso(80);
		p1.setDireccion(d1);
		
		Habitacion h1 = new Habitacion();
		h1.setM2(100);
		h1.setTipo("salon");
		Habitacion h2 = new Habitacion();
		h2.setM2(50);
		h2.setTipo("cocina");
		Habitacion h3 = new Habitacion();
		h3.setM2(60);
		h3.setTipo("dormitorio");
		
	 
		Direccion d2 = new Direccion();
		d2.setTipovia("avenida");
		d2.setNombreVia("Fuencarral");
		d2.setCiudad("Madrid");
		d2.setCp("28030");
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		
		Casa c1 = new Casa();
		c1.setDireccion(d2);
		c1.setListaHabitaciones(listaHabitaciones);
		c1.setPrecio(150000);
		c1.setPropietario(p1);
		
		System.out.println(c1);
		
		
		
		
		
		
		
		

	}

}
