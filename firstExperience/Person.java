package javastudy.ex1217;

public class Person {

	String name;
	int age;
	String phone;
	String addr;
	
	/*
		//기본 생성자는 자바 파일 생성시 누락하면 컴파일러가 class파일에 생성해준다.
		//기본 생성자의 역할은 class에 선언되어있는 필드와 메소드 그대로 객체를 만들어준다.
	public Person() {
		
	}
	*/
	
	//person 타입 객체가 생성될 때 name,age,phone,addr 전부 초기화
	//할수있는 생성자를 만드세요.
	Person(String name,int age,String phone,String addr){
		System.out.println("생성자 호출!");
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
		
	}
	
	//생성자가 2개이상 있으면 생성자 오버로딩이라고 함.
	Person(){
		this("홍길동",40,"010-1111-1111","전주");
	}
	
	//생성자 오버로딩시 선언되어 있는 매개변수의 타입 순서, 갯수가 동일하면
	//생성자 오버로딩을 할 수 없다. 변수명은 오버로딩의 대상이 되지 않는다.
	/*
	Person(String name,int age,String addr,String phone){
		System.out.println("생성자 호출!");
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
		
	}
	*/
}
