package j0127_01;

public class Card {
	static final int KIND_NUM = 4; //kind의 종류는 4개
    String kind;
	int number;
	String[] num = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

	
	Card(){
		super();
	}
	Card(String kind, int number){
		super();
		this.kind = kind;
		this.number = number;
	}
	@Override // Object클래스에 있는 11개 메소드 중에 1개
	public String toString() {
		return String.format("[%s,%s]", kind, num[number]);
	}
}
