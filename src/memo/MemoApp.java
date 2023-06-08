package memo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
//		List<Memo> list = new ArrayList<>();
//		list.add(new Memo(1, "20230503", "첫번째 내용 생성"));
		Scanner scn = new Scanner(System.in);
		MemoList app = new MemoListImpl(); // ArrayList 컬렉션에 넣던지
										   // 파일 저장
										   // DB에 저장
		int selectNo = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.추가 2.수정(번호&날짜) 3.삭제 (번호&날짜) 4.조회(번호&날짜) 5.전체목록출력 6.종료");
			System.out.print("선택> ");
			//1. 추가 2. 수정 3. 삭제(번호기준,날짜기준) 4. 조회(번호기준,날짜기준) 5. 전체목록 출력 6.종료
			try{
				selectNo = Integer.parseInt(scn.nextLine());
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			if (selectNo == 1) {
				System.out.println("번호를 입력하세요");
				int no = Integer.parseInt(scn.nextLine());
				System.out.println("날짜를 입력하세요");
				String date = scn.nextLine();
				System.out.println("내용을 입력하세요");
				String content = scn.nextLine();
				if (date.equals("")) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					date = sdf.format(new Date());
				}
				app.input(new Memo(no, date, content));
				
			} else if (selectNo == 2) {
				System.out.println("번호를 입력하세요");
				int no = Integer.parseInt(scn.nextLine());
				System.out.println("날짜를 입력하세요");
				String date = scn.nextLine();
				System.out.println("내용을 입력하세요");
				String content = scn.nextLine();
				
				app.update(new Memo(no, date, content));
			} else if (selectNo == 3) {
				System.out.println("1.번호로 조회  2. 날짜로 조회");
				int menu = Integer.parseInt(scn.nextLine());
				if(menu == 1) {
					System.out.println("번호를 입력하세요");
					app.delete(Integer.parseInt(scn.nextLine()));
				} else if (menu == 2) {
					System.out.println("날짜를 입력하세요");
				}
				app.delete(scn.nextLine());
			} else if (selectNo == 4) {
				System.out.println("1.번호로 조회  2. 날짜로 조회");
				int menu = Integer.parseInt(scn.nextLine());
				if(menu == 1) {
					System.out.println("번호를 입력하세요");
					app.delete(Integer.parseInt(scn.nextLine()));
				} else if (menu == 2) {
					System.out.println("날짜를 입력하세요");
					app.delete(scn.nextLine());
				}
				app.search(scn.nextLine());

			} else if (selectNo == 5) {
				app.print();
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
		
		System.out.println("end of program");
	}
}
