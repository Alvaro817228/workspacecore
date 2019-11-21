package empleados;

import java.util.ArrayList;

public class MainEmpresa {
	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		Empleado e = new Empleado();
		e.setDni("45677777");
		e.setNombre("Asterix");
		e.setSalarioBase(600);
		
		Empleado e2 = new Empleado();
		e2.setDni("093737373");
		e2.setNombre("Obelix");
		e2.setSalarioBase(800);
		
		Empleado e3 = new Empleado();
		e3.setDni("454555555");
		e3.setNombre("Panoramix");
		e3.setSalarioBase(1200);
		
		JefeProyecto jp1 = new JefeProyecto();
		jp1.setDni("343434344");
		jp1.setNombre("Abraracurcix");
		jp1.setSalarioBase(2000);
		jp1.setBonificaciones(300);
		
		JefeProyecto jp2 = new JefeProyecto();
		jp2.setDni("343434334");
		jp2.setNombre("Aceranceturix");
		jp2.setSalarioBase(2500);
		jp2.setBonificaciones(400);
		
		Director d1 = new Director();
		d1.setDni("939489384");
		d1.setNombre("Gargamel");
		d1.setSalarioBase(3000);
		
		ArrayList<Empleado> empleadosDirector = new ArrayList<Empleado>();
		d1.setListaEmpleados(empleadosDirector);
		empleadosDirector.add(e2);
		empleadosDirector.add(jp2);
		empleadosDirector.add(e);

		listaEmpleados.add(e);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(jp1);
		listaEmpleados.add(jp2);
		listaEmpleados.add(d1);
		
		for(Empleado e1 : listaEmpleados) {
			System.out.println(e1.calcularSalario());
		}
		
	}
}


