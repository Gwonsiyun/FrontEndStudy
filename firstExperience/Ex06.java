package javastudy.ex1216;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//null - 참조 변수에 아무런 데이터도 참조하고 있지 않다는 값을 대입할때 사용
		//		 null은 참조 변수에만 대입 가능한 값이다.
		String str = null;
		//int a = null;
		
		//nullpointerException - 참조 변수에 null이 들어가있는 상태에서 해당
		// 타입이 가지는 속성과 메소드를 호출하려 할 떄 발생하는 예외
		//System.out.println(str.length());
		
		//String
		String text1 = "java";
		String text2 = "java";
		System.out.println(text1==text2);
		text1 += "13";
		System.out.println(text2);
		System.out.println(text1==text2);
		
		
		//문자열 연산자 (+)를 사용할때마다 heap에 연산된 새로운 문자열을 만들어
		//새로운 주소를 참조 시키므로 많이 사용할 수록 불필요한 메모리를 낭비하게 된다.
		text2 += "1";
		text2 += "2";
		text2 += "3";
		text2 += "4";
		System.out.println(text2);
		
		
		// 문자열은 참조 변수이기 때문에 값이 같아도 주소가 같거나 다를 수 있다.
		// 때문에 값의 비교를 하기 위해서는 문자열이 가지는 메소드인 equals메소드를 사용한다
		String name1 = "권시윤";
		String name2 = new String("권시윤");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1==name2);
		
		if(name1.equals(name2)) {
			System.out.println("name1과 mame2는 주소는 다르지만 값은 같습니다.");
		}
	}

}
