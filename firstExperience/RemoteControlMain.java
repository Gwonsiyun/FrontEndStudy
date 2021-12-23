package javastudy.ex1223.interface1;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(RemoteControl.MAX_VOLUME);
		
		//RemoteControl.setMute(true);
		RemoteControl.changeBattery();
		
//		Television tel = new Television();
//		
//		RemoteControl re = tel;
//		
//		re.turnOn();
//		re.turnOff();
//		re.setVolume(10);
//		System.out.println(tel.volume);
//		tel.setMute(false);
		
		
		//라는식으로 수정할 부분을 최소화함
		Audio audio = new Audio();
		
		RemoteControl re = audio;
		
		re.turnOn();
		re.turnOff();
		re.setVolume(10);
		System.out.println(audio.volume);
		audio.setMute(false);
		
		//인터페이스를 사용하지않으면 아래와같이 수정해야할 부분이 많아짐
//		Audio audio = new Audio();
//		audio.on();
//		audio.off();
//		audio.setMute(false);
//		audio.settingVolume(10);
		
		
		//익명 구현 객체란 클래스 없이 존재하는 객체를 의미하므로
		//인터페이스를 통해서만 객체를 사용 할 수 있다. 
		//(클래스가 없으므로 타입이 없어 변수에 담을 수 없다.)
		//해당 인터페이스에 다른 구현객체를 담는 순간 잃어버려 사용할 수 없어진다.
		
		re = new RemoteControl() {

			int field = 10;
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("field = "+field);
				System.out.println("익명 객체 켜짐");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("익명 객체 꺼짐");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("익명 객체 볼륨설정");
			}
			
		};
		//인터페이스는 자신이 가지고 있는 추상 메소드와 디폴트 메소드만 구현객체를 통해
		//사용할 수 있으므로 익명 객체가 가지고 있는 필드는 {}블럭 밖에서는
		//사용할 수 없다.
		//System.out.println(re.field);
		re.turnOn();
		re.turnOff();
		re.setVolume(10);
		re.setMute(false);
		
		re = audio;
		
		
		/*
			구현 클래스는 하나 이상의 인터페이스를 구현 할 수 있으며
			반드시 해당 클래스에서는 각 인터페이스의 모든 추상 메소드를 정의하고 있어야한다.
			이때 각 인터페이스에 구현 객체를 담을 수 있으며 사용할 수 있는 범위는
			각 인터페이스가 가지고 있는 추상 메소드 까지 이다. 
		 */
		Television tel = new Television();
		
		re = tel;
		Searchable s = tel;
		re.turnOn();
		re.turnOn();
		re.turnOff();
		re.setVolume(10);
		re.setMute(false);
		//re.search("test");
		
		
		s.search("우헤헤");
		
		
		Television tel2 = (Television)re;
		System.out.println(tel2.volume);
		System.out.println(tel == tel2);
		
		re = audio;
		if(re instanceof Television) {
			tel2 = (Television)re;
		}else {
			System.out.println("인터페이스에는 television이 없습니다.");
		}
		
		RemoteControl[] reA = new RemoteControl[2];
		reA[0] = tel;
		reA[1] = audio;
	}

}
























