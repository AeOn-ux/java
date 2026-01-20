package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_04 {

	public static void main(String[] args) {
		// 1~45까지의 랜덤 번호를 출력하시오.
		// (int)(Math.random()*45)+1;
		int[] random = new int[45];
		
		//순차출력
		for(int i=0;i<random.length;i++) {
			random[i] = i+1;
		}
//		System.out.println("순차번호 : "+Arrays.toString(random));
		
		//랜덤숫자 
		for(int i=0;i<300;i++) {
			int rd = (int)(Math.random()*45);
			int temp = random[0];
			random[0] = random[rd];
			random[rd] = temp;
			
		}
		System.out.println("랜덤번호 : "+Arrays.toString(random));
		
//		// 번호 6개를 입력받아 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		int[] input = new int[6];
//		for(int i=0;i<6;i++) { 
//			System.out.println("번호를 입력하세요.>>");
//			input[i] = scanner.nextInt();
//		}
//		System.out.println("입력번호 : "+Arrays.toString(input));
		
		// 번호 6개를 입력받아 출력하시오.
				Scanner scanner = new Scanner(System.in);
				int[] input = new int[6];
				for(int i=0;i<6;i++) { 
					// 1~45번 아닌 번호를 입력했을때 다시 입력하기
					
					System.out.printf("%d번째 번호를 입력하세요.>>\n",i+1);
					input[i] = scanner.nextInt();
					if(input[i]<=0 || input[i]>=46) {
						System.out.printf("입력번호 : %d, 번호를 잘못 입력하셨습니다.\n",input[i]);
						i -= 1;
						continue;
					}
				}
				System.out.println("입력번호 : "+Arrays.toString(input));
		
		// 앞 6개만 출력하시오
		System.out.print("랜덤번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		
	}

}
