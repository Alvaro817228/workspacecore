package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import bean.Persona;

public class mainColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr.Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super intendente Vicente");
		
		System.out.println(listaNombres.get(0));
		System.out.println(listaNombres.get(3));
		System.out.println(listaNombres.size());
		System.out.println("++++++++++");
		
		for(int i = 0; i < listaNombres.size();i++) {
			
			System.out.println(listaNombres.get(i));
		
		}
		for(String valor : listaNombres) {
			System.out.println(valor);

	}
		System.out.println("++++++ array enteros +++++++");
		int i = 5;
		Integer entero = new Integer (4);
		Integer entero2 = 5;
		double primitivoDouble = 6.9;
		Double objetoDouble = 6.9;
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(1);
		listaEnteros.add(45);
		listaEnteros.add(new Integer (89));
		
		for(Integer v : listaEnteros) {
			System.out.println(v);
		}
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p1 = new Persona ();
		p1.setNombre("Penelope");
		p1.setEdad("33");
		
		Persona p2 = new Persona ();
		p1.setNombre("Ana");
		p1.setEdad("45");
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		
		for(Persona p : listaPersonas) {
		System.out.println("1 - El nombre es: " + p.getNombre());
		System.out.println("2 - El nombre es: " + p.getEdad());
		System.out.println("+++++++++++++++++++");
		
		}
		listaPersonas.remove(p2);
		System.out.println(p2);
		System.out.println(listaPersonas);
		
		System.out.println("**********Mapas*********");
		
				
		
		
		
	}
}



