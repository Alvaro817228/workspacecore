
public class Ejercicio11 {

	public static void main(String[] args) {
		imprimirPersonaMayuscula("Juanchito", "Gomez", 34, "918765432");
		imprimirPersonaMayuscula("Mortadelo", "chope", 80, "678906745");
		imprimirPersonaMayuscula("Filemon", "Pi", 80, "789456723");
		
		imprimirPersonaMinuscula("Juanchito", "Gomez", 34, "918765432");
		imprimirPersonaMinuscula("Mortadelo", "chope", 80, "678906745");
		imprimirPersonaMinuscula("Filemon", "Pi", 80, "789456723");
		
		imprimirPersona("Juanchito", "Gomez", 34, "918765432",true);
		imprimirPersona("Mortadelo", "chope", 80, "678906745",false);
		imprimirPersona("Filemon", "Pi", 80, "789456723",true);
	}

	public static void imprimirPersonaMayuscula(String nombre, String apellidos, int edad, String telefono) {
		System.out.println("nombre: " + nombre.toUpperCase());
		System.out.println("apellidos: " + apellidos.toUpperCase());
		System.out.println("edad: " + edad);
		System.out.println("telefono: " + telefono.toUpperCase());
	}
	
	public static void imprimirPersonaMinuscula(String nombre, String apellidos, int edad, String telefono) {
		System.out.println("nombre: " + nombre.toLowerCase());
		System.out.println("apellidos: " + apellidos.toLowerCase());
		System.out.println("edad: " + edad);
		System.out.println("telefono: " + telefono);
	}
	
	public static void imprimirPersona(String nombre, 
										String apellidos, 
										int edad, 
										String telefono,
										boolean mayusculas) {
		if(mayusculas) {
			imprimirPersonaMayuscula(nombre, apellidos, edad, telefono);
		}else {
			imprimirPersonaMinuscula(nombre, apellidos, edad, telefono);
		}
		
	}
	
}
