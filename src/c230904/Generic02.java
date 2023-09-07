package c230904;


//class Apple{}
//class Pencil{}
//
//class Goods<T extends Fruit>{
//	
//}
//상속을 하라는 의미가아니라 범위를 지정해주는 것
//class A{}
//class B extends A{}
//class C extends B{}
//class D<T extends B>{
//	private T t;
//	
//	public T get() {
//		return t;
//	}
//	public void set(T t) {
//		this.t =t;
//	}
//}



//제네릭 클래스의 타입제한
//접근 지정자 class 클래스명<T extends 최상위클래스 / 인터페이스명>{} 

//제네릭 메서드 타입제한
//접근 지정자<T extends 최상위 클래스/인턴페이스> T 메서드(T t){}

class GenericMethod01{
	public <T extends Number> void Method1(T t) {
		System.out.println(t.intValue());
	}	
}
interface MyInterface{
	public abstract void print();
}
class B{
	public<T extends MyInterface> void Method01(T t) {
		t.print();
	}
}


public class Generic02 {
	public static void main(String[] args)
	{
		//D<A> d1=new D<>(); 제네릭 타입제한에 걸림		
//		D<B> d2=new D<>();
//		D<C> d3=new D<>();
		
		GenericMethod01 g = new GenericMethod01();
		g.Method1(5.5);
		
		B b = new B();
		b.Method01(new MyInterface(){
			@Override
			public void print()
			{
				System.out.println("Print() 구현");
			}
		});
	}
}
