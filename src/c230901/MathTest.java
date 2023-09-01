package c230901;

import java.util.Random;

public class MathTest {
	public static void test() {
		System.out.println(Math.abs(-5));  // abs 절대값
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1));  // ceil 올림
		System.out.println(Math.ceil(5.0000001));
		
		System.out.println(Math.floor(5.1));  // floor 내림
		System.out.println(Math.floor(5.99));
		
		System.out.println(Math.max(4, 7));  // 최대값
		System.out.println(Math.min(4, 7));  // 최소값
		
		System.out.println(Math.round(5.1)); // round 반올림
		System.out.println(Math.round(5.9));
		
		System.out.println();
		
		Random rd = new Random(1); // 매개변수로 랜덤에 대한 참조값을 전달할 수 있다. 이런 참조값을 종자값(seed) 이라고 말한다.
		System.out.println(rd.nextInt(9) + 1);
		System.out.println(rd.nextInt(9) + 1);	
		System.out.println(rd.nextInt(9) + 1);	
		Random rd1 = new Random(1);
		System.out.println(rd1.nextInt(9) + 1);
		System.out.println(rd1.nextInt(9) + 1);
		System.out.println(rd1.nextInt(9) + 1);			
	}
}
