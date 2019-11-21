package ejercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Libreria {
    private ArrayList<Libro> listaLibros;

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public Libro busquedaIsbn(String isbnUsuario) {
		for(Libro l : listaLibros) {
			if(l.getIsbn().equalsIgnoreCase(isbnUsuario)) {
				 return l;
			}
	   }	
		return null;
    }
	
	public ArrayList<Libro> busquedaEditorial(String editorial){
		ArrayList<Libro> listaLibrosEditorial = new ArrayList<Libro>();
		for(Libro l : listaLibros){
			if(l.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(l);
			}
		}
		return listaLibrosEditorial;
	}
	
	public ArrayList<Libro> busquedaLibrosPorNombreAutor(String nombre){
		ArrayList<Libro> listaLibrosPorAutor = new ArrayList<Libro>();
		for(Libro l : listaLibros){
			if(l.getAutor().getNombre().equalsIgnoreCase(nombre)) {
				listaLibrosPorAutor.add(l);
			}
		}
		return listaLibrosPorAutor;
	}
	
	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + "]";
	}
	
}




