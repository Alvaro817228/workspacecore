package beans;
import java.util.Scanner;

public class repetitiva01 {

	public static void main(String[] args) {
//		REPETITIVAS
//		1.	Leer un número detrás de otro mientras que el número leído 
//		sea distinto de cero.
//		Al final del proceso mostrar cuantos números válidos he leído,
//		y cuanto suman las cantidades de los números introducidos.
		Scanner sc = new Scanner(System.in);
		int num = 0,contador = 0, acumulador = 0;
		System.out.println("introduce un numero != 0");
		num = sc.nextInt();
		
		while (num != 0) {
			contador++;
			acumulador += num;
//			ojo y vuelvo a leer que se me bucla
			System.out.println("introduce un numero != 0" );
			num = sc.nextInt();
		}
			System.out.println("numeros leidos :" +contador);
			System.out.println("suman todos :"+ acumulador);
			
			sc.close();
		
	
		
			
		}
	
}
	

 
