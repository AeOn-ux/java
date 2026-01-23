package j0123_01;


public class Student {
	public Student(){} // 기본생성자
	
	Student(Student s){
		this.no = s.no;
		this.id = s.id;
		this.pw = s.id;
		this.name = s.name;
		this.phone = s.phone;
		this.gender = s.gender;
		this.hobby = s.hobby;
	}// 객체가 Student s로 들어옴
	
	
//	Student(int no){ // 매개변수가 있는 생성자
//		
//	}
	
	public Student(int no, String id, String pw, String name, String phone, String gender, String hobby) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}


	int no;
	String id;
	String pw;
	String name;
	String phone;
	String gender;
	String hobby;
	String address;
	
	
}
