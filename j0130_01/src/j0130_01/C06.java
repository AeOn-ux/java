package j0130_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class C06 {

	public static void main(String[] args) {
		
		// 문서파일 읽어오기 - BufferedReader 객체를 사용해서 진행
		String filePath = "c:/aaa/a1.txt";
		try {
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine(); // 1줄씩 읽어오기
			if(line == null) break;
			System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	

//		// FileInputStream - 2byte씩 읽어와서 문자를 출력하는 방식
//		String filePath = "c:/aaa/a1.txt";
//		try {
//			// 파일과 연결통로생성
//			FileInputStream fis = new FileInputStream(filePath);
//			int read = 0;
//			// 파일을 읽어옴.
//			while((read=fis.read()) != -1) { //2byte
//				// 파일 출력
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	

//		byte[] b = new byte[1024]; //1KB
//		String filePath = "c:/aaa/a1.txt";
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			fis.read(b);
//			System.out.println(new String(b));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	}
}
