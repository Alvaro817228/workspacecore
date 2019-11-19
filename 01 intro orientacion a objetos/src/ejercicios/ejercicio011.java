package ejercicios;

public class ejercicio011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena ="tomas;andres;esteban;sara;ignacio;mariel";
		
		int [] pares = {2,6,8,10,34,68};
		String [] nombres = {"andres", "esteban", "zacarias", "eva", "ana "};
//		System.out.println(pares.length);
//		System.out.println(nombres.length);
		pares [0]= 66;
		
		
		for (int i=0;i< pares.length; i++)
		System.out.println("en la posicion "+ i + "hay" + pares [i]);
		for (String ele : nombres) 
			System.out.println("me llamo : "+ ele);
	}
		
	
	
		
	}


