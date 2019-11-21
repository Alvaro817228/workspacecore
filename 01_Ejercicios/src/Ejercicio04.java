import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		long numero = 0;
		long resultado = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		numero = sc.nextLong();
		for(int i = 2;i<=numero;i++) {
			resultado = resultado * i;
		}
		System.out.println("El factorial de " + numero + " es: " + resultado);
	}

}
