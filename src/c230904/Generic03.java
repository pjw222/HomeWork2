package c230904;


//class Parent<T>{}
//class Child01<T> extends Parent<T>{
//	// 일반 상속과 동일
//	T t;
//	public T getT(){
//		return t;
//	}
//	public void setT(T t)
//	{
//		this.t =t;
//	}
//}
//class child02<T1, T2> extends Parent<T1>
//{
//	
//}

class Shape<T>{
	protected T name;

	public Shape(T name) {
		this.name = name;
	}
	public double getArea() {
		return 0.0;
	}

	public void PrintInfo()
	{
		System.out.println("도형 :"+name);
		System.out.println("면적 :"+getArea());
	}	
}

class Circle<T> extends Shape<T>{
	private double radius;
	public Circle(T name, double radius)
	{
		super(name);
		this.radius=radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

	class Rectangle<T> extends Shape<T>{
		private double width;
		private double height;	
		public Rectangle(T name, double width, double height) {

			super(name);
			this.width=width;
			this.height=height;
		}
		@Override
		public double getArea() {
			return width*height;
		}

	}




public class Generic03 {

	public static void main(String[] args) {
		
		Circle<String>circle=new Circle<>("원",5.0);
		Rectangle<String>rectangle=new Rectangle<>("사각형",4.0,6.0);

		circle.PrintInfo();
		System.out.println();
		rectangle.PrintInfo();
		System.out.println();

	}

}
