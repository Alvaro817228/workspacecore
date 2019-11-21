import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero = 0;
		int numeroMayor = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("introduzca un numero");
			numero = sc.nextInt();
			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
		} while (numero > 0);
		System.out.println("El numero mayor es: " + numeroMayor);
		System.out.println("Gracias por utilizar nuestro programa");
		System.out.println("(tenemos microtransaccion :) :) :) )");
	}

}
