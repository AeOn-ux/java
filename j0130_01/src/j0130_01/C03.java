package j0130_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C03 {

	public static void main(String[] args) {

//		HashMap<String, Object> map = new HashMap();
		Map<String, Object> map = new HashMap();
		
		List list = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		list.add(1); // [0]
		list.add(2); // [1]
		list.add(list2); // [2]:list2
		list.add(list3); // [3]:list3
		
		// 입력 - put
		map.put("name", "홍길동");
		map.put("boardlist", list);
		map.put("memberlist", list2);
		// 1개 읽어오기, 출력 - get()
		System.out.println(map.get("name"));
		
		
		
		// 전체 출력 - map은 list를 상속하지 않기 때문에 Iterator을 사용할 수 없다.
		// map -> set으로 변경해서 Iterator를 사용
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// set
//		HashSet set = new HashSet();
//		// 순서 X, 중복 X
//		// 중복은 입력은 되지만 실행 X
//		set.add(1); // int -> Tnteger->Object
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			int a = (int)(it.next());
//			System.out.println(a);
//		}
//		
		

	}

}
