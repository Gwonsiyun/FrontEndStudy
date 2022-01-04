package javastudy.ex0104.set;

import java.util.*;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<>();
		
		//hashSet -	중복객체를 허용하지 않고 중복객체를 판별하기 위하여 
		//			hashCode()와 equals()를 비교한다.
		hashSet.add("테스트1");
		hashSet.add("테스트2");
		hashSet.add("테스트1");
		
		System.out.println(hashSet.size());
		
		hashSet.add("테스트3");
		hashSet.add("테스트4");
		hashSet.add("테스트5");
		
		
		//set은 인덱스가 존재하지 않기 때문에 반복자(iterator)를 사용하여
		//원소에 접근한다. 이떄 인덱스가 없기 때문에 꺼내오는 순서도 보장되지 않는다.
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		Set<A> aSet = new HashSet<A>();
		aSet.add(new A("1","2"));
		aSet.add(new A("3","4"));
		System.out.println(aSet.size());
		System.out.println("-------------------");
		Iterator<A> aIterator = aSet.iterator();
		
		//iterator는 next() 호출하면 앞에있는 원소에 대해서는 다시는 접근 할 수 없다.
		//while문 블럭 내에서 하나의 원소만 접근 하기 위해서는 next()는 한번만 호출해야하며
		//원소를 임시 변수에 담아서 사용하면 된다.
		while(aIterator.hasNext()) {
			A a = aIterator.next();
			System.out.println(a.field1);
			System.out.println(a.field2);
		}
		System.out.println("-------------------");
		
		
		
		A a1 = new A("a1","a1");
		A a2 = new A("a2","a2");
		A a3 = new A("a1","a1");
		A a4 = new A("a3","a1");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		
		aSet.clear();
		
		//원소 타입 클래스에서 object의 hashCode()와 equals()를 재정의 하지 않았다면
		//set의 동등객체 판별 기준은 주소값이 된다.
		aSet.add(a1);
		aSet.add(a2);
		aSet.add(a3);
		aSet.add(a4);
		
		//A 클래스의 field1,field2가 같으면 동등객체가 되어 set안에 대입 될 수 없도록
		//hashCode()와 equals() 재정의 하세요
		//이때 String은 이미 논리적 데이터가 같으면 hashCode()의 값이 같고 equals()
		//결과는 true라는것을 활용하세요
		
		System.out.println(aSet.size());
		
	}

}
