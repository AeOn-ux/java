package j0126_03;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	// 생성자
	Deck(){
		for (int i=0;i<52;i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1; //0-12이기 때문에 +1 -> 1-13
		}
	}
	
	// 섞기
	void shuffle() {
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	
	// 뽑기
	Card[] pick5() {
		Card[] hand = new Card[5]; 
		for (int i=0;i<5;i++) {
			hand[i] = c[i];
		}
		return hand;
	}
	
	// 지정 번호 뽑기
	Card[] pick5(int index) {
		Card[] hand = new Card[5]; 
		int j = 0;
		for (int i=index;i<(5+index);i++) {
			hand[j] = c[i]; //14
			j++;
		}
		return hand;
	}
}
