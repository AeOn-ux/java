package j0130_01;

import java.util.Scanner;


public class StuMain2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StuDeck2 s = new StuDeck2(); // 생성자
		
		loop:while(true) { // 반복문
			s.screen_print(); //출력화면
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 학생성적입력
				s.stuInput();
				break;
			case 2: // 학생성적출력
				s.stuOutput();			
				break;
			case 3: // 학생성적수정
				
				break;
			case 4: // 학생성적삭제
				s.stuDelete();
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			
			}

		}
	}

}
