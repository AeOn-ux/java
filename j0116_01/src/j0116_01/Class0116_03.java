package j0116_01;

public class Class0116_03 {
	
	// main + Ctrl+space
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		// sys + Ctrl+space
		System.out.println();
		
		System.out.println();
		
		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041';
		char tab = '\t';
		System.out.println(ch);
		System.out.println(tab);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 한 줄 복사 : Ctrl+Alt
		// 삭제 : Ctrl+d
		
		char ch4 = 'a';
		// char ch4 = 'aa'; //에러
		// char ch5 = ''; // ''안에 넣지 않은 것은 에러
	    char ch6 = ' ';// 공백 문자는 가능
	    
	    // 문자열은 모든 타입을 포함시킬 수 있음.
	    String str2 = "7";
	    // "7"+7+7 = 777
	    System.out.println("7"+7+7);
	    // 7+7+"7" = 147
	    		
	    String str3 = "aaa";
	    String strr = str3 + 7; 
	    System.out.println(str3+7);
	    
	    int a = 7;
	    int b = 8;
	    String str4 = "7";
	    System.out.println(a+b+str4); //  = 157
	}
}
