package c230829.calculator;

public class Main {
	public static void main(String[] args) {
		Calculator clac = new Calculator();
		System.out.println(clac.calculate('+',1,2,3,4,10));
		System.out.println(clac.calculate('-',10,1,1));
		System.out.println(clac.calculate('*',10,4));
		System.out.printf("%.3f\n",clac.calculate('/',100,3.2,5));
//		System.out.println(clac.calculate('%',10,2));
		
		
//		System.out.println(3%3);
		// 80/7/3
	}
}
