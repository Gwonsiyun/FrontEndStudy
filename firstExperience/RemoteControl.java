package javastudy.ex1223.interface1;

public interface RemoteControl {
	
	//인터페이스에 선언된 필드는 전부 static final 키워드가 생략 된 상수이다.
	
	//인터페이슨느 접근제한자를 생략한경우 default가 아니라 public 접근제한이 적용
	//인터페이스에서는 static 필드여도 static 블럭을 사용 할 수 없다.
	//상수
	/* public static final */int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상 메소드
	//인터페이스는 인터페이스 뒤로 들어오는 객체들의 메소드를 정형화 하는 목적이 있기
	//때문에 기본적으로 메소드의 정의는 추상 메소드가 된다. (abstract 키워드 생략가능)
	/*public abstract */void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//default 메소드(접근제한자 아님)
	//default 메소드는 인터페이스가 아니라 인터페이스 안에 들어오는 모든 객체들이
	//가지는 공통 기능으로 인터페이스를 통해서 접근할 수 없다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	//정적 메소드
	//static키워드가 붙은 메소드는 인터페이스 자체의 기능을 의미하므로
	//인터페이스를 통화여 호출이 가능하다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
}
