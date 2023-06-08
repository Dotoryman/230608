package listTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		//인터페이스(List) = 구현클래스(ArrayList, LinkedList)의 값들을 담는 부모역할
		List<String> list = null;
		list = new ArrayList<String>(); 
		list = new LinkedList<String>();
		
		list.add("Apple"); //list.get(0) -> 1번
		list.add("Lemon"); //list.get(1) -> 2번
		list.add("Lime");  //list.get(2) -> 3번
		
		
		// Date 클래스
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		System.out.println(today);
		String format = sdf.format(today); //Date -> 문자열로 바꿔줄땐 .format
		
		String sdate = "2023-07-22 13:23:33";
		try {
			Date date = sdf.parse(sdate); //문자열 -> Date로 바꿔줄땐 .parse
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
