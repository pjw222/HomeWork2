package c230907;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	// 중복체크를 해주는 클래스 Set클래스
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();
		set.add(1);
		System.out.println(set.size());
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		System.out.println(set.size());
//		System.out.println(set[0]);
		
		Iterator<Integer> iterator = set.iterator();
		// iterator 주소 포인터를 얘기한다.
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		set.clear();
		System.out.println(set.size());
		
		
	}
}
