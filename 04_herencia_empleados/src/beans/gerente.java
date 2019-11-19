package beans;
public class gerente extends Empleado{
	private int plazadegaraje;
	private String movil;
	private double variable;
	public int getPlazadegaraje() {
		return plazadegaraje;
	}
	public void setPlazadegaraje(int plazadegaraje) {
		this.plazadegaraje = plazadegaraje;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public double getVariable() {
		return variable;
	}
	public void setVariable(double variable) {
		this.variable = variable;
	}
	public gerente(int idEmpleado, String nombre, String apellido, String sexo, double salario, int edad,
			double comision, Departamento departamento, int plazadegaraje, String movil, double variable) {
		super(idEmpleado, nombre, apellido, sexo, salario, edad, comision, departamento);
		this.plazadegaraje = plazadegaraje;
		this.movil = movil;
		this.variable = variable;
	}
	@Override
	public String toString() {
		if (departamento == null)
		return "gerente [getPlazadegaraje()=" + getPlazadegaraje() + ", getMovil()=" + getMovil() + ", getVariable()="
				+ getVariable() + ", getIdEmpleado()=" + getIdEmpleado() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getSexo()=" + getSexo() + ", getSalario()=" + getSalario()
				+ ", getEdad()=" + getEdad() + ", getComision()=" + getComision() + ", getDepartamento()="
				+ getDepartamento() + ", toString()=" + super.toString() + ", nombreCompleto()=" + nombreCompleto()
				+ ", salarioMensual()=" + salarioMensual() + ", plazadegaraje=" + plazadegaraje + ", movil=" + movil
				+ ", variable=" + variable + "]";
		else
			return "gerente [getPlazadegaraje()=" + getPlazadegaraje() + ", getMovil()=" + getMovil() + ", getVariable()="
			+ getVariable() + ", getIdEmpleado()=" + getIdEmpleado() + ", getNombre()=" + getNombre()
			+ ", getApellido()=" + getApellido() + ", getSexo()=" + getSexo() + ", getSalario()=" + getSalario()
			+ ", getEdad()=" + getEdad() + ", getComision()=" + getComision() + ", getDepartamento()="
			+ getDepartamento().getIdDepartamento() + ", toString()=" + super.toString() + ", nombreCompleto()=" + nombreCompleto()
			+ ", salarioMensual()=" + salarioMensual() + ", plazadegaraje=" + plazadegaraje + ", movil=" + movil
			+ ", variable=" + variable + "]";
	}
	
	
	}
	
	
	
	

	


