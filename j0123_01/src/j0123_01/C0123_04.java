package j0123_01;

public class C0123_04 {
	
	

	// 메소드 리턴이 없으면 void
	static void add(int a, int b) { // 클래스 메소드 - 객체선언 없이 클래스명.메소드명
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		int c = 5;
		
		// a, b를 보내서 평균값을 리턴해서 받아 출력
		Method m = new Method();
		double result = m.avg(a, b);
		System.out.println(result);
		
		// a, b, c를 보내서 합계를 리턴해서 출력
//		Method m2 = new Method();
		int result2 = m.total(a, b, c);
		System.out.println(result2);
		
		// input() 호출해서 출력하시오.
		m.input();
		
		//
		int result3 = m.input2();
		System.out.println("합계2 : "+result3);
		
		
		// 함수호출
		m.addSubMulti();
		// 1개의 리턴으로 여러값 받는 방법
		int[] result4 = m.addSubMulti2();
		for(int i=0;i<result4.length;i++) {
			System.out.println(result4[i]);
		}
		
		// 함수호출 - 매개변수 보내서 받기
		int[] score = new int[3];
		score = m.addSubMulti3(score);
		for(int i=0;i<score.length;i++) {
			System.out.println(score);
		
		
		}
		
//		C0123_04.add(a, b);
//		System.out.println(C0123_04.add(a, b));
		}
	}

	
