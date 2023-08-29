package c230829.calculator;

public interface dividethanInterface {
	default double dividethan(double num1, double num2)
	{
		return num1%num2;
	}
}
