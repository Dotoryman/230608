package exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		int result = divide(3, 0);
		System.out.println(result);
		try {
			method("java.lang.String");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ee) {
			System.out.println("오류발생 망했슈");
		}
	}
	
	public static void method(String cls) //예외 떠넘기기 
			throws ClassNotFoundException, Exception {
		
		Class.forName(cls);
		
		System.out.println("End of method");
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}
}
