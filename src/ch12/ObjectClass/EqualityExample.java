package ch12.ObjectClass;

import ch12.ObjectClass.domain.Product;


public class EqualityExample {

	public static void main(String[] args) {

		Product p1 = new Product(11, "Kanepe", 171.09);
		Product p2 = new Product(11, "Kanepe", 171.09);

//		p1 = p2;
		
		System.out.print("Is p1 = p2: ");
		boolean b = p1 == p2;
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		System.out.print("\nIs p1 equals p2: ");
		
		b = p1.equals(p2);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		
		System.out.print("\nIs p2 equals p1: ");
		
		b = p2.equals(p1);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		System.out.println();
		
		System.out.println(p1);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
