package modelo.logico;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libros;

public class Lista_Libros {
	
	Libreria libreria;
	
	public Libreria getLibreria() {
		return libreria;
	}


	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}


	public boolean alta(Libros p) {

		if (p.getTitulo().length() > 0
				&& p.getISBN().length()> 0
				&& libroPorISBN (p.getISBN()) == null) {
			
			libreria.getListaLibros().add(p);
			return true;
		} else {
			return false;
		}
	}

	
	public Libros libroPorISBN(String ISBN) {
		
	for (Libros p : libreria.getListaLibros()) {
		if (p.getISBN().equals(ISBN)) {
			return p;
		}
		
	}
	
	
	return null;
	}
	public ArrayList<Libros> libroPorEditorial(String Editorial) {
		ArrayList<Libros> librosBuscados = new ArrayList<Libros>();
		for (Libros p : libreria.getListaLibros()) {
			if (p.getEditorial().equals(Editorial)) {
				librosBuscados.add(p);
			}
		}
		
		
		return librosBuscados;
	}
	
}
