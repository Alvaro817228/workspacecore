
//las clases en java son moldes para la creacion de objetos, son planos
//en los que java se va a basar para la creacion de los objetos
public class Persona {
	//una clase java ( en cualquier lenguaje) tiene
	//atributos y tiene metodos.
	//los atributos en java se suelen poner dentro de la clase
	//y al principio de ella
	public String nombre;
	public double peso;
	public int edad;
	
	//este es el constructor por defecto
	//se llaman igual que la clase
	public Persona() {
		
	}

	public Persona(String nombre, double peso, int edad) {
		super();//Java existe la herencia y esto esta invocando al padre de este objeto
		this.nombre = nombre;//this es una referencia al propio objeto
		this.peso = peso;
		this.edad = edad;
	}

	
	
	//pero podemos tener todos los constructores que queramos
	/*
	public Persona(String nombre1, double peso1, int edad1) {
		nombre = nombre1;
		peso = peso1;
		edad = edad1;
	}*/
	
	
}
