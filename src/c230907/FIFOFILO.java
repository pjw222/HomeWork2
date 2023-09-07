package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFILO {
	// First In First Out => Queue
	// First In Last Out => Stack
	// Queue 트리 자료구조에쓰임
	// Stack 메서드 호출에쓰임

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>(); //Array, LinkedList, ArrayList 중간에 빼는거 없고 앞에서부터 뺀다

		System.out.println(q.isEmpty());

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q);
		System.out.println(q.poll());   //poll 빼낸다 빼낸것도 return 해준다
		System.out.println(q);

		Stack<Integer> s = new Stack<>(); //중간에 빼는거없고 뒤에서부터 뺀다

		System.out.println(s.isEmpty());

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.pop());   //pop 빼낸다 빼낸것도 return 해준다
		System.out.println(s);




		
	}
	
	
}
