
public class MainCoche {

	public static void main(String[] args) {
		Coche manolo = new Coche();
		manolo.matricula = "CFG1234";
		manolo.marca = "Peugeot";
		manolo.modelo = "207";
		manolo.esNuevo = true;
		
		Coche coche2 = new Coche();
		coche2.matricula = "CFG1235";
		//coche2.marca = "Renault";
		coche2.modelo = "Megane";
		coche2.esNuevo = false;
		
		Coche coche3 = new Coche();
		coche3.matricula = "CFG1236";
		coche3.marca = "Seat";
		coche3.modelo = "Panda";
		coche3.esNuevo = false;
		
		/*
		System.out.println("Matricula " + manolo.matricula);
		System.out.println("marca " + manolo.marca);
		System.out.println("Modelo " + manolo.modelo);
		System.out.println("Es nuevo? : " + manolo.esNuevo);
		
		System.out.println("Matricula " + coche2.matricula);
		System.out.println("marca " + coche2.marca);
		System.out.println("Modelo " + coche2.modelo);
		System.out.println("Es nuevo? : " + coche2.esNuevo);
		
		System.out.println("Matricula " + coche3.matricula);
		System.out.println("marca " + coche3.marca);
		System.out.println("Modelo " + coche3.modelo);
		System.out.println("Es nuevo? : " + coche3.esNuevo);*/

		//funciones
		imprimirCoche(coche2);
		imprimirCoche(coche2);
		imprimirCoche(coche2);
		//imprimirCoche(coche2);
		//imprimirCoche(coche2);
		
		System.out.println("*********** Ahora con constructores ************");
		System.out.println();
		Coche coche4 = new Coche("CWX1234");
		coche4.marca = "Ferrari";
		coche4.modelo = "Testarrosa";
		imprimirCoche(coche4);
		Coche coche5 = new Coche("TDE5678", "Wolkswagen");
		imprimirCoche(coche5);
		Coche coche6 = new Coche("HRT9876", "Audi", "A4", true);
		imprimirCoche(coche6);
		
	}
	
	public static void imprimirCoche(Coche coche) {
		System.out.println("Matricula: " + coche.matricula);
		System.out.println("marca " + coche.marca);
		System.out.println("Modelo " + coche.modelo);
		System.out.println("Es nuevo? : " + coche.esNuevo);
		System.out.println();
	}
	

}









