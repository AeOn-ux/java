package j0128_01;

import java.util.ArrayList;

public class C04 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer(); // aaa, 1111, 홍길동, 10_000_000, 0
		System.out.println(b.userName+"님 환영합니다.");
		b.buy(new Tv());
		b.buy(new NoteBook());
		b.buy(new Audio());
		
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.println(p.name+","+p.price);
		}
		System.out.println("==========================");
		System.out.println("총 구매 개수 : "+b.list.size());
		System.out.println("보유금액 : "+b.money);
		System.out.println("보유포인트 : "+b.Point);
	}

}
