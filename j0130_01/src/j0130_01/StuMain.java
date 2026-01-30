package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true){
		    s.screen(); // 화면 출력
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				s.stu_input();
				break;
			
			case 2:
				s.stu_output();
				break;
			
			case 4:
				s.stu_delete();
				break;
				
				
			case 8:
				s.fileOpen();
				break;
			
			
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}// switch
			
		} // while
		
		
		
		
		
		
	}

}


