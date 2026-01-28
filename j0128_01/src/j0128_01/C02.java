package j0128_01; // 패키지 - 자동생성

import java.lang.reflect.Array;
import java.util.ArrayList;

// 상속 - 자동생성
public class C02 extends Object {

//	C02(){ // 생성자 - 자동생성
//		super(); // 부모생성자호출 - 자동생성
//	} 
	
	public static void main(String[] args) {
		// 컬렉션 - 객체를 저장하는 확장배열
		//  Object o = new car();
		// add() : 숫자, get() : 순서번호
		ArrayList<FireCar> list = new ArrayList();
		list.add(new FireCar()); 
		
		FireCar c = (FireCar)list.get(0);
		
		
		
		
		
		
		
//		Object o = new FireCar();
//		list.add(o); // Integer 객체
//		list.add(new FireCar()); 
//		
//		FireCar ff1 = (FireCar)list.get(0);
//		ff1.water();
//		FireCar ff2 = (FireCar)list.get(1);
//		ff2.water();
//		
		
		
//		Car c = new Car();
//		Car c2 = null;
//		
//		FireCar f1 = new FireCar();
//		FireCar f2 = null;
//		
//		AmbulCar a1 = new AmbulCar();
//		AmbulCar a2 = null;
//		
//		c2 = (Car)f1; // 형변환생략
//		f2 = (FireCar)c2; // 형변환해야함
//		f2.water();
		
		
		
		
		// 배열은 개수가 정해지면 추가가 안됨, 같은 타입만 입력가능
//		int[] a = new int[2];
//		a[0] = 1;
//		a[1] = 2;
//		
//		System.out.println(a[0]+","+a[1]);
		

	}

}
