package c230829.calculator;

public interface MultiplicationInterface {
	default double multiplication(double num1, double num2)
	{
		return num1*num2;
	}
}
