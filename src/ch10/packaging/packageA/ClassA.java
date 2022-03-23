package ch10.packaging.packageA;

public class ClassA {

//	ClassX x1; // Error!
	ch10.packaging.packageX.ClassX x;
	
	public ClassA(ch10.packaging.packageX.ClassX x) {
		this.x = x;
	}
}
