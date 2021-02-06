package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		Fruit f2 = new Banana();
		Fruit f3 = new Peach();
		
		f.show();
		
		if(f2 instanceof Fruit)
			f2.show();
		if(f3 instanceof Fruit)
			f3.show();
		
	}
}
