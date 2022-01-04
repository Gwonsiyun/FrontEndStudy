package javastudy.ex0104.linkedList;

import java.util.*;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//linkedlist -	list 인터페이스의 구현 객체로 데이터들을 링크 구조로 관리
		//			 -	각 원소간의 앞뒤 주소를 참조하는 형태
		//			 -	집합의 중간에서 데이터가 빈번하게 변경되는 경우 사용(속도가 더 빠름)
		List<String>  linkList = new LinkedList<>();
		List<String> arrayList = new ArrayList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			arrayList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("arrayList 경과시간 -> "+(endTime-startTime));
		
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			linkList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 경과시간 -> "+(endTime-startTime));
		
		
		
		//list 인터페이스의 구현 클래스들은 전부 독립적으로 인터페이스에 담지않고 객체로 사용할 수 있다.
		ArrayList<String> arrayList2 = new ArrayList<>();
		
	}

}
