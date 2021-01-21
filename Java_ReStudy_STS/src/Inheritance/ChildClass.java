package Inheritance;

public class ChildClass extends SuperClass {
	
	String name = "child Name";
	
	public ChildClass(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass("super Name");
		
		System.out.println(child.name);
	}
}
