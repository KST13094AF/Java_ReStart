package Polymorphism;

public class Banana extends Fruit {
	int num = 10;
	
	public Banana() {
		name="바나나";
		price=1000;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("이름: "+super.name);
		System.out.println("가격: "+super.price);
	}
}
