package ejercicios;

public class ejercicio2 {

	public static void main(String[] args) {
		//declarar variables
		//obtener los datos de entrada
		//procesar los datos de entrada generando salida parcial
		//escribir estadisticas
		
    int lado1 = 0; int lado2 = 0 ;
    int perimetro = 0;
    int area = 0;
    double hipotenusa = 0;
    lado1 =7; lado2 = 4;
    perimetro = (lado1 + lado2) * 2;
    System.out.println("resultado esperado del perimetro 22 " + perimetro) ;
    area = lado1 * lado2;
    System.out.println("resultado esperado del area 28 " + area) ;
    hipotenusa  = Math.sqrt( lado1 * lado1 + lado2 * lado2);
    System.out.println("resultado esperado de la hipotenusa 8.algo " + hipotenusa) ;
    String prueba = String.valueOf(12);
    
    
    

	}

}
