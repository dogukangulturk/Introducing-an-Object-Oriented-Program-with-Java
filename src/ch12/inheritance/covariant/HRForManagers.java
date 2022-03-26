package org.javaturk.oopj.ch12.inheritance.covariant;

import ch12.factories.factory3.Manager;
import ch12.factories.factory3.Employee;


public class HRForManagers extends HR{
	
	public Manager getAnEmployee(){  // Covariant return type
		return new Manager(2, "Fatma", 3, "Production", "Production");
	}
}
