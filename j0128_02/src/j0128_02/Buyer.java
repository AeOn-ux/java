package j0128_02;

import java.util.ArrayList;

public class Buyer {
	
	String name;
	int money;
	int point;
	ArrayList list = new ArrayList();
	
	Buyer(){
		name = "홍길동";
		money = 10_000_000;
		point = 0;
	}
	
	void buy(Product p) {
		money = money - p.price;
		point += p.Point;
		list.add(p);
	}
	

}
