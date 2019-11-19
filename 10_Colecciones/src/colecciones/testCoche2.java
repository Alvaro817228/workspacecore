package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class testCoche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 Scanner sc = new Scanner (System.in);
	 ArrayList<Coche>listaCoches = new ArrayList<Coche>();
	 int opcion = 0;
	 do {
		 
		System.out.println("1- Alta coche ");
		System.out.println("2- Listar coches ");
		System.out.println("0- Salir programa ");
		
		opcion = sc.nextInt();
		
		if(opcion == 1) {
	 Coche cocheNuevo = new Coche();
	 System.out.println("dame la matricula :");
	 cocheNuevo.setMatricula(sc.next());
	 System.out.println("dame la marca :");
	 cocheNuevo.setMarca(sc.next());
	 System.out.println("dame el modelo :");
	 cocheNuevo.setModelo(sc.next());
	 listaCoches.add(cocheNuevo);
		}else if (opcion == 2) {
			for(Coche coche : listaCoches) {
				System.out.println(coche);
			}
		}
		
	}while (opcion != 0);
	 System.out.println("Adios con el corazon");
	 
}
}
