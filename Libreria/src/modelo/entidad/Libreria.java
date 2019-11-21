package modelo.entidad;

import java.util.ArrayList;

public class Libreria {
	String nombre;
	ArrayList<Libros> listaLibros;
	@Override
	public String toString() {
		return "libreria [nombre=" + nombre + ", listaLibros=" + listaLibros + "]";
	}
	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Libros> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList<Libros> listaLibros) {
		this.listaLibros = listaLibros;
	}

}
