package testbeans;
import beans.Empleado;

public class testEmpleado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Empleado emp1 = new Empleado (113, "alvaro", "ferrero", "H", 35 , 55000);
	System.out.println("mi salario  anterior :" + emp1.getSalario());
	System.out.println(emp1.aumentarSalario(1000));
	System.out.println("mi salario actual : " + emp1.nombreCompleto() +
			" "  + emp1.getSalario());
	}

}
