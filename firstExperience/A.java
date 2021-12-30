package javastudy.ex1230.제네릭;


//class 선언시 사용하는 type 변수는 클래스 내 타입이 들어오는 모든 위치에 전부 사용할 수 있다.
public class A <T> {

	Object field;
	
	T field2;
	
	T println(T arg) {
		System.out.println(arg.toString());
		return arg;
	}
}
