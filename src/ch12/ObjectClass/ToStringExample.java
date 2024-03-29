package ch12.ObjectClass;

import ch12.ObjectClass.domain.Car;

public class ToStringExample extends Object{

	public static void main(String[] args) {

		Car c1 = new Car("Mercedes", "CLK200", "2018", 200, 4190);
		
		System.out.format("%-25s: %50s\n", "c1", c1);
//		System.out.format("%-25s: %50s\n", "c1.toString()", c1.toString());
		System.out.format("%-25s: %-50d\n", "c1.hashCode()", c1.hashCode());
		System.out.format("%-25s: %-50s\n", "c1.getClass().getName()", c1.getClass().getName());
		System.out.format("c1.getClass().getName() + '@' + Integer.toHexString(c1.hashCode()):\n" + c1.getClass().getName() + '@' + Integer.toHexString(c1.hashCode()));
//
		System.out.println("\n");
		
		Car c2 = new Car("BMW", "3.20", "2016", 0, 4190);
		System.out.format("%-25s: %50s\n", "c2", c2);
		System.out.format("%-25s: %50s\n", "c2.toString()", c2.toString());
//		System.out.format("%-25s: %-50d\n", "c2.hashCode()", c2.hashCode());
	}
}
