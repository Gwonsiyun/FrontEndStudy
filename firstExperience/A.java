package javastudy.ex1220;

public class A {

	int field1;
	int field2;
	
	A(int field1, int field2){
		this.field1 = field1;
		this.field2 = field2;
	}
	
	//리턴타입 void는 반환값이 없을때
	void method1() {
		System.out.println("method1()가 호출됐습니다.");
	}
	
	//매개변수
	int sum() {
		return field1+field2;
	}
	
	// 클래스와 이름이 동일하지만 리턴타입이 존재하면 메소드로 인식한다.
	void A() {
		System.out.println("생성자 이름과 동일");
	}
	
	int sum1(int num1,int num2) {
		int result = 0;
		result = num1+num2;
		return result;
	}
	/*
		return 키워드는 메소드를 강제로 종료합니다.
		return 키워드 밑네는 다른 실행문이 올 수 없습니다.
		조건문을 함께 사용하면 return 키워드 밑에도 실행문이 들어올 수 있습니다.
	*/
	void returnEx(int num1) {
		method1();
		System.out.println("field1:"+field1);
		System.out.println("field2:"+field2);
		
		System.out.println("retrun을 만나면 메소드 종료");
		if(num1 == 0) {
			return;
			//System.out.println("return");
		}
		System.out.println("0이 아니므로 출력됩니다.");
		//System.out.println("여기는 실행되지 않습니다.");
	}
	
	//오버로딩
	//1
	void method2() {
		System.out.println("매개변수가 없는 void 타입 메소드");
	}
	//2
	int method2(int a) {
		System.out.println("int 매개변수 하나 받는 int 타입 메소드");
		return a;
	}
	//3
	int method2(String a) {
		/*
			메소드 2와 3은 매개변수의 갯수는 같지만 타입이 다르므로 오버로딩
		 */
		System.out.println("String 매개변수 하나 받는 int 타입 메소드");
		return Integer.parseInt(a);
	}
	//4
	void method2(int a, String b) {
		/*
			1~3의 메소드 중에 매개변수를 두개 갖는 메소드는 없으므로 오버로딩 가능!
		 */
		System.out.println("int,String 매개변수를 받는 메소드");
	}
	//5
	/*
	void method2(int b, String a) {
		매개변수의 변수명이 다른것은 오버로딩의 대상이 되지 않는다.
	}
	*/
}
