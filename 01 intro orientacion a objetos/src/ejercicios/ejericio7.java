package ejercicios;
import java.util.Scanner;

public class ejericio7 {

	public static void main(String[] args) {
		
		double op1 = 0, op2 = 0;
		String palabra =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero:");
		op1 =sc.nextDouble();
		System.out.println("Dame otro numero:");
		op2 =sc.nextDouble();
		System.out.println("Dame una palabra,Sumar,Restar,Multiplicar,Dividir,Resto:");
		palabra =sc.next();
		switch (palabra) {
		case  "Sumar":
			System.out.println("La Suma es" +(op1 + op2));
//		break;
		case "Restar":
			System.out.println("La Resta es" +(op1 - op2));
//			break;
		case "Multiplicar":
			System.out.println("la Multiplicacion es " + (op1 * op2));		
					
			
//			break;
		case "Dividir":
		System.out.println("La division es " + (op1 / op2));
//		break;
			
		case "Resto":
			System.out.println("el resto " +(op1 % op2));
//			break
			default:
				System.out.println();
		
	
			
			
					
		}
		
	}

}
