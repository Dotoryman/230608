package polymorphism;

public class LgTv implements TV{

	private Speaker speaker;
	
	LgTv(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerON() {
		System.out.println("LgTv Power ON!");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv Power OFF!");
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
