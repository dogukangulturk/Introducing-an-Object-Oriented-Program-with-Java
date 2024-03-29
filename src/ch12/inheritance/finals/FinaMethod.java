package ch12.inheritance.finals;


public class FinaMethod{

	public static void main(String[] args) {
		Parent parent = new Parent();
//		parent.f();
		parent.g();

		Child child = new Child();
//		child.f();
		child.g();
	}
}

class Parent{
	
	public final void f() {
		System.out.println("f() in Parent");
	}
	
	public static final void sf() {
		System.out.println("sf() in Parent");
	}

	public void g() {
		System.out.println("g() in Parent");
	}
}

class Child extends Parent {

//	 public final void f() {
//		 System.out.println("f() in Child");
//	 }
	
//	public static final void sf() {
//		System.out.println("sf() in Parent");
//	}

	@Override
	public void g() {
		String s;
		System.out.println("g() in Child");
	}
}

class ChildOfChild extends Child {
	
	@Override
	public final void g() {
		String s;
		System.out.println("g() in ChildOfChild");
	}
}

class ChildOfChildOfChild extends ChildOfChild {
	
//	@Override
//	public final void g() {
//		String s;
//		System.out.println("g() in ChildOfChildOfChild");
//	}
}
