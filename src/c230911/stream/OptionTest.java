package c230911.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionTest {
	public static void test() {
		int[] arr = { 1, 3,  5, 7 };
		int[] arr1 = { 2, 4, 6, 8, 9 };
		String[] arr3 = { "경","일" };
		
		System.out.println(Arrays.stream(arr).filter(item->item % 3 == 0).count());  //필터링
		System.out.println(Arrays.stream(arr1).filter(item->item % 3 == 0).count());
		System.out.println();
		
		System.out.println(Arrays.stream(arr).sum()); //더하기
		System.out.println(Arrays.stream(arr1).sum());
		System.out.println();
		
		System.out.println(Arrays.stream(arr).average().getAsDouble()); //평균
		System.out.println(Arrays.stream(arr1).average().getAsDouble());
		System.out.println();
		
		System.out.println(Arrays.stream(arr).max().getAsInt()); //최댓값과 최솟값
		System.out.println(Arrays.stream(arr).min().getAsInt());
		System.out.println();
		
		
		//예외처리하는 방법들
		int[] arr2 = {};
		try {
			System.out.println(Arrays.stream(arr2).average().getAsDouble());
		}catch(Exception e)
		{
			e.printStackTrace();
			OptionalDouble od = Arrays.stream(arr2).average();
			if(od.isPresent()) {
				System.out.println(od.getAsDouble());
			}
			else {
				System.out.println("없음");
			}
			System.out.println(Arrays.stream(arr).average().orElse(0.0));
			System.out.println(Arrays.stream(arr2).average().orElse(0.0)); //위에식에서 문제가있다면 0.0으로 처리해라
			
			Arrays.stream(arr).average().ifPresent(item->System.out.println("예외 : "+item));  //문제가없다면 출력해준다
			Arrays.stream(arr2).average().ifPresent(item->System.out.println("예외 : "+item));
			
			System.out.println(Arrays.stream(arr).reduce(0, (a, b)->a+b / 2 + 1));
			System.out.println(Arrays.stream(arr3).reduce("", (a, b)->a+b));
			// 1, 3, 5, 7 => 16 / 2 => 8 + 4 => 12 
			// 0.5 int 0 / 1.5 int 1 / 2.5 int 2 / 3.5  int 3 / => 0 + 1 + 2 + 3
			// 1 2 3 4 
			
		}
		
		
		
		
	}
}
