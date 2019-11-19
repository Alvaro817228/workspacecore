package bean;

public class Director {
	private String nombre;
	private String edad;
	public Director(String nombre, String edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Director() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}

}