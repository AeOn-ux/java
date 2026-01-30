package j0130_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CFileCopy {
	public static void main(String[] args) {
		// 파일 복사
		File f = new File("c:/aaa/nct2.jpg");
		try {
			// 파일 읽어오기
			FileInputStream fis = new FileInputStream(f);
			
			// 파일 저장하기
			FileOutputStream fos = new FileOutputStream("c:/bbb/nct222.jpg");
			while(true) {
				int read = fis.read();
				if(read == -1) break;
				fos.write(read);
			}
			fis.close();
			fis.close();
			System.out.println("파일이 복사되었습니다.");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}
