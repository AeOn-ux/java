package j0126_03;

public class C01 {

	public static void main(String[] args) {
		// 카드클래스 정의
		// Deck 클래스 정의
		// 메인에서 Deck 객체선언 후
		// 5개 카드 출력
		// 섞기 한 후
		// 5개 카드 출력
		
		// 1. Deck 생성
		Deck d = new Deck();
		
		// 2. 5장 출력
		System.out.println("- 기본 5장 출력 -");
		Card[] cArr1 = d.pick5(14);
		for (int i=0;i<5;i++) {
			System.out.println(cArr1[i]); // SPADE1,2,3,4,5
			
		}
		System.out.println("--------------------");
		
		// 섞기
		d.shuffle();
		
		// 랜덤 5장
		System.out.println("- 랜덤 5장 출력 -");
		Card[] cArr2 = d.pick5();
		for (int i=0;i<5;i++) {
			System.out.println(cArr2[i]);
		}
		
	}

}
