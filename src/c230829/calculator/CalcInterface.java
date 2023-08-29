package c230829.calculator;

public interface CalcInterface extends AddInterface,MinusInterface,MultiplicationInterface,divideInterface,dividethanInterface {
	public default double add(double ...nums) {
		double temp = 0;
		for(double num : nums)
		{
			temp = AddInterface.super.add(temp, num);
		}
		return temp;
	}
	public default double minus(double ...nums) {
		double temp = nums[0];
		for(int i = 1; i<nums.length; i++)
		{
			temp = MinusInterface.super.minus(temp, nums[i]);
		}
		return temp;
	}
	public default double multi(double ...nums) {
		double temp = nums[0];
		for(int i= 1; i<nums.length; i++)
		{
			temp = MultiplicationInterface.super.multiplication(temp, nums[i]);
		}
		return temp;
	}
	public default double divide(double ...nums) {
		double temp = nums[0];
		double num;

		for(int i= 1; i<nums.length; i++)
		{   
			num = divideInterface.super.dividethan(temp, nums[i]);
			temp = divideInterface.super.divide(temp, nums[i]);
			System.out.printf("값은 : %.3f\n",(double)temp);
			System.out.println("나머지 값은 : "+(int)num);
			
		}
		return temp;
		
	}
//	public default int dividethan(int ...nums) {
//		int temp = nums[0];
//		double[] num;
//
//		for(int i= 1; i<nums.length; i++)
//		{
//		    
//			temp = divideInterface.super.dividethan(temp, nums[i]);
//			num = divideInterface.super.dividethan(temp, nums[i]);
//			
//		}
//		return temp;
//	}
}
