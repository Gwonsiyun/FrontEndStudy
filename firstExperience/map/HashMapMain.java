package javastudy.ex0104.map;

import java.util.*;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-Map 인터페이스는 원소를 키워 값의 쌍 형태로 가지고 있는 구조이다.
		//-키와 값의 쌍은 Map.Entry 타입의 객체로 생성되어 원소로 가지고 있는다.
		//-이때 키는 중복될 수 없고 값은 중복될 수 있다.(동등객체는 hashCode()와 equals()로 판별)
		Map<String,A> map = new HashMap<>();
		
		A a1 = new A("a1","a1");
		A a2 = new A("a2","a2");
		
		map.put("key1", a1);
		map.put("key2", a1);
		map.put(new String("key1"), a2);
		
		System.out.println(map.size());
		
		map.put("key3", new A("a3","a3"));
		map.put("key4", new A("a4","a4"));
		map.put("key5", new A("a5","a5"));
		
		//map에서 key를 이용하여 value를 찾아오기 위해서는 get()사용
		//map은 반드시 key를 알아야 value를 얻어 올 수 있다.
		A value = map.get("key5");
		System.out.println(value.field1+ " "+value.field2);
		
		//map의 모든 원소에 접근하는 방법1
		//keySet()사용
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			A valueA = map.get(key);
			System.out.println("key->"+key+":value->"+valueA.field1+" "+valueA.field2);
		}
		
		System.out.println("--------------------------------");
		
		//map의 모든 원소에 접근하는 방법2
		//entrySet()사용
		Set<Map.Entry<String,A>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String,A>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String,A> entry = entryIterator.next();
			String key = entry.getKey();
			A valueA = entry.getValue();
			System.out.println("key->"+key+":value->"+valueA.field1+" "+valueA.field2);
		}
		
		
		
		
	}

}
