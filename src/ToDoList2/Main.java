package ToDoList2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		ToDoList list = new ToDoList();
		Scanner sc = new Scanner(System.in);
		System.out.println("할일과 우선도를 입력하세요");
		String doWork=list.getDoWork();
		int pNum = list.getPriorityNum();
		int count = 0;
		while(count!=3) 
		{
			pNum = sc.nextInt();
			doWork =sc.nextLine();
			sc.nextLine();
			System.out.println(doWork);
			System.out.println(pNum);

			list.addList(doWork,pNum);
			count++;
			list.prioritySorting();
			if(count==3)break;
		}
		


	}
}
