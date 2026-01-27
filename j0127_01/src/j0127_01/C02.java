package j0127_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		
		loop:while(true) {
			s.stuPrint(); //화면출력부분
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				s.stuInput(); //학생성적입력부분
				break;
			case 2:
//				s.stuOutput();
				break;
			case 3:
//				s.stuUpdate();
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}

		
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore("홍길동",100,100,100);
//		System.out.println(s[0].no+","+s[0].name);
//			
//		s[1] = new Stuscore("유관순",100,100,100);
//		System.out.println(s[1].no+","+s[1].name);

	}

}
