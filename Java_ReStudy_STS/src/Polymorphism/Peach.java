package Polymorphism;

public class Peach extends Fruit {
	String type="물렁";
	
	Peach(){
		name="복숭아";
		price=3000;
	}
	public void show() {
		super.show();
		System.out.println("이름: "+super.name);
		System.out.println("가격: "+super.price);
	}
}
