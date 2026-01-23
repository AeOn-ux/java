package j0123_01;

import java.util.Arrays;

public class C0123_05 {
	long a, b; // 인스턴스 변수
	static int aa; // 클래스 변수
	
	long add() { // 오버로딩 - 메소드명은 동일 - 매개변수 개수 또는 타입 다름
		return a+b;
	}// 인스턴스 메서드

	// 오버로딩
	static long add(long a, long b) {
		return a+b;
	}// 클래스 메서드
	
	static long add(long a, long b, long c) { //오버로딩
		return a-b-c;
	}
	
	public static void main(String[] args) {
		int aa=0; // 지역 변수
		// long a=0; 같은 메소드 내에서 같은 이름의 변수를 선언할 수 없다.
		int[] num = new int[3];
		AMethod a = new AMethod();
		a.input(num);
		System.out.println(Arrays.toString(num));

	}

}
