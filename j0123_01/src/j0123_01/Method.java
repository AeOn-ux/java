package j0123_01;

import java.util.Scanner;

public class Method {
	
	static Scanner scanner = new Scanner(System.in);

	// avg()
	double avg(int a, int b) {
//		scanner.next();
		
		double result = (a+b)/2.0;
		return result;
	}
	
	// total()
	int total(int a, int b, int c) {
		int result = (a+b+c);
		return result;
	}
	
	// input() 리턴 없이 2개의 값을 입력받아, 합을 출력하는 메소드
	void input() {
		System.out.println("숫자를 입력하세요.>>");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>>");
		int b = scanner.nextInt();
		int result = a+b;
		System.out.println("합계 : "+result);
	}
	
	
	// input2() 합의 값을 리턴해줌.
	int input2() {
		System.out.println("숫자를 입력하세요.>>");
		int a = scanner.nextInt();
		System.out.println("숫자2를 입력하세요.>>");
		int b = scanner.nextInt();
		int result3 = a+b;
		return result3;
	}
	
	
	// 함수호출
	// 1개의 리턴값으로 여러값 보내는 방법
	// 2개 숫자를 입력받아, 사칙연산 값을 리턴
	// 1개만 리턴 가능.
	
	// 첫번째로, 리턴없이 2개 숫자를 입력받아 사칙연산 값을 출력하는 메소드 구현
	void addSubMulti() {
		 System.out.println("숫자를 입력하세요.>>");
		 int a = scanner.nextInt();
		 System.out.println("숫자2를 입력하세요.>>");
		 int b = scanner.nextInt();
		 System.out.println("합 : "+(a+b)+", 차 : "+(a-b)+", 곱 : "+(a*b));
	}
	// 두번째로, 2개 숫자를 입력받아 사칙연산 값을 리턴(1개만)
	int[] addSubMulti2() {
		 int[] result = new int[3];
		 System.out.println("숫자를 입력하세요.>>");
		 int a = scanner.nextInt();
		 System.out.println("숫자2를 입력하세요.>>");
		 int b = scanner.nextInt();
//		 System.out.println("합2 : "+(a+b)+", 차2 : "+(a-b)+", 곱2 : "+(a*b));
		 result[0] = (a+b);
		 result[1] = (a-b);
		 result[2] = (a*b);
		 return result; // 리턴값은 1개만 
	}
	
	// 배열, 객체를 매개변수로 보낼시 리턴이 필요없음
	// 기본타입 8가지 -> 리턴을 받아야함.
	int[] addSubMulti3(int[] result) {
		 System.out.println("숫자를 입력하세요.>>");
		 int a = scanner.nextInt();
		 System.out.println("숫자2를 입력하세요.>>");
		 int b = scanner.nextInt();
		 result[0] = (a+b);
		 result[1] = (a-b);
		 result[2] = (a*b);
		 return result;
	}
	
	
	
	
	
	
	
	
}
