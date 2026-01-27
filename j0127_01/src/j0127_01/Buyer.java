package j0127_01;

public class Buyer {
	String name = "홍길동";
	int money = 1000;
	int bonusPoint = 0;
	
	// 배열 10개 선언
	int count = 0;
	Product[] cart = new Product[10];
	
	// 다형성
	void buy(Product p) {
		cart[count] = p; // 구매물품저장
		count++;
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매 되었습니다.");
	}
	
}
