package j0128_02;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// 학생 성적 프로그램
		// 입력, 출력, 삭제
		
		
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck(); // 생성자
		
		loop:while(true) { // 반복문
			s.screen_print(); //출력화면
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 학생성적입력
				
				break;
			case 2: // 학생성적출력
							
				break;
			case 3: // 학생성적수정
				
				break;
			case 4: // 학생성적삭제
				
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
