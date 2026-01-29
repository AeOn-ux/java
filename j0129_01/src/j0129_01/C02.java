package j0129_01;

public class C02 {

	public static void main(String[] args) {
		
		A a = new A();
		//업그레이드 완료
		I i = new B2(); // 다형성 - 부모의 참조변수로 자손의 객체를 다루는 것
		
		a.methodA(i);
		
		
		
		
		
		
//		A a = new A();
//		B b = new B();
//		a.methodA(b);
		

	}

}
