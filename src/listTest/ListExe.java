package listTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		//인터페이스(List) = 구현클래스(ArrayList, LinkedList)의 값들을 담는 부모역할
		List<String> list = null;
		list = new ArrayList<String>();
		list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Lemon");
		list.add("Lime");
	}
}
