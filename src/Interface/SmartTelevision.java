package Interface;

// 인터페이스는 다중상속이 가능하다
public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTv 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTv 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		
	}

}
