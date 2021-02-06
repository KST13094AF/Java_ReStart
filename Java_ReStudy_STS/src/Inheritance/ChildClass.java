package Inheritance;

public class ChildClass extends SuperClass {
	
	int a;
	
	public ChildClass(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ChildClass child = (ChildClass) new SuperClass("dd");
	}
}
