package c230829;

interface InterfaceTest{
	/*public static final*/int NUMBER = 1;
	// 변수 가들어갈수잇지만 퍼블릭 스태틱 상수가 된다.
	// 얘는 왜 다중 상속이 가능할까? 왜 변수를 둘수없을까?
	// 이름 밖에 없으니까 다중 상속이 가능
	/*public abstract 생략되어있음*/void methodTest();
	static void staticMedthod() {
		System.out.println("정적 메서드 가능?");
		//클래스가 메모리에 저장될때 같이 저장되는게 스태틱
		privateStaticMethodTest();
	}
	
	private static void privateStaticMethodTest()
	{
		System.out.println("privaate 메서드 가능?!");
		// private 메서드 호출 가능? 불가능?	1111111	
	}
	private void privateMethodTest()
	{
		System.out.println("privaate 메서드 가능?!");
		// private 메서드 호출 가능? 불가능?		
	}
	
	default void defaultMethodTest() {
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest{
	@Override
	public void methodTest() {}
	
	@Override
	public void defaultMethodTest() {
		InterfaceTest.super.defaultMethodTest();
	}
}




public class Main {
	public static void main(String[] args) {
		InterfaceTest.staticMedthod();
		YellowRace JKH = new YellowRace();
	    JKH.move();
		Person[] people = new Person[] {JKH, new WhiteRace()};
//		people[0]
		people[0].move();
	}

}
