package ejercicios;

public class ejercicio01 {

	public static void main(String[] args) {
		String nombre = "tomasin";
		System.out.println(nombre.toUpperCase ());
		System.out.println(String.valueOf(1234).substring(2, 4));
		
		double num1=5.20;int num2=15;double resultado = 0;int resul = 0;
	
		//simulamos que los leemos
	    num1=5.20;
		num2=15;
		
		//proceso
			
	
		//System.out.println("la suma es:"+(num1 + num2));
		//System.out.println("la suma es :" + resultado);
		//System.out.println("la resta es:"+(num1 - num2));
		//System.out.println("el producto es:"+ (num1 * num2));
		//System.out.println("la division es:"+(num1 / num2));
		//System.out.println("el resto de la divison es:"+ (num1 % num2));
		resultado=num1 % num1;
		resul = (int) num1 * num2;
		System.out.println("tras castin 1 :"+ resul);		
		resul = (int)( num1 * num2);		
		System.out.println("tras castin 2 :"+ resul);


	}

}
