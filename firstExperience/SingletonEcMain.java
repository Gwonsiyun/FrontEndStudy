package javastudy.ex1220;

import java.util.Calendar;

public class SingletonEcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			단 하나만 존재하고 모든 스레드 에서 공유하고자 하는 
			 객체가 존재하는 경우 사용한다
		 */
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);
		s1.a = 30;
		/*
			싱글톤은 하나만 존재하는 객체로 모든 스레드에서 정적필드를
			 통하여 공유 되므로 싱글톤에 존재하는 필드값이 변경 된 경우
			 사용하는 모든 곳에 영향을 받는다.
		 */
		System.out.println(s2.a);
	}

}
