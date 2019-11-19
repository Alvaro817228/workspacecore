package testbeans;
import beans.Empleado;

public class textEmpleado {

	
	public static void main(String[] args) {
		Empleado emp1,emp2,emp3;
		
		emp1 = new Empleado (113, "alvaro", "ferrero", "H", 35 , 55000);
		emp2 = new Empleado (114, "eva" , "perez", "M", 36 ,56000); 
		
		emp3 = new Empleado (115, "sara", "hernandez", "M", 37 , 57000);
		
		emp1.setIdEmpleado(114);
		emp1.setNombre("rafael");
		emp1.setApellidos("delgado");
		emp1.setEdad(56);
		emp1.setSalario(345000);
		emp1.setSexo("H");
		System.out.println(emp1.getSalario());
		System.out.println(emp2.getNombre().toUpperCase());
		System.out.println(emp3.getApellidos().toUpperCase());
		
		

	}

	}

