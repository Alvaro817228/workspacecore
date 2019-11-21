import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {
		// Java tiene listas dinamicas y listas
		//estaticas
		
		//estatica
		int[] arrayNumeros = new int[10];
		arrayNumeros[0] = 23;
		arrayNumeros[4] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros[1]);
		System.out.println(arrayNumeros.length);
		System.out.println("-------- Recorremos array --------");
		for(int i=0;i<=arrayNumeros.length - 1;i++) {
			System.out.println("Valor de la posicon " + i + " del array es " + arrayNumeros[i]);
		}
		
		//si  poneis una posicion del array que no existe, pagaras cara tu estupidez
		//porque java te para el programa instantaneamente
		
		System.out.println(arrayNumeros[9]);
		System.out.println("esto se ejecuta despues");
		
		//Dinamicos, son objetos en java
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add(0, "jarry");//primer valor, posicion, segundo valor el valor
		listaStrings.add(1, "Ernion");
		boolean a = listaStrings.add("ron");
		System.out.println(listaStrings.get(0));
		System.out.println(listaStrings.get(2));
		
		for(int i = 0; i < listaStrings.size();i++) {
			System.out.println(i);
			System.out.println(listaStrings.get(i));
		}
		
		//para recorrer un array tanto estatico como dinamico es un for each
		for(String valor : listaStrings) {
			System.out.println(valor);
		}
		
		System.out.println("------  Recorriendo el array estatico  ----------");
		for(int n : arrayNumeros) {
			System.out.println(n);
		}
	}

}







