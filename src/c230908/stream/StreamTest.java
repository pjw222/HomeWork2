package c230908.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void test() {
		Set<String> set = new HashSet<String>();
		set.add("김AA");
		set.add("임AA");
		set.add("김AB");
		set.add("이AA");
		set.add("김AC");
		set.add("송AA");
		set.add("박AA");
		set.add("한AA");
		set.add("임AB");
		
		Stream<String> stream = set.stream();
		stream.forEach(item->System.out.println(item));
		//((item)->{System.out.println(item)});
		
		System.out.println();
		
		List<String> list = new ArrayList<>();  
		
		list.add("권AA");
		list.add("임AA");
		list.add("김AB");
		list.add("이AA");
		list.add("김AC");
		list.add("송AA");
		list.add("박AA");
		list.add("한AA");
		list.add("임AB");
		
		Stream<String> stream1 = list.stream(); //리스트 자체는 안건들인다.
		stream1.forEach(item->System.out.println(item));
		
		Set<Student> students = new HashSet<>();
		//Set 은 인터페이스
		
		students.add(new Student("권AA", 85));
		students.add(new Student("임AA", 98));
		students.add(new Student("김AA", 90));
		students.add(new Student("이AA", 80));
		students.add(new Student("김AB", 90));
		students.add(new Student("송AA", 70));
		students.add(new Student("박AA", 75));
		students.add(new Student("한AA", 100));
		students.add(new Student("임AB", 80));
		students.add(new Student("한AA", 90));
		
		Stream<Student> stream2 = students.stream();
		IntStream scores = stream2.mapToInt(item->item.getScore()).map(i->-i).sorted().map(i->-i); //Int를써서 컴페어 못씀 그래서
		//stream2.forEach(item->System.out.println(item));                                        // map을써서 음수로 먼저받고 그후 정렬을 음수로 정렬
		double avg = scores.average().getAsDouble();
		//		scores.forEach(item->System.out.println(item));
		System.out.println("avg : "+ avg);
		
		IntStream scoresDis = students.stream().mapToInt(item->item.getScore()).distinct();
		//int[] temp =scoresDis.toArray();
		scoresDis.forEach(item->System.out.print(item +", "));
		System.out.println();
		Stream<Student> stream3 = students.stream().sorted(Comparator.reverseOrder()); //sorted만쓰면 내림차순
	
		stream3.forEach(item->System.out.println(item));
		System.out.println();
		Stream<Student> stream4 = students.stream().filter(item->{
			
		return item.getScore() > avg;});
		stream4.forEach(item->System.out.println(item));
		
		
	}
}
