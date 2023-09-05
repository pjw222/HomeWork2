package c230905;

import java.util.ArrayList;
import java.util.List;


class Stack<T>{

	private List<T> stackArrayList = new ArrayList<>();
	public void push(T t)
	{
		stackArrayList.add(t);
		System.out.println("푸쉬 한 내용 :" + t);
		System.out.println("리스트 목록 :" +stackArrayList);
	}
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("비어있습니다.");
			return null;
		}
	
		T t = stackArrayList.remove(stackArrayList.size()-1);
		System.out.println("팝 한 목록 :"+t);
		System.out.println("리스트 목록 :" +stackArrayList);
		
		return t;
		
	}

	public boolean isEmpty()
	{
		return stackArrayList.isEmpty();
	}

}
public class StackHomeWork {

	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push("둘");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}


}
