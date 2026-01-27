package j0127_01;

public class Stuscore {

	// 초기화 블럭
	{
		count++;
		no = count; // 번호자동 부여
	}
	
	// 생성자 - 초기화메소드
	// 클래스명, 리턴 X, void X
	Stuscore(){} // 기본생성자
	// 매개변수가 있는 생성자
    Stuscore(String name, int kor, int eng, int math){
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	this.total = kor+eng+math; 
    }
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void calTotal(int kor, int eng, int math) {
		this.total = kor+eng+math;
	}
	void calAvg(int kor, int eng, int math) {
		this.avg = (kor+eng+math)/3;
	}
}
