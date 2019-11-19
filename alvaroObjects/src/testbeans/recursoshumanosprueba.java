package testbeans;

import beans.Departamento;
import beans.Empleado;

public class recursoshumanosprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento dep15 = new Departamento(15," camarero",null);
		Empleado emp1,emp2,emp3;
		emp1 = new Empleado(100, "Alvaro", "Ferrero", "H",
				30000,36, 1000, dep15);
		emp2 = new Empleado(200, "Belen", "gordi", "M",
				20000,48, 500, dep15);
		emp3 = new Empleado(300, "lilian", "doby", "M",
				10000,32, 250, dep15);
		dep15.setJefe(emp1);
		System.out.println("jefe : " + dep15.getJefe());
		System.out.println("gordi vaga :"+emp2);
		System.out.println("doby : " + emp3);

	}

}
