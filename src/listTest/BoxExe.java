package listTest;

public class BoxExe {
	public static void main(String[] args) {
		Box<String>box = new Box<String>();
		box.setObj("사과");
		String result = (String) box.getObj();
		System.out.println(result);
		
		Box <Integer>nbox = new Box<Integer>(); 
		nbox.setObj(10); //정수타입인데 String으로 출력해서 컴파일오류는 안나지만 실행시키면 오류남
		Integer nResult = nbox.getObj();
				System.out.println(nResult);
	}
}
