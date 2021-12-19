package javastudy.ex1217;

public class personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
			클래스에 선언된 필드를 클래스 외부에서 사용하기 위해서는
			반드시 해당 클래스 타입으로 객체가 생성되고 그 객체를 참조하고 있는
			클래스 변수를 통해서만 접근 할 수 있다.
		 */
		Person p = new Person("홍길동",25,"010-3438-1455","전주시");
		
		p.name = "권시윤";
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.phone);
		System.out.println(p.addr);
		
		Person p2 = new Person("홍길수",26,"010","익산");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		System.out.println(p2.addr);
		
		School school = new School();
		
		/*
		 * 다른주소를 바라보는중
		Person schoolP = school.person;
		schoolP = new Person("123",15,"010","서울");
		System.out.println(schoolP.name);
		*/
		
		//같은 주소를 바라보는중
		Person schoolP = new Person("123",15,"010","서울");
		school.person = schoolP;
		System.out.println(school.person.name);
		
	}

}
