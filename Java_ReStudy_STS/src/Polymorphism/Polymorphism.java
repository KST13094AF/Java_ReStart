package Polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		Car c = null;
		FireCar fc = new FireCar();
		FireCar fc2 = null;
		
		Car c2 = null;
		WireCar wc = null;
		WireCar wc2 = null;
		
		// 형변환 
		c = fc; //업캐스팅은 형변환 생략
		fc2 = (FireCar)c; //다운캐스팅 형변환 생략 불가 
		
		// 차이: 참조변수 c는 FireCar의 모든 인스턴스에 접근할 수 없다. 조상 -> 자손
		// 하지만 fc2는 FireCar fc와 같은 형태임으로 모든 인스턴스 변수에 접근할 수 있다.
		c.print();
		fc2.print();
		
		
	}
}

class Car {
	public void print() {
		System.out.println("Car");
	}
}

class FireCar extends Car{
	@Override
	public void print() {
		System.out.println("FireCar");
	}
}

class WireCar extends Car{
	@Override
	public void print() {
		System.out.println("WireCar");
	}
}