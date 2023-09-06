package c230906;

import java.util.LinkedList;
import java.util.List;

//오늘의 과제 순수한 싱글링크드리스트 구현하기


class Node<T>
{

	T data;
	Node<T> next;

	Node(T data)
	{
		this.data = data;
		this.next = null;
	}
	public T get()
	{
		return data;
	}
	public Node<T> getNext()
	{
		return next;
	}
	public void setNext(Node<T> n)
	{
		n = next;
	}
}
class SingleLinkedList<T>
{
	LinkedList<Node<T>> singleLinkedList = new LinkedList<>();
	public void size()
	{
		singleLinkedList.size();
	}
	public void add(int index, T n)
	{
		Node<T> node = new Node<>(n);
		singleLinkedList.add(index, node);
		node.setNext(singleLinkedList.get(index));

		if(index>0) {			
			singleLinkedList.get(index-1).setNext(node);
		}
	}
	public void remove(T n)
	{
		int index=0;
		for(int i=0; i < singleLinkedList.size(); i++) 
		{
			if(n.equals(singleLinkedList.get(i).get())) 
			{
				index=i;
			}

		}
		if(singleLinkedList.size()==index) {

			singleLinkedList.get(index-1).setNext(null);
			if(index>0) 
			{			
				singleLinkedList.get(index-1).setNext(singleLinkedList.get(index+1));
			}
		}			


		singleLinkedList.remove(index);


	}

	public T get(int index)
	{
		return singleLinkedList.get(index).get();		
	}

	public void print()
	{
		for(int i = 0; i < singleLinkedList.size();i++)
		{
			System.out.println(get(i));
		}

	}



	
}
public class LinkedListHomeWork{

	public static void main(String[] args)
	{
		SingleLinkedList<String> link = new SingleLinkedList<>();
		
		link.add(0, "ㅎㅇ");
		link.add(1, "ㅂㅇ");
		link.add(2, "ㅈㅇ");
		link.add(3, "ㅇㅇ");
		link.add(4, "ㅅㅇ");
		link.add(5, "ㄷㅇ");
	
		link.remove("ㄷㅇ");
		link.print();
			
	}
}
