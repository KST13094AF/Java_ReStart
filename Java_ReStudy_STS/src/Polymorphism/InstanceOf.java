package Polymorphism;

public class InstanceOf {
	
	public static void main(String[] args) {
		Car c = null;
		FireCar fc = null;
		
		if(c instanceof FireCar) {
			c = fc;
			System.out.println("Up-Cast");
		}else {
			System.out.println("Fail");
		}
	}
	
}
