package Modifider;

public class ModifierTest {
	// final 상수는 선언과 동시에 명시적초기화를 해야한다.
	final int index = 10;
	final int index2 = 20;
	
	public ModifierTest() {
		super();
	}
	// 생성자를 통해 상수 초기화가 가능하다 (this는 사용불가임)
	public ModifierTest(int index, int index2) {
		index = index;
		index2 = index2;
	}
}

final class Last{
	
}
// final 클래스는 상속할 수 없다. (확장이 불가능)
class First extends Last{
	
}

class MethodMain{
	// final 메소드는 오버라이딩이 불가능함.
	final void print() {
		System.out.println("Hellow world");
	}
}

class MethodExtends extends MethodMain{
	
}
