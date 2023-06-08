package exceptions;

public class ClassNotFoundExe {
	public static void main(String[] args) {
		
		
		try {
			//Exception 클래스를 상속받아 쓰는경우 꼭 try/catch로 예외처리 해줘야한다
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
