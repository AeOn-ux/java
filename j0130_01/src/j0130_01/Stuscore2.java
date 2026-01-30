package j0130_01;

public class Stuscore2 {
	
	{
		count++;
		no = count;
	}
	
	Stuscore2(){} // 생성자
	Stuscore2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	// Object 클래스 메소드임.
	// 오버라이딩해서 각 객체에 맞게 변경함.
	@Override 
	public boolean equals(Object obj) {
		Stuscore2 s = (Stuscore2)obj;
		if(this.name.equals(s.getName())){
			return true;
		}
		return false;
	}
	
	
	
//	@Override
//	public String toString() {
//		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f",
//				this.no,this.name,this.kor,this.eng,
//				this.math,this.total,this.avg);
//		
//	}
	
	// System.out.printf = String.format : 사용법 같음
	
	static int count;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	void calTotal(int kor, int eng, int math) {
		this.total = kor+eng+math;
	}
	
	void calAvg(int kor, int eng, int math) {
		this.avg = (kor+eng+math)/3.0;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
//	public void setTotal(int total) {
//		this.total = total;
//	}
	public double getAvg() {
		return avg;
	}
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
//	

}
