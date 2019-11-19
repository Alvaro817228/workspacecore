package ejercicios;

public class ejercicio4 {
	public static void main(String[] args) {
		int mes = 13;
		switch (mes) {
		case 1 : case 3 : case 5: case 7: case 8: case 10: case 12:
			System.out.println("el mes : "+ mes + "es de 31");
			break;
		case 4 : case 6: case 9: case 11:			
			System.out.println("el mes : "+ mes + "es de 30");
			break;
		case 2:
			System.out.println("el mes : "+ mes + "es de 28/29");
			break;
			
			default :
				System.out.println("tas equivocado del 1 al 12 melon");
				
		}
		System.out.println("terminao");
	}
				
}			
			
		
	
		
//		int num = 3;
//		if (num == 4)
//		System.out.println("es 4");
//		System.out.println("algo mas de cuatro");
// 	    }else { if( num < 4)   
//		System.out.println("no es cuatro");		 
//		System.out.println"eso es todooo amigoooo"
//		}

		