package ejercicios;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((int)(Math.random()*50 + 1));
		int numero = 0;
		int sumar = 0;
		int pares = 0;
		int impares = 0;
		double media = 0;
		for (int i=1 ; i<=10; i++) {
			numero=(int)(Math.random()*50 + 1) ;
			System.out.println("saca el numero"+ numero);
			sumar = sumar + numero;
			if (numero %2 ==0)
				pares ++;
			else
				impares++;
		}
		media = (double) sumar/ 10;
		System.out.println("la media :"+ media+ "la suma es :"+ sumar +"los pares:"+ pares +"los impares :"+ impares);
	}

}
