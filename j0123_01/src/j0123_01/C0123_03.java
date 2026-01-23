package j0123_01;

public class C0123_03 {
	// 클래스 변수, 인스턴스 변수, 지역변수-메소드내선언
	// 클래스 메소드 - 객체선언 없이 클래스명.메소드명
	// 인스턴스 메소드 - 객체선언 후 참조변수명.메소드명
	
	int add(int a, int b) { // 인스턴스 메소드
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	double divibe(int a, int b) {
		return (double)a/b;
	}
	
	// sub(-), multi(*), divibe(/)
	
	public static void main(String[] args) {
		// 객체 선언 후 사용
		C0123_03 c = new C0123_03();
		int a = 10;
		int b = 3;
		int result = c.add(10,3);
		System.out.println(result);
		
		result = c.sub(10, 3);
		System.out.println(result);
		
		int result2 = c.multi(a, b);
		System.out.println(result2);
		
		double result3 = c.divibe(10, 3);
		System.out.println(result3);
		
		
		
		
	}

	
	
}
