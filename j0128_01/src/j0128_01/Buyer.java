package j0128_01;

import java.util.ArrayList;

public class Buyer {

	String userName;
	String id;
	String pw;
	int money;
	int Point;
	ArrayList list = new ArrayList();
	
	Buyer(){
		id = "aaa";
		pw = "1111";
		userName = "홍길동";
		money = 10_000_000;
		Point = 0;
		
	}
	
	
	// 부모의 참조변수로 자손의 객체선언
	// Product p = new Tv();
	
	void buy(Product p) {
		money = money - p.price; // 구매 금액만큼 보유금액 차감
		Point += p.Point; 
		list.add(p);
	}
	
	
}
