package Interface;

//개발 표준
public interface RemoteControl {
	int MAX_VOLUME = 10; //상수선언 대문자
	
	void turnOn(); // public과 abstract가 생략되어있다
	void turnOff();
	void setVolume(int volume);
}
