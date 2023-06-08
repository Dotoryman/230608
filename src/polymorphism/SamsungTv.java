package polymorphism;

public class SamsungTv implements TV{
	
	private Speaker speaker;
	
	SamsungTv(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerON() {
		System.out.println("SamsungTv Power ON!");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv Power OFF!");
	}

	@Override
	public void volumeUp() {
		this.speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		this.speaker.volumeDown();
	}

}
