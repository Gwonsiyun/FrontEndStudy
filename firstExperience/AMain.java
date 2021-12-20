package javastudy.ex1220;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(1,2);
		a.method1();
		
		int result = a.sum();
		System.out.println(result);
		
		a.A();
		
		/*
			자바에서는 메소드를 호출하기 위하여 반드시 메소드에 선언된
			매개변수의 타입 갯수 순서를 맞춰 인자를 넘겨야지만 한다.
		 */
		result = a.sum1(1,2);
		System.out.println(result);
		
		a.returnEx(1);
		a.returnEx(0);
		
		/*
		자바에서 메소드 호출시 반드시 존재하는 매개변수의 
		타입 갯수 순서에 맞는 메소드를 호출해야 된다.
		a.method2("","");
		*/
	}

}
