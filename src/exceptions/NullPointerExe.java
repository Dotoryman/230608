package exceptions;

public class NullPointerExe {
	public static void main(String[] args) {
		
		String msg = "What's up";
		msg = null;
		
		try {
			//block에서 실행예외가 발생하면
			//catch 블럭의 코드를 실행
		System.out.println(msg.length());
		
		int no = Integer.parseInt(msg);
		System.out.println(no);
		
//		} catch(NullPointerException ne) {
//			System.out.println("NullPoint 예외가 발생했습니다. msg의 값을 확인하세요");
//			
//		} catch(NumberFormatException e) {
//			System.out.println("NumberForm 예외가 발생했습니다. msg의 값을 확인하세요");
//			
//		}
		}catch(Exception e) {
			System.out.println("암튼 예외발생 난몰라");
		}
		System.out.println("End of program");
	}
}
