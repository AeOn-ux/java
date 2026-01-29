package j0129_01; // 패키지 - 없으면 에러, 없으면 자동생성

public class TryClass extends Object { // 없으면 자동생성(Object)-11개 메소드
	
	// 기본생성자 - 없으면 에러, 없으면 자동 생성
	TryClass(){
		super(); // 자동 생성 - 부모 생성자 호출
	}
	
	
	// equals(), toString(), hashCode()...11개 메소드 존재함.
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	void method() throws Exception {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		System.out.println(5);
		
	}

}
