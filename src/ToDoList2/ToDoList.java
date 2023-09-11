package ToDoList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ToDoList {
	private String doWork;
	private int priorityNum;
	private Map<String, Integer> map =new HashMap<>();
	 
	
	public void setDoWork(String doWork)
	{
		this.doWork=doWork;
	}
	public void setPriorityNum(int priorityNum)
	{
		this.priorityNum=priorityNum;
	}
	public String getDoWork()
	{
		return doWork;
	}
	public int getPriorityNum()
	{
		return priorityNum;
	}
	
	public void addList(String doWork, int priorityNum)
	{
		map.put(doWork, priorityNum);
	}
	public void prioritySorting()
	{
		List<String> priority = new ArrayList<>(map.keySet());
		priority.sort(String::compareTo);
		for (String key : priority) {
			System.out.print("할일: " + key);
			System.out.println(" 우선도 : " + map.get(key));
		}

	}

}
