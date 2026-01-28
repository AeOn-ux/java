package j0128_02;

import java.util.ArrayList;
import java.util.Scanner;

import j0128_01.Stuscore;

public class StuDeck {
	
	StuDeck(){
		list.add(new Stuscore("홍길동",100,100,100));
		list.add(new Stuscore("유관순",100,100,100));
		list.add(new Stuscore("이순신",100,100,100));
	}
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	int no, kor, eng, math, total;
	String name;
	double avg;
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 메뉴 미리보기 출력
	void screen_print() {
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 성적 검색");
		System.out.println("0. 프로그램 종료");
		System.out.println("=======================");
		System.out.println("원하는 번호를 입력하세요.>>");
	}
	
	
	
	// 학생성적입력
		void stuInput() {
			System.out.println((Stuscore.count+1)+"번 학생 이름을 입력하세요.>>");
			name = scan.next();
			if(name.equals("0")) return;
			System.out.println("국어 점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.>>");
			math = scan.nextInt();
			
			list.add(new Stuscore(name,kor,eng,math)); //list추가
			System.out.println("======================");
			System.out.println("학 생성적이 추가되었습니다!");
			System.out.println();
		}//stuInput
		
		// 학생성적출력
		void stuOutput() {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					title[0],title[1],title[2],title[3],
					title[4],title[5],title[6]);
			System.out.println("--------------------------------------------------------");
			for(int i=0;i<list.size();i++) {
				Stuscore s = (Stuscore)list.get(i);
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						s.getNo(), s.getName(), s.getKor(), s.getEng(),
						s.getMath(), s.getTotal(), s.getAvg());
			}	
		}// 학생성적출력
		
		void stuDelete() {
			int temp = 0; //검색확인변수
			System.out.println("삭제하려는 학생 이름을 입력하세요.>>");
			name = scan.next();
			for(int i=0;i<list.size();i++) {
				Stuscore s = (Stuscore)list.get(i);
				if(s.getName().equals(name)) {
					temp = 1; // 학생이 선택되었을때 1로 변경
					System.out.println(name+" 학생을 찾았습니다. 삭제하시겠습니까?(1.예, 2.아니오)");
					int choice = scan.nextInt();
					if(choice == 1) {
						//삭제코드
						list.remove(i); //삭제명령어
						System.out.println(name+" 학생이 삭제되었습니다.");
						System.out.println();
					}else {
						System.out.println("삭제를 취소하셨습니다.");
						System.out.println();
					}
				}
			}
			
			if(temp==0) {
				System.out.println("삭제하려는 학생이 없습니다. 다시 입력하세요!");
				System.out.println();
			}
			
		}
	
	
	
	
	

}
