import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		
		ArrayList<String> listaNombres = new ArrayList<String>();
	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 1000000; i++) {
			System.out.println("introduce el nombre: ");
			String nombre = sc.nextLine();
			listaNombres.add(nombre);//leemos y asignamos a nombre
		}
		
	
		System.out.println("---- Los nombre en mayusculas ------");
		for(String valor : listaNombres) {
			System.out.println(valor.toUpperCase());
		}
		
		
		System.out.println("---- Los nombre en mayusculas ------");
		for(String valor : listaNombres) {
			System.out.println(valor.toLowerCase());
		}
	  }
}