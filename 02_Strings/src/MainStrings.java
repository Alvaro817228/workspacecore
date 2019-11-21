
public class MainStrings {

	public static void main(String[] args) {
		//Las cadenas en java no son primitivos
		//son objetos
		String cadena = "Jarry Potter";
		String cadena2 = "Ernion";
		String cadena3 = "Ron Güesley";
		
		String valor ="hommer";
		String valor2 = "hommer";
		
		//para comparar strings SIEMPRE el metodo equals
		if(valor.equals(valor2)) {
			System.out.println("Los nombres son iguales");
		}
		
		String valor3 = "Hommer";
		if(valor.equals(valor3)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombre son diferentes");
		}
		
		if(valor.equalsIgnoreCase(valor3)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombre son diferentes");
		}
		
		String frase = "hommer se comio un pollo";
		if(frase.contains("hommer")) {
			System.out.println("Si que existe hommer");
		}else {
			System.out.println("no exite hommer");
		}
		
		String mayusculas = frase.toUpperCase();
		System.out.println(mayusculas);
		
		System.out.println(frase.endsWith("pollos"));
		
		String subcadena = frase.substring(0, 9);
		System.out.println(subcadena);
		
		System.out.println(frase.length());
		
	}

}










