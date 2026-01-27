package j0127_01; // 패키지 - 없으면 에러, 없으면 자동으로 부여(컴파일시 자동 부여)

// Object 상속 자동으로 부여(컴파일시)
// Object는 모든 클래스의 조상
public class C05 extends Object{

	// 기본생성자 - 없으면 에러, 없으면 자동으로 부여(컴파일시)
	C05(){
		super(); // 조상의 생성자 호출 - 없으면 에러, 없으면 자동으로 부여(컴파일시)
	} 
	
	
	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		s1.no = 1;
		s1.name = "홍길동";
		
		Stuscore s = new Stuscore("홍길동",100,100,99);

	}

}
