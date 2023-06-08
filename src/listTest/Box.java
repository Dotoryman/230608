package listTest;

public class Box<T> { //<T>는 타입을 미리 지정하는게 아니라 활용되는 시점에서 타입을 지정해줌 뭐 스트링이나 인티저나
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}
