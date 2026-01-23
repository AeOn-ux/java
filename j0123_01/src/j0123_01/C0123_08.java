package j0123_01;

import java.util.Scanner;

public class C0123_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력받는 기계(scanner)를 준비
		Stuscore[] s = new Stuscore[10]; // 학생 성적표 10장을 담을 수 있는 '바구니(배열)'를 만듦
		String name = ""; // 입력받을 이름을 임시로 저장할 변수
		int kor=0, eng=0, math=0; // 입력받을 점수들을 임시로 저장할 변수들
		int choice=0; // 메뉴 번호를 저장할 변수
		
		
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scanner.nextInt(); // 사용자가 입력한 번호(1 또는 2)를 choice에 넣
		switch(choice) { // 입력한 번호에 따라 갈림길을 만듦
		case 1:
			while(true) {
				System.out.println("이름을 입력하세요.(0.이전페이지 이동)>>");
				name = scanner.next();
				if(name.equals("0"))break; // 반복문 종료
				
				System.out.println("국어점수를 입력하세요.>>");
				kor = scanner.nextInt();
				System.out.println("영어점수를 입력하세요.>>");
				eng = scanner.nextInt();
				System.out.println("수학점수를 입력하세요.>>");
				math = scanner.nextInt();
//				s[0] = new Stuscore("홍길동",100,100,99);
				
				// [핵심] 입력받은 값으로 '진짜 성적표' 객체를 만들어서 바구니(s)에 넣음
				// Stuscore.count는 현재까지 몇 명이 저장되었는지 알고 있는 '공용 숫자'
				s[Stuscore.count] = new Stuscore(name, kor, eng, math);
				
				System.out.println();
				
				
				
			} // while 반복문 끝
			// 입력이 다 끝났으니, 이제까지 바구니에 담긴 성적표들을 하나씩 꺼내서 보여준다.
			for(int i=0;i<Stuscore.count;i++) {
				System.out.printf(
						"%d,%s,%d,%d,%d,%d,%.2f\n",
						s[i].no,s[i].name,s[i].kor,
						s[i].eng,s[i].math,s[i].total,
						s[i].avg);
			}
			
			break; // case 1 종료
		}
		
		System.out.println("[ 프로그램을 종료합니다. ]");
	}

}
