package j0129_01;

public class C01 {

	
	static int a; // 클래스 변수 - 자동 초기화
	// 클래스 변수 : 객체선언 없이 클래스명.변수명
	int b;        // 인스턴스 변수 - 자동 초기화
	// 인스턴스 변수 : 객체선언 후 참조변수명.변수명

	public static void main(String[] args) {

		int c = 0; // 지역변수 - 자동초기화 안됨.
		System.out.println(c);
		
		
		C01 c01 = new C01();
		System.out.println(c01.b);
	
		System.out.println(C01.a);
		System.out.println(a); 
		// 클래스 변수 : 같은 클래스 내에서 호출시 클래스명 생략 가능
		
		
	}

}
