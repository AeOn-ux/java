package j0123_01;

public class Stuscore {
	{ // 초기화 블록 시작: 객체(성적표)가 생성될 때마다 무조건 여기부터 실행
		this.no = count+1; // 현재 '전체 카운트'에 1을 더해서 이 성적표의 '번호'에 넣
		count++; // 다음 사람을 위해 전체 카운트 숫자를 1 올려둠
	}
	
	Stuscore(){}// 기본생성자 - 생성자가 없으면 자동생성이 됨.
	// 비어있는 성적표를 만들 때 사용하는 기본 생성자
	
	// 이름과 점수를 받아서 바로 채워넣는 생성자
	Stuscore(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	
	}
	
	// 나중에 점수만 따로 계산하고 싶을 때 쓰는 기능(메서드)
	void cal(int kor, int eng, int math) {
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	
	
	
	// --- 아래는 이 성적표 양식에 들어갈 '항목들'을 정의
	
	static int count = 0; // 클래스변수 = 객체선언 없이 클래스명.변수명
	// [공용 변수] 모든 성적표가 공유하는 '전체 학생 수' 카운터
	
	int no; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
}
