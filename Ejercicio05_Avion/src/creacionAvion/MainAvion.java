package creacionAvion;

import java.util.ArrayList;

public class MainAvion {

	public static void main(String[] args) {
		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		
		ArrayList<Maleta> listaMaletas = new ArrayList<Maleta>();
		
		Maleta m1 = new Maleta();
		m1.setTipoMaleta("Equipaje de mano");
		m1.setPeso( 10);
		listaMaletas.add(m1);
		
		Maleta m2 = new Maleta();
		m2.setTipoMaleta("Bodega");
		m2.setPeso( 23);
		listaMaletas.add(m2);
		
		Maleta m3 = new Maleta();
		m3.setTipoMaleta("Maleta extra");
		m3.setPeso( 20.5);
		listaMaletas.add(m3);
		
		Pasajero p1 = new Pasajero();
		p1.setNombre(" Laura Lopez");
		p1.setTelefono(" 639874521");
		p1.setDni(" 51478964 G");
		p1.setListaMaletas(listaMaletas);
		listaPasajeros.add(p1);
		//4 maneras de acceder al valor del tipoMaleta de m3
		System.out.println(listaPasajeros.get(0).getListaMaletas().get(0).getTipoMaleta());
		listaPasajeros.get(0).getListaMaletas().get(0).setTipoMaleta("Maleta molona");
		System.out.println(m1.getTipoMaleta());
		
		
		ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();
		Asiento a1 = new Asiento();
		a1.setTipoAsiento("Turista");
		a1.setFila(" 23");
		a1.setPosicion(" A");
		a1.setPasajero(p1);
		listaAsientos.add(a1);
		
		ArrayList<Maleta> listaMaletaP2 = new ArrayList<Maleta>();
		Maleta mp2 = new Maleta();
		mp2.setTipoMaleta("Bodega");
		mp2.setPeso( 22.5);
		listaMaletaP2.add(mp2);
		
		Pasajero p2 = new Pasajero();
		p2.setNombre(" Lucia Garc�a");
		p2.setDni(" 54720315Q");
		p2.setTelefono(" 645872031");
		p2.setListaMaletas(listaMaletaP2);
		listaPasajeros.add(p2);
		
		Asiento a2 = new Asiento();
		a2.setTipoAsiento(" Business");
		a2.setFila(" 2");
		a2.setPosicion(" B");
		a2.setPasajero(p2);
		listaAsientos.add(a2);
		
		Asiento a3 = new Asiento();
		a3.setTipoAsiento("Turista Premium");
		a3.setFila("10");
		a3.setPosicion("F");
		listaAsientos.add(a3);
		
		Avion av = new Avion();
		av.setTipoAvion(" Boeing-345");
	    av.setListaPasajeros(listaPasajeros);
		av.setListaAsientos(listaAsientos);
		
		
		Pasajero p3 = new Pasajero();
		p3.setNombre(" Mar�a Hernandez");
		p3.setDni(" 57962014K");
		p3.setTelefono(" 645892015");
		p3.setListaMaletas(listaMaletaP2);
		listaPasajeros.add(p3);
		
		Pasajero p4 = new Pasajero();
		p4.setNombre(" Luna Ferr�n");
		p4.setListaMaletas(new ArrayList<Maleta>());
		listaPasajeros.add(p4); 
		
		/*Asiento a4 = new Asiento();
		a4.setTipoAsiento(" Turista");
		a4.setFila("20"); */
	     
		
		System.out.println("\n" + av.getTipoAvion());
		System.out.println("\n" + av.getListaPasajeros().get(0));
		System.out.println(av.getListaPasajeros().get(1));
		System.out.println("\n" + av.getListaAsientos().get(0));
		System.out.println(av.getListaAsientos().get(1));
		System.out.println(av.getListaAsientos().get(2));
		
		System.out.println("El n�mero total de pasajeros es : ");
		System.out.println(av.contarPasajeros());
		System.out.println("El n�mero total de maletas es : ");
		System.out.println(av.contarMaletas());
		System.out.println("El n�mero total de maletas tipo: : ");
		System.out.println(av.contarMaletasDeTipo("Bodega"));
		System.out.println(av.contarMaletasDeTipo("Maleta Extra"));
		System.out.println(av.contarMaletasDeTipo("Maleta Especial"));
		
	
		
		
		
		

	}

}