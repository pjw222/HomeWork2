package ToDoList2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String toDo = null;
		int priorityNum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("우선도는 작을수록 중요합니다.");


		while(count!=5)
		{

			Map<String, Integer> map =new HashMap<>();
			System.out.println("우선도를 입력하세요");
			priorityNum=sc.nextInt();
			sc.nextLine();
			System.out.println("할일을 입력하세요");
			toDo=sc.nextLine();
			map.put(toDo, priorityNum);

			List<String> priority = new ArrayList<>(map.keySet());
			priority.sort(String::compareTo);
			for (String key : priority) {
				System.out.print("할일 : " + key);
				System.out.println(" 우선도 : " + map.get(key));
			}
			count++;
		}

	}







}


