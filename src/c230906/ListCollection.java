package c230906;

import java.util.List;
import java.util.LinkedList;

//LinkedList
//노드끼리의 주소 포인터를 서로를 가리키고 있음.
//하나의 노드에는 데이터와 다음 노드를 가리키는 포인터가 있다.
//중간에 데이터를 insert, delete 하기에 유용하다.
//하지만 특정 위치에 빠르게 엑세스(접근) 하려면 순차적으로 탐색해야 하는 단점이 있음
//처음부터 순차적으로 나타내기만 된다.
//single,double
//single 단방향   하나의 노드에는 data와 다음 노드를 가르키는 pointer가 들어간다. 처음은 head 끝은 tail
//double 양방향   단방향에서 이전의 노드를 가르키는 pointer 추가
//자바에서 는 내부적으로 double로 만들어져있음
//중간 삽입삭제가 빠르다
//인덱스의 개념이 없다 
//랜덤 엑세스가 없다?




public class ListCollection {
	
	public static void main(String[] args)
	{
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("체리");
		
		System.out.println("링크드 리스트 순회하기");
		
		for (String fruit : linkedList)
		{
			System.out.println(fruit);
		}
		linkedList.add(1,"오렌지"); // 특정위치
		linkedList.remove("바나나"); //삭제
		
		String elem=linkedList.get(2);
		System.out.println("2번째 :"+elem);
		
		System.out.println("사이즈 :"+linkedList.size());
		
		boolean isApple=linkedList.contains("사과");
		System.out.println("사과 있음? :"+isApple);
		
		Object[] array=linkedList.toArray();
		for(Object object : array)
		{
			System.out.println(object.toString());
		}

		linkedList.clear();
		System.out.println("비어있음? : "+linkedList.isEmpty());
		
	}//end of main
}//end of class
