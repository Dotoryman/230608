package listTest;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList(); //<> = 제너릭, 유형 명시해주기
		//저장유형이 Object 즉 가져올때 오브젝트이니까
		list.add("Apple");
//		list.add(new Integer(10));
		for(int i = 0 ; i < list.size(); i++) {
			// 결과도 오브젝트
			Object result = list.get(i);
			if(result instanceof String) {
				System.out.println((String) result);
			} else if(result instanceof Integer) {
				System.out.println((Integer) result);
			}
			//이렇게 하면 값을 잘못가져오는경우 실행에서 오류남
		}
	}
}
