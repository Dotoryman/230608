package polymorphism;

public class TVUser {
	public static void main(String[] args) {
//		Speaker speaker = new AppleSpeaker(); // new SonySpeaker();
		//매개변수로 바꿔끼기, 아래처럼하는게 나음
//		TV tv = new SamsungTv(speaker); //new LgTv(speaker);
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0], args[1]);
		
		tv.powerON(); //인터페이스에 정의된 메소드
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
