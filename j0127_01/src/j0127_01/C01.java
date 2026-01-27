package j0127_01;

import java.util.*;

public class C01 extends Object{
	C01(){}
	
	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한묶음
	
		d.cardAllPrint(); // 순차출력
		d.shuffle();
		System.out.println("--------------");
		d.cardAllPrint(); // 랜덤섞기 후 출력
//		d.cardAllPrint();
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		Date today = new Date();
//		System.out.println(today);
		
//		Circle c1 = new Circle(); // 기본생성자
//		System.out.println(c1.color);
		
		
	}

}
