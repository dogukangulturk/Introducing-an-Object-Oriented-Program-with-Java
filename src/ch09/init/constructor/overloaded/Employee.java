package ch09.init.constructor.overloaded;

import java.util.Date;

public class Employee {

	int id;
	String firstName;
	String lastName;
	//Date birthDate;
	float salary;
	String department = "No department yet!";

	public Employee(int newId, String newFirstName, String newLastName, float newSalary,
					String newDepartment) {
//		id = newId;
//		firstName = newFirstName;
//		lastName = newLastName;
//		birthDate = newBirthDate;
//		salary = newSalary;
		this(newId, newFirstName, newLastName, newSalary);
		department = newDepartment;
		System.out.println("2");
	}

	public Employee(int newId, String newFirstName, String newLastName, float newSalary) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		salary = newSalary;
		System.out.println("1");
	}

	void getInfo(){
		System.out.println(id + " " + " " + firstName + " " + lastName + " " +  " " + salary + " " + department);
	}

	public static void main(String[] args) {
		Employee a = new Employee(3,"Dogukan", "Gulturk",  3500f, "Yazilim");
		a.getInfo();
	}
}