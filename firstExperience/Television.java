package javastudy.ex1223.interface1;

public class Television implements RemoteControl,Searchable{
	int volume;
	/*
		인터페이스의 추상 메소드를 하나라도 정의하지 않는 클래스는 객체가 될 수 없으므로
		추상 클래스로 정의해야하며 그 자식 클래스에서 부모가 정의하지 않은 추상 메소드를 
		반드시 정의해야한다.
		-반드시 인터페이스의 구현 클래스는 하위에서 추상 메소드를 전부 정의해야 구현 객체가
		 될 수 있다.
	 */
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>=RemoteControl.MAX_VOLUME || volume<=RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}
	}

	@Override
	public void search(String searchValue) {
		// TODO Auto-generated method stub
		System.out.println(searchValue+"를 검색합니다.");
	}

	
	//인터페이스의 접근제한자는 기본 public 이기 때문에 class에서 재정의 할때는 반드시
	//public을 명시해야 한다.(클래스는 기본 접근제한이 default이기 때문에)
	//인터페이스의 default 메소드는 재정의 할 수 있다.
	@Override
	public void setMute(boolean mute) {
		System.out.println("음소거를 tv에 맞게 수정합니다.");
	}
	
}
