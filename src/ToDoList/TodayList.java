package ToDoList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



class TodayList extends Priority{
	private String toDo;
	private int importance;
	private Scanner sc=new Scanner(System.in);
	private Set<Priority> toDoList = new HashSet<>();	
	private Iterator<Priority> iterator = toDoList.iterator();
	
	public void setToDo(String toDo)
	{
		this.toDo = toDo;			
	}
	public void setImportance(int importance)
	{
		this.importance = importance;
	}
	public String getToDo()
	{
		return toDo;
	}
	public int getImportance()
	{
		return importance;
	}
	public WEEK selectDay() {
		System.out.println("요일을 선택해주세요");
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일 6.토요일 7.일요일 8.할일 지우기 9.할일 내역");
		System.out.println("2번째 월요일부터 엔터를 한번더 눌러주세요");
		int selectDay= sc.nextInt();
		switch (selectDay) {
		case 1:	
			return WEEK.MONDAY;
		case 2:
			return WEEK.TUESDAY;
		case 3:
			return WEEK.WEDNESDAY;
		case 4: 
			return WEEK.THURSDAY;
		case 5:
			return WEEK.FRIDAY;
		case 6:
			return WEEK.SATURDAY;
		case 7:
			return WEEK.SUNDAY;
		case 8:
			return WEEK.REMOVE;
		case 9:
			return WEEK.END;
			
		default:
			return null;
		}
	}
	public void addtoDo(Priority priority, String toDo, int importance)
	{

		toDoList.add(priority);
		System.out.println("할일 :"+toDo+"중요도 :"+importance);			

	}
	public void removetoDo(Priority priority)
	{
		toDoList.remove(priority);
		
	}

	public void print()
	{		
		iterator.next();			

	}

}
