package com.core.javaps.testbeans;

import com.core.javaps.beans.Empleado;

import beans.departamento;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado(200," Eva", "Perez", "M",
				12000, 24, 1000, null);
		Departamento dep40 = new Departamento (40, "Formacion");
		Empleado emp2 = new Empleado(210, "sara","ruiz", 18000, 45, dep40);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
