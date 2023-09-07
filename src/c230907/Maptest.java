package c230907;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maptest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//(String)key키와 (Integer)value값 키가 중복됬는지를 체크 
		// 중복의 주체와 데이터가 다른지 확인
		// 저장되었을때 순서대로 나온다는 보장이 없다.
		// 중복체크만하기 때문
		map.put("권원준", 7);
		map.put("김남균", 8);
		map.put("임현규", 23);
		map.put("김동선", 3);
		map.put("정경훈", 7);
		System.out.println(map.size());
		map.put("정경훈", 13);
		System.out.println(map.size());
		System.out.println(map.get("정경훈"));
		map.remove("정경훈");
		System.out.println(map.get("정경훈"));
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		System.out.println(keySet.iterator().next()); //새로 받아오기떄문에 같은거 반복해서 뜬다.
		System.out.println(keySet.iterator().next());
		System.out.println(keySet.iterator().next());
		System.out.println(keySet.iterator().next());
	}
}
