package j0127_01;

public class C09 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("회원명 : "+b.name);
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보유 포인트 : "+b.bonusPoint);
		
		System.out.println("1. 삼성TV");
		System.out.println("2. 그램노트북");
		System.out.println("3. 하만오디오");
		
		// 삼성TV
		b.buy(new  PTv());
		b.buy(new  NoteBook());
		b.buy(new  Audio());
		b.buy(new  PTv());
		
		System.out.println("-----------------");
		System.out.print("구매 리스트 : ");
		for(int i=0;i<b.count;i++) {
			System.out.println(b.cart[i].name+" ");
		}
		System.out.println();
		
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보유 포인트 : "+b.bonusPoint);
		
		
	}

}
