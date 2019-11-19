package testbeans;

import beans.Departamento;
import beans.Empleado;

public class recursoshumanospart1 {
	public static Departamento findBYId (int id) {
		Departamento dep30 = new Departamento (30, "ventas", null);
		return dep30;
	}

 	public static void main(String[] args) {
 		Departamento dep1 = null;
 		dep1 =findBYId(30);
 		System.out.println(dep1);
		
	
		
		
		// TODO Auto-generated method stub
		Departamento dep30 = new Departamento (30, "ventas", null);
		Empleado emp114, emp115,emp116,emp300;
		emp300 = new Empleado(300,"natalia","vazquez","M",
				60000, 40,5500,dep30);
		emp114 = new Empleado(114, "diego","martienz","H",
				35000,45,2000,dep30);
		emp115= new Empleado(115,"sara","perez","M",
				2000,35,1000,dep30);
		emp116= new Empleado(116,"carlos","sanchez","H",
				18000,20,0,dep30);
		dep30.setJefe(emp114);
		
		Departamento dep120= new Departamento (120,"formacion",
				new Empleado(225,"carmen","gonzalez","M",70000,43,10000,dep30));
		dep120.getJefe().setDepartamento(dep120);
		Departamento dep130 = new Departamento(130, "logistica",emp300);
		emp300.setDepartamento(dep130);
		System.out.println("dep120 :"+ dep120.getJefe().getDepartamento().getNombre());
		System.out.println("dep130 :"+ dep130.getJefe().getDepartamento().getNombre());


				
		

	}

}
