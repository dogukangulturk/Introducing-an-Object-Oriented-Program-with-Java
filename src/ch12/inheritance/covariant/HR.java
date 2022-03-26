package ch12.inheritance.covariant;

import ch12.factories.factory3.Employee;

public class HR {
	
	public Employee getAnEmployee(){
		return new Employee(1, "Ali", 8, "Production");
	}
}
