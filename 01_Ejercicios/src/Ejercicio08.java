import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		String nombre = "";
		String nombre2 = "";
		String nombre3 = "";
		String nombre4 ="";
		String nombre5 = "";
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el nombre: ");
		nombre = sc.nextLine();//leemos y asignamos a nombre
		
		System.out.println("introduce el nombre: ");
		nombre2 = sc.nextLine();//leemos y asignamos a nombre
		
		System.out.println("introduce el nombre: ");
		nombre3 = sc.nextLine();//leemos y asignamos a nombre
		
		System.out.println("introduce el nombre: ");
		nombre4 = sc.nextLine();//leemos y asignamos a nombre
		
		System.out.println("introduce el nombre: ");
		nombre5 = sc.nextLine();//leemos y asignamos a nombre
		
		System.out.println("---- Los nombre en mayusculas ------");
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre2.toUpperCase());
		System.out.println(nombre3.toUpperCase());
		System.out.println(nombre4.toUpperCase());
		System.out.println(nombre5.toUpperCase());
		
		System.out.println("---- Los nombre en minusculas ------");
		System.out.println(nombre.toLowerCase());
		System.out.println(nombre2.toLowerCase());
		System.out.println(nombre3.toLowerCase());
		System.out.println(nombre4.toLowerCase());
		System.out.println(nombre5.toLowerCase());
	}

}
