package c230904;


class Apple{}
//class Goods1{
//	
//	private Apple apple = new Apple();
//	
//	public Apple GetApple()
//	{
//		return apple;
//	}
//	public void SetApple(Apple apple) {
//		this.apple =apple;
//	}
//}
class Pencil{}
//class Goods2{
//	private Pencil pencil = new Pencil();
//	
//	public Pencil GetPencil() {
//		return pencil;
//	}
//	public void SetPencil(Pencil pencil) {
//		this.pencil =pencil;
//	}
//}
//자바에서는 다양한 종류의 클래스와 인터페이스를 제공
//클래스랑 인터페이스를 내부 멤버에서 활용하는 클래스를 만든다
//클래스를 작성하고 활용할때는 제네릭이라는 기법을 모를때는 계속만들어야한다.


//위 코드를 봤을때 새로운 상품이 추가 될때마다 새롭게 클래스를 만들어야 되냐?
//귀찮
//첫번째 해결 방법은 최상위 클래스인 Object 타입으로 선언하는 것.
//Object 객체를 저장하고 관리하는 클래스를 생성하면 과일이든, 학용품이든 저장하거나 읽어들일수 있음



//class Goods3{
//	private Object object = new Object();
//	public Object Get() {
//		return object;
//	}
//	public void Set(Object object) {
//		this.object =object;
//	}
//}


// 제네릭 클래스와 제네릭 인터페이스
//제네릭 클래스

/*
  접근 지정자 class 클래스명<T>{
  
  }
  
  접근 지정자 class 클래스명<K,T>{
  
  }
  
  접근 지정자 interface 클래스명<T>{
  
  }
  
  접근 지정자 interface 클래스명<K,T>{
  
  }
 */
//제네릭 클래스의 객체생성
//객체생성 과정은 일반 클래스의 객체 생성과 비슷
//단, 클래스명 다음에<실제 제네릭 타입>을 삽입한다.
//즉, 객체를 생성할때 제네릭 타입 변수에 실제 타입을 대입한다.

//클래스명<실제 제네릭타입> 참조변수 명 = new 클래스명<실제 제네릭타입>();
//클래스명<실제 제네릭타입> 참조변수 명 = new 클래스명<>();


class MyClass<T>{
	
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t =t;
	}

}
class KeyValue<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key =key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value =value;
	}
	
}
class CharacterFactory<T>{
	
	private T character;
	
	public CharacterFactory(T character) {
		this.character =character;
	}
	public void Introduce() {
		
		System.out.println("나는 "+character.getClass().getSimpleName()+"character");
	}
	public T GetCharacter() {
		return character;
	}
}
class Knight{
	private String name;
	public Knight(String name) {
		this.name = name;		
	}
	public void Attack() {
		System.out.println(name + "  칼을 휘두룸!!!!");
	}
}
class Wizard{
	private String name;
	public Wizard(String name) {
		this.name = name;
	}
	public void Skill() {
		System.out.println(name + "  화이어 볼 발사");
	}
}




//문자열 앞뒤공백제거 -> 대문자로 변환 -> 처음 5글자만 추출
//String reString=inputString.trim().toUpperCase().subString(0,5);
//getClass() 클래스객체를 갖고오는 녀석
//getSimpleName 클래스객체를 문자열로 나타내는것 문자열로 반환하겟다 
//메서드를 연달아서 쓰는거 메서드체인이라는 기법  . . <<< 


public class Generic {
	
	public static void main(String[] args) {
		
//		Goods3 goods3 = new Goods3();
//		goods3.Set(new Apple());
//		//오브젝트로 셋을 햇으면 겟으로 갖고 올때는 형변환을해야한다
//		//타입으로 꺼내오기 위해서는 저장된 형태로 타입 캐스팅을 해야한다.
//		//필드 자체가 Object 타입이라 Get으로 가져오는 타입 또한 항상 Object 타입이기 때문임.
//		//그래서 Get을 할때는 Set을 한 타입으로 형변환 해야한다.
//		Apple apple = (Apple)goods3.Get();	
		
		//제네릭 클래스인 MyClass 써보기
		
		//String 타입 저장하거나 꺼내 올수 있는 객체지정
		MyClass<String> mc1 = new MyClass<>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		//Integer 타입 저장하거나 꺼내 올수 있는 객체지정
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(12345);
		System.out.println(mc2.get());
		
		
		//제네릭 타입 변수가 2개인 경우
		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		kv1.setKey("열쇠");
		kv1.setValue(54321);
		String key1=kv1.getKey();
		int value1=kv1.getValue();
		System.out.println("Key :"+key1+"\n\tvalue :"+value1);
		
		KeyValue<String, Void> kv2= new KeyValue<>();
		kv2.setKey("한개만쓰기");
		//kv2.SetValue(12345);  에러
		String key2=kv2.getKey();
		System.out.println("Key 하나만 쓰기 :\n"+key2);
		
		
       //////////////////////////////////////////////////////
		CharacterFactory<Knight> knightFactory = new CharacterFactory<>(new Knight("홍길동"));
		CharacterFactory<Wizard> wizardFactory = new CharacterFactory<>(new Wizard("고길동"));

		knightFactory.Introduce();
		Knight knight =knightFactory.GetCharacter();
		knight.Attack();
		wizardFactory.Introduce();
		Wizard wizard =wizardFactory.GetCharacter();
		wizard.Skill();
		
		
		
	}

}
