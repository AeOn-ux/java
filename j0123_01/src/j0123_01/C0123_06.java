package j0123_01;

public class C0123_06 {

	static int ii; // 클래스변수, 인스턴스 변수 자동초기화가 됨.
	public static void main(String[] args) {
		
	    int i; // 지역변수는 자동초기화가 안됨.
	    i = 0;
	    System.out.println();
		
		// Student 객체 선언
		Student s = new Student(1,"aaa","1111","홍길동","010-0000-0000","남자","골프,수영");
		// Student객체가 그대로 복사됨 => s와 s2의 값이 다른 형태로 인식됨 => 서로 정보를 바꿔도 영향을 주지않음
		Student s2 = new Student(s);
		Student s3 = s;
//		 s.name = "유관순";
		System.out.println(s.name); //홍길동 -> 유관순
		System.out.println(s2.name); //홍길동 
		System.out.println(s3.name); //홍길동 -> 유관순
		
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = 100+100+100;
//		s1.avg = (100+100+100)/3.0;
		
//		Stuscore s1 = new Stuscore(1, "홍길동",100,100,100);
//		Stuscore s2 = new Stuscore(2, "유관순",100,100,99);
		
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore(1, "홍길동",100,100,100);
//		s[1] = new Stuscore(2, "유관순",100,100,99);
//		s[2] = new Stuscore(3, "이순신",100,100,99);
//		for(int i=0;i<3;i++) {
//			
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//					s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,
//					s[i].total,s[i].avg);
//		};
//		
		// no = 1 출력하시오.
		// 객체선언
//		Stuscore s = new Stuscore();
//		Student st = new Student(1);
		
//		//Car -> White, auto, 5
//		Car c = new Car();
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 5;
//		System.out.printf("%s,%s,%d\n", c.color,c.gearType,c.door);
//		
//		// red, stick, 4  
//		Car c2 = new Car("red","stick",4);
//		System.out.printf("%s,%s,%d\n", c2.color,c2.gearType,c2.door);
//		
//		// green, auto, 5
//		Car c3 = new Car();
//		c3.color = "green";
//		c3.gearType = "auto";
//		c3.door = 5;
//		System.out.printf("%s,%s,%d\n", c3.color,c3.gearType,c3.door);
//		
//		// gray, stick. 3
//		Car c4 = new Car("gray","stick",3);
//		System.out.printf("%s,%s,%d\n", c4.color,c4.gearType,c4.door);
//		
//		// blue, auto, 6
//		Car c5 = new Car();
//		c5.color = "blue";
//		c5.gearType = "auto";
//		c5.door = 6;
//		System.out.printf("%s,%s,%d", c5.color,c5.gearType,c5.door);
		
	}

}
