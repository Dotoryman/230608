package shape;

public class Circle extends Shape implements Drawble, Movable{

	@Override
	public void move() {
		System.out.println("원을 이동.");
	}

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
}
