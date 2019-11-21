
public class Coche {
	public String matricula;
	public String marca;
	public String modelo;
	public boolean esNuevo;
	
	public Coche(String matricula, String marca, String modelo, boolean esNuevo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.esNuevo = esNuevo;
	}

	public Coche() {
		super();
		this.marca = "";
	}

	public Coche(String matricula) {
		this();//esto llama al constructor sin parametros
		this.matricula = matricula;
	}

	public Coche(String matricula, String marca) {
		this();
		this.matricula = matricula;
		this.marca = marca;
	}
	
	
}
