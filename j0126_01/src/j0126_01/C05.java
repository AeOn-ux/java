package j0126_01;

public class C05 {

	public static void main(String[] args) {
		// 1. 카드 52장이 들어있는 '카드 박스(Deck)'를 하나 새로 만든다
		Deck d = new Deck(); // 객체선언
		
		// 지정한 카드 1장뽑기
		// 2. 덱(d)에서 1번째 위치에 있는 카드를 꺼내 'c'라는 이름표를 붙인다
		Card c = d.pick(1); // 1-52
		// 3. 그 카드의 무늬(kind)와 숫자(number)를 출력
		System.out.println(c.kind+","+c.number);
		
		// 랜덤카드 1장뽑기
		// 4. (매개변수 없음) 덱에서 무작위로 한 장을 꺼내 'c2'에 담는다
		Card c2 = d.pick(); // 1-52
		System.out.println(c2.kind+","+c2.number);
		
		// 카드 5장 뽑기
		// 5. 카드 '5장'을 담을 수 있는 묶음(배열)을 통째로 가져온다
		Card[] cArr = d.pick5();
		for(int i=0;i<cArr.length;i++) {// 6. 5번 반복
			// 7. 5장의 정보를 하나씩 보여준다
			System.out.println(cArr[i].kind+","+cArr[i].number);
		}
		
		d.shuffle(); // 8. [중요] 카드 박스(d)를 마구 섞
		cArr = d.pick5();
		for(int i=0;i<cArr.length;i++) {
			// 9. 섞인 상태에서 다시 5장을 뽑는다
			System.out.println(cArr[i].kind+","+cArr[i].number);
		}
		
		System.out.println("-------------------------");
		//랜덤 카드 1장뽑기
		Card c3 = d.pick(2); // 1-52
		System.out.println(c3.kind+","+c3.number);
		
//		Card[] c = new Card[52];
//		c[0] = new Card();
//		c[0].kind = "SPADE";
//		c[0].number = 1;
//		c[1].kind = "SPADE";
//		c[1].number = 2;
//		c[2].kind = "SPADE";
//		c[2].number = 3;
//		c[13].kind = "HEART";
//		c[13].number = 1;		
//		c[14].kind = "HEART";
//		c[14].number = 2;		

		
		
		
	}

}