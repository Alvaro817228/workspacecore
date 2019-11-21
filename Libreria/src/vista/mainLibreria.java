package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Libreria;
import modelo.entidad.Libros;
import modelo.logico.Lista_Libros;





public class mainLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcion =" 0";
		Lista_Libros gl = new Lista_Libros ();
		ArrayList<Libros> listaLibros = new ArrayList<Libros> ();
		Libreria libreria = new Libreria ();
		libreria.setListaLibros(listaLibros);
		System.out.println("introduce el nombre de la libreria");
		libreria.setNombre(sc.nextLine());
		
		gl.setLibreria(libreria);
		
		do {
			System.out.println("1-Dar de alta un libro :");
			System.out.println("2-Listar libros :");
			System.out.println("3-buscar libros por ISBN :");
			System.out.println("4-buscar libros por editorial :");
			
			opcion = sc.nextLine();
			
			if(opcion.equals("1")) {
				System.out.println("introudzca el titulo");
				String titulo = sc.nextLine();
				System.out.println("introduzca el ISBN");
				String ISBN = sc.nextLine();
				System.out.println("introduzca el editorial");
				String editorial = sc.nextLine();
				System.out.println("introduzca el anioDepublicacion");
				String sanioDepublicacion = sc.nextLine();
				int anioDepublicacion = Integer.parseInt(sanioDepublicacion);
				Libros libros = new Libros();
				libros.setTitulo(titulo);
				libros.setISBN(ISBN);
				libros.setEditorial(editorial);
				
				libros.setAniopublicacion(anioDepublicacion);
				boolean alta = gl.alta(libros);
				if(alta) {
					System.out.println("libro introducido correctamente");
				}
					else {
						
						System.out.println("el libro tiene que tener ISBN y titulo");
					}
				
			}else if (opcion.equals("2")) {
				for (Libros p : gl.getLibreria().getListaLibros()) {
					System.out.println(p);
				}}
					else if (opcion.equals("3")) {
						System.out.println("introduce el ISBN");
						String ISBN = sc.nextLine();
						Libros p = gl.libroPorISBN(ISBN);
						if (p == null) {
							System.out.println("no hay libro");
							
				
				
				
				
			}else {
				System.out.println(p);
			
		
					
		
		
			}}else if (opcion.equals("4")) {
				System.out.println("introduzca la editorial");
				String editorial = sc.nextLine();
				
				ArrayList<Libros> lista = gl.libroPorEditorial(editorial);
				if(lista.size()!= 0) {
					System.out.println("la lista de libros en la editorial es :");
					for(Libros p : lista) {
						System.out.println(p);
						
					}}else {
						System.out.println("no hay libros de la editorial");
					}}}while (!opcion .equals("0"));
		System.out.println("salir del programa");
		


}}
