package ToDoList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TodayList today = new TodayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("To Do List");



		while(true)
		{
			
			String toDo = today.getToDo();
			int importance = today.getImportance();
			WEEK select = today.selectDay();

			switch(select)
			{
			case MONDAY :
				System.out.println("월요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case TUESDAY :
				System.out.println("화요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case WEDNESDAY :
				System.out.println("수요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case THURSDAY :
				System.out.println("목요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case FRIDAY :
				System.out.println("금요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case SATURDAY :
				System.out.println("토요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case SUNDAY :
				System.out.println("일요일 입니다.");
				sc.nextLine();
				toDo = sc.nextLine();
				importance = sc.nextInt();
				today.addtoDo(today, toDo, importance);
				break;
			case REMOVE:
				//today.removetoDo(today);
				today.print();
				break;
			case END :
				System.out.println("ToDoList : ");
				today.print();
				break; 	

			}
		}
	}



}


	
	

