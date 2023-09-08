package c230908.todolist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TodoItem temp = new TodoItem(1, "리스트 작성", "입력을 받아서 아이템 작성");		
		System.out.println(temp);

		TodoItem[] arr = new TodoItem[] {
				temp,
				new TodoItem(3, "테스트중", "테스트를 먼저하나?")
		};

		for(TodoItem item : arr) {
			System.out.println(item.toList());
		}

		TodoList list = new TodoList();
//		list.test();
		
//		Scanner sc = new Scanner(System.in);
//		while(true){
//			System.out.println(list);
//			System.out.println("---------");
//			System.out.println("1,2,3");
//			
//		}
//		
		
	}
}
