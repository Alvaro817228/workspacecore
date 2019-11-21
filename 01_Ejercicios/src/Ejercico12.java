import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercico12 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Andiamo lanborgini de la mia mamma");
		lista1.add("Ferraro molon rojo");
		
		recorrerArray(lista1);
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Velero");
		lista2.add("Titanic");
		
		recorrerArray(lista2);
	}
	
	public static void recorrerArray(ArrayList<String> array) {
		System.out.println("******************");
		for(String valor : array) {
			System.out.println(valor);
		}
	}
}
