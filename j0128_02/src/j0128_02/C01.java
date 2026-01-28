package j0128_02;

public class C01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new NoteBook());
		b.buy(new Phone());
		
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.println(p.name+","+p.price);
			
		}
		System.out.println("------------------");
		System.out.println("구매 개수 : "+b.list.size());
		System.out.println("보유금액 : "+b.money);
		System.out.println("보유포인트 : "+b.point);
		
		
		
		
		
		
	}

}
