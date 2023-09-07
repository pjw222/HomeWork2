package c230907;

import java.util.NavigableSet;
import java.util.TreeSet;


public class TreeSetTest {
	public static void main(String[] args)
	{
		//트리구조로 되어있기때문에 정렬을 해준다.
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(6);
		treeSet.add(12);
		treeSet.add(7);
		treeSet.add(1);
		System.out.println(treeSet.size());
		System.out.println(treeSet);
		
		for(Integer i : treeSet) {
			System.out.println(i);
		}
		
		//밑에기능들은 전이나 그전 또는 그것에 해당하는것 하나만 가져온다.
		System.out.println("처음은 " + treeSet.first());
		
		System.out.println("마지막은 " + treeSet.last());
		
		System.out.println("7 미만은 " + treeSet.lower(7)); 
		
		System.out.println("7 초과는 " + treeSet.higher(7));
		
		System.out.println("7 이하는 " + treeSet.floor(7));
		System.out.println("7 이상은 " + treeSet.ceiling(7));		
		//오름차순
		
		NavigableSet<Integer> descendingTreeSet = treeSet.descendingSet(); //내림차순
		for(Integer i : descendingTreeSet)
		{
			System.out.println("descendingTreeSet :"+i);
		}
		NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(7, true); // false 는 초과 true 는 포함 이상이라는뜻
		for(Integer i : rangeTreeSet)
		{
			System.out.println("tailSet :"+i);
		}
		NavigableSet<Integer> rangeTreeSet2 = treeSet.headSet(7, true); // false 는 미만 true 는 포함 이하라는뜻
		for(Integer i : rangeTreeSet2)
		{
			System.out.println("headSet :"+i);
		}
		NavigableSet<Integer> rangeTreeSet3 = treeSet.subSet(1, false, 12, false); // false 는 초과 true 는 포함 
		for(Integer i : rangeTreeSet3)                // subSet 사이 값 구하기                   
		{
			System.out.println("subSet :"+i);
		}

		
		
		
		
	}
}
