package polymorphism;

public class BeanFactory {
	
	
	public Object getBean(String tv, String speaker) {
		Speaker speakerObj = null;
		if(speaker.equals("sony")) {
			speakerObj = new SonySpeaker();
		} else if(speaker.equals("apple")) {
			speakerObj = new AppleSpeaker();
		}
		
		if(tv.equals("lg")) {
			return new LgTv(speakerObj);
		} else if (tv.equals("samsung")) {
			return new SamsungTv(speakerObj);

		}
		return null;
	}
}
