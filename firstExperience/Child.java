package javastudy.ex1223.interface2;

public interface Child extends Parent{
	void child();
	
	@Override
	default void defaultP() {
		System.out.println("부모의 디폴드 메소드 재정의 가능!");
	}
}
