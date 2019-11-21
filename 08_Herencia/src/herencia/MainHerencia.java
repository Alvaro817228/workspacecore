package herencia;

import java.util.ArrayList;

public class MainHerencia {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setDni("529987654");
		p.setPeso(59);
		p.setEdad(40);
		
		Milenial m = new Milenial();
		m.setDni("34567889");
		m.setEdad(30);
		m.setPeso(89);
		m.setLlevaGorra(true);
		m.setPereza(7);
		
		GeneracionZ gz = new GeneracionZ();
		gz.setDni("12345678");
		gz.setEdad(18);
		gz.setPeso(71);
		gz.setLlevaGorra(false);
		gz.setPereza(4);
		gz.setTrabajaExtranjero(true);

		//una referencia padre puede apuntar a 
		//cualquier objeto hijo
		Persona p2 = gz;
		Persona p3 = m;
		//Aunque pueda apuntar a cualquier de sus hijos
		//solamente puedo acceder a los metodos y 
		//atributos del tipo de la referencia

		System.out.println(p2.getDni());//12345678
		//System.out.println(p2.getPereza());
		
		Persona p4 = new Milenial();
		p4.setPeso(34);
		//p4.setPereza();
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p);
		listaPersonas.add(m);
		listaPersonas.add(gz);
		
		System.out.println(listaPersonas.get(2).getDni());
		//si sabemos que un objeto es de un tipo concreto
		//podemos hacer un casting 
		GeneracionZ gz1 = (GeneracionZ)listaPersonas.get(2);
		System.out.println(gz1.getPereza());
		System.out.println(gz1.isTrabajaExtranjero());
		
		for(Persona p5 : listaPersonas) {
			System.out.println(p5);
		}
	}

}



