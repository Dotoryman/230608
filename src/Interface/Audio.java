package Interface;
//구현클래스
public class Audio implements RemoteControl{
	int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("오디오 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 OFF");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("Audio 볼륨 : " + this.volume );
	}

}
