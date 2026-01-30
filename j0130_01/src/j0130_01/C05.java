package j0130_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 특정한 값만 입력을 받고자 할 때 enum 형태를 사용.
		Gender g = Gender.남성;
		
		Person p = new Person();
		p.g = Gender.남성; // g = "남성"
		
		
//		Day today = Day.FRI;
//		System.out.println(today);
		
//		while(true) {
//			System.out.println("요일을 입력하세요.>>");
//			String day = scan.next();
//			System.out.println("요일 : "+day);
//		}
		
		
		

	}

}
