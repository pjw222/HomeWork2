package c230829.calculator;

public class Calculator implements CalcInterface {
	public double calculate(char operator, double ...nums) {
		switch(operator) {
			case '+': 
				return CalcInterface.super.add(nums);
			case '-':
				return CalcInterface.super.minus(nums);
			case '*':
				return CalcInterface.super.multi(nums);
			case '/':
				return CalcInterface.super.divide(nums);
//			case '%':
//				return CalcInterface.super.dividethan(nums);

		default:
			return 0;
		}
	}
	public int calculate(String formula) {
		return 0;
	}

}
