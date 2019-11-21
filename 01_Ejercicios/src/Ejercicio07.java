import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		
		do {
			System.out.println("Introduzca un nombre: (hasta FIN)");
			nombre = sc.nextLine();
			if(!nombre.equalsIgnoreCase("FIN")) {
				listaNombres.add(nombre);
			}			
		}while(!nombre.equalsIgnoreCase("FIN"));

		for(String valor : listaNombres) {
			System.out.println(valor);
		}
	}

}
