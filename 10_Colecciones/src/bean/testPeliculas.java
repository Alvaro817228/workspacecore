package bean;

import java.util.ArrayList;
import java.util.Scanner;

public class testPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		int opcion = 0;
		do {
			System.out.println(" 1-alta pelicula :");
			System.out.println("2-listar pelicula :");
			System.out.println("3-buscar pelicula por titulo:");
			System.out.println("0- salir del programa");

			opcion = sc.nextInt();
			if (opcion == 1) {
				Peliculas peliculasNuevo = new Peliculas();
				System.out.println("titulo");
				peliculasNuevo.setTitulo(sc.next());
				System.out.println("genero");
				peliculasNuevo.setGenero(sc.next());

				Director nuevoDirector = new Director();
				System.out.println("edad");

				nuevoDirector.setEdad(sc.next());
				System.out.println("nombre Director");
				nuevoDirector.setNombre(sc.next());
				peliculasNuevo.setDirector(nuevoDirector);

				System.out.println("a�o de estreno");
				peliculasNuevo.setA�o(sc.next());
				listaPeliculas.add(peliculasNuevo);

			} else if (opcion == 2) {
				for (Peliculas pelicula : listaPeliculas) {
					System.out.println(pelicula);
				}
			} else if (opcion == 3) {
				System.out.println("titulo");
				String titulo = sc.next();
				for (Peliculas pelicula : listaPeliculas) {
					String peliculatitulo = pelicula.getTitulo();
					if (peliculatitulo.contentEquals(titulo)) {
						System.out.println(pelicula);
					}
				}
				
				
		

			}

		} while (opcion != 0);
		System.out.println("salir del programa");

	}

}
