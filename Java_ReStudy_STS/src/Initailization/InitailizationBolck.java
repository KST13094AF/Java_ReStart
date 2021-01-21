package Initailization;

public class InitailizationBolck extends SuperInitailizationBlock{
	int a;
	int b;
	
	//생성자 보다 인스턴스 초기화 블록이 먼저 실행된다.
	public InitailizationBolck() {
		super();
		//a++;
		//b++;
		System.out.println("-- 하위 클래스 호출 --");
	}
	
	// 스태틱 초기화 블
	static{
		System.out.println("-- 스태틱 초기화 블록 실행 --");
	}
	// 인스턴스 초기화 블
	{
		// 모든 생성자에 한번 수행해야 할 것이 있다면 초기화 블럭을 사용함으로 코드 간결화가 가능하다. = 인스턴스 초기화 블럭이 생성자보다 일찍 초기화 되기 때문
		a++;
		b++;
		System.out.println("-- 인스턴스 초기화 블록 실행 --");
	}
	
	public static void main(String[] args) {
		InitailizationBolck init = new InitailizationBolck();
	}
}

class SuperInitailizationBlock{
	public SuperInitailizationBlock() {
		System.out.println("-- 상위 클래스 호출 --");
	}
}
