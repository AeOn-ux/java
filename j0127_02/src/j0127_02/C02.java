package j0127_02;

import j0127_02.Audio;
import j0127_02.NoteBook;
import j0127_02.Tv;

public class C02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("회원명 : "+b.name);
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보유 포인트 : "+b.Point);

		System.out.println("1. 삼성 TV");
		System.out.println("2. 그램 노트북");
		System.out.println("3. 하만 오디오");
		System.out.println("4. Iphone 17 Pro");
		
		
		b.buy(new  Tv());
		b.buy(new  Phone());
		b.buy(new  Audio());
		b.buy(new  NoteBook());
		b.buy(new  Audio());
		b.buy(new  NoteBook());
		b.buy(new  Tv());
		
		System.out.println("-----------------");
		System.out.print("구매물품 : ");
		for(int i=0;i<b.count;i++) {
			Product p = (Product)b.list.get(i);
			System.out.println(p.name+" ");
		}
		System.out.println();
		
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보유 포인트 : "+b.Point);
		
		
		
	}

}
