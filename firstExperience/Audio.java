package javastudy.ex1223.interface1;

public class Audio implements RemoteControl{

	int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(RemoteControl.MAX_VOLUME>=volume ||RemoteControl.MIN_VOLUME<=volume) {
			this.volume = volume;
		}
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
	}
	
	
	
//	void settingVolume(int volume) {
//		if(RemoteControl.MAX_VOLUME>=volume ||RemoteControl.MIN_VOLUME<=volume) {
//			this.volume = volume;
//		}
//	}
//	void on() {
//		System.out.println("오디오를 켭니다.");
//	}
//	void off() {
//		System.out.println("오디오를 끕니다.");
//	}
//	
//	void setMute(boolean mute) {
//		if(mute) {
//			System.out.println("무음 처리합니다.");
//		}else {
//			System.out.println("무음 해제합니다.");
//		}
//	}

	
}
