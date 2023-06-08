package anonymous;

//익명 구현 객체 --이름없는 클래스(일회용) 인터페이스 구현객체로 클래스로 선언하지 않고 이름없는 클래스.
public class AnonymousEx {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run(); //run메소드를 다른기능으로 구현
		
		Runnable runnable = new Runnable(){// Runnable은 인터페이스이기에 인스턴스 못만듬
			@Override
			public void run() {
				System.out.println("고양이가 달립니다");				
			}
		};
		runnable.run();
		// 화살표함수 매개값으로 함수사용 람다표현식 간단하게 쓰기위해 줄일수있는부분 최대한줄이기
		runnable = () -> System.out.println("기차가 달립니다");//한줄일땐 {}필요없다
		runnable.run();
	}
}
