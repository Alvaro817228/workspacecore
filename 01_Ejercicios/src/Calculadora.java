import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Fin");
			opcion = sc.nextInt();
			if(opcion == 1) {
				System.out.println("Ha elegido la opcion sumar");
			}else if(opcion == 2){
				System.out.println("Ha elegido la opcion restar");
			}else if(opcion == 3){
				System.out.println("Ha elegido la opcion multiplicar");
			}else if(opcion == 4){
				System.out.println("Ha elegido la opcion dividir");
			}
		}while(opcion != 0);
		
		System.out.println("Fin del programa :)");
	}

}
