package Inheritance;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	int index = 12;
	
	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
