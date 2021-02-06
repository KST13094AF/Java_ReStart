package Polymorphism;

public class Fruit {
	String name;
	int price;
	
	Fruit(){
		name="fruit";
		price=100;
	}
	
	public void show() {
		System.out.println("이름: "+name);
		System.out.println("가격: "+price);
	}
}
