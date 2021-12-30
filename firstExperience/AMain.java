package javastudy.ex1230.제네릭;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a = new A();
		B b = new B();
		a.field = b;
		
		b = (B)a.field;
		//C c = (C)a.field;
		
		
		//*제네릭*
		//클래스 선언 시에는 명확하지 않은 타입을 객체 생성시에 명확하게 하기위하여 사용하는 방법
		//컴파일시 타입이 결정 지어지기 때문에 강제 형변환 시 발생하는 실행 예외에 대응할 수 있다.
		A<B> aa = new A<B>();
		a.field2 = new B();
		
		A<String> aaa = new A<String>();
		aaa.field2 = "";
		
		//제네릭을 사용하는 클래스라고해서 객체 생성시 반드시 타입을 특정하지는 않아도 된다.
		//하지만 그럴경우 해당 타입은 Object로 잡힌다.
		A aaaa = new A();
		
		
		//기본타입을 타입파라미터로 지정하는 경우 wrapper 클래스를 사용하여야 한다.
		//wrapper 클래스는 기본타입과 객체타입 변환이 자동으로 일어나므로 개발자는
		//기본타입 사용하듯이 wrapper 클래스 타입 변수를 사용하면 된다.
		A<Integer> aaaaa = new A<Integer>();
		//aaaaa.field2 = new Integer(10);
		aaaaa.field2 = 10;
		int i = aaaaa.field2;
	}

}
