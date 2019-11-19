package ejercicios;

public class ejercicio02chungo {
	
	  /*2.	En recursos humanos van a aplicar una política de aumento de sueldo, con arreglo a la siguiente regla. Solicitamos por consola el sueldo y la comisión(ambos numéricos) y:

a.	Si la comisión es cero, nos fijamos en el sueldo y
	o	Sueldo  menor de 15000, aplicamos un 10% de subida
	o	Sueldo entre 15001 y 30000 aplicamos un 8% subida
	o	Sueldo entre 30001 y 45000 aplicamos un 4% subida
	o	Por encima de 45000, no hay subida
b.	Si la comisión es > 0, nos fijamos en la comisión y
	o	Si es menor de 2000 aumentamos el sueldo un 12%
	o	Si está comprendido entre 2001 y 10000 aumentamos el sueldo un 6%
	o	Si es mayor no le aumentamos nada.
c.	Informamos al final de
	o	Cuanto ganaba al principio,
	o	qué % de subida le corresponde
	o	cuanto supone el aumento (cero si no es nada)
	o	En cuanto se le queda el sueldo.

	 */
	
	
	
	
		static double comision, salario, aumento, subida;/* declaro aqui las variables como estaticas, en la clase para que la vea los metodos estaticos
*/

	public static void main(String[] args) {
		
		
		salario = 15000;
		aumento = 5;
		comision = 2;
		
		
		if (comision == 0) {
			verSalario ();
		
						
		} else {
			verComision ();
			
			}
			System.out.println("el salario era:"+ salario);
			System.out.println("\tla subida es :" + subida + "%");
			System.out.println("\tel aumento es :" + aumento);
			System.out.println("preguntar por el salario");
		}//metodo main ( principal)
	//-------------------------------------------------------------
/*creo deos metodos ( como funciones ) que usan las vasriablesw estaticas del la clase( por eso no llevan parametros . ya tienen acceso a los datos.
 * Anido bucles para optimizar , si fueran secuenciales deberia recorrer todas las opciones en lugar de encaminarlas.
 *
 */
//-------------------------------------------------------
	private static void verSalario () {
		if (salario >=15000) {
			System.out.println("aumento del 10%");
		}
		else { 
			if(salario > 30000 && salario < 45000){
			
				System.out.println("aumento del 4%");
			}
			else { 
				System.out.println("sin aumento");
			}
		}
	}	//salida metodo verSalario	

//--------------------------------------------------------
		

	private static void verComision(){
		if (comision < 20000) {
			System.out.println("aumento del 12%");
		}
		else {
			if (comision >=2000 && comision < 10000) {
			
				System.out.println("aumento del 6%");
			}
			else {
				System.out.println("te jorobas no aumento");
			}


		}

	}	//salida metodo ver comision
	
	
	
}	// salida clase