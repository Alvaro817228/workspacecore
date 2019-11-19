package beans;
public class director extends Empleado{
	private int acciones ;
	public director(int idEmpleado, String nombre, String apellido, String sexo, double salario, int edad,
			double comision, Departamento departamento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellido, sexo, salario, edad, comision, departamento);
		this.acciones = acciones;
		this.tablet = tablet;
	}
	private String tablet ;
	public int getAcciones() {
		return acciones;
	}
	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	@Override
	public String toString() {
		return "director [acciones=" + acciones + ", tablet=" + tablet + "]";
	}
	@Override
	public double salarioMensual() {
		// TODO Auto-generated method stub
		return totalSalario () / MESES_NOMINA; 
	}
	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return salario + comision + acciones * VALOR_ACCION;
	}
	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return totalSalario () / meses;
	}
	
	
	}
	
	


