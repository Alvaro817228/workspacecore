package beans;

public class Departamento {

	private int idDepartamento;
	
	private String nombre;
	private Empleado jefe;

	public Departamento(int idDepartamento, String nombre, Empleado jefe) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.jefe = jefe;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	/**
	 * @param idDepartamento
	 * @param nombre
	 */
	public Departamento(int idDepartamento, String nombre) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public Departamento() {
		super();
	}

	/**
	 * @return the idDepartamento
	 */
	public int getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + "]";
	}

	
	
}
