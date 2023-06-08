package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//실제로 데이터를 저장하고 실행하는 기능을 함
public class MemoListImpl implements MemoList {

	List<Memo> list = new ArrayList<Memo>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void input(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals(memo)) { //Object.equals();
			Memo memo1 = list.get(i);
			if (memo1.getNo() == memo.getNo() 
					&& memo1.getDate() == memo.getDate()
					&& memo1.getContent() == memo.getContent())
				System.out.println("same");
			return;
		}
		list.add(memo);
		System.out.println("추가완료.");
		for(int i = 0 ; i < list.size(); i++) {
			if(Integer.parseInt(list.get(i).getDate() > parseInt(list.get(i))))
		}
	}

	//순번지정

	@Override
	public void update(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == memo.getNo() && list.get(i).getDate().equals(memo.getDate())) {
				list.get(i).setContent(null);
			}
		}
	}

	@Override
	public void delete(int no) {
		System.out.printf("삭제할 메모의 번호를 입력하세요> ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				System.out.println(list.get(i).toString());
			}
		}
	}

	@Override
	public void delete(String date) {
		System.out.printf("조회할 메모의 작성 날짜를 입력하세요> ");

	}

	@Override
	public void search(int no) {
		System.out.printf("조회할 메모의 번호를 입력하세요> ");

	}

	@Override
	public void search(String date) {
		System.out.printf("조회할 메모의 작성 날짜를 입력하세요> ");
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			// 배열위치의 값이 null이 아닌 경우에만 조건검색
			boolean kick = false;
			if (list.get(i) != null) {
				System.out.printf("메모번호 : %d  작성일 : %s  메모내용 : %s \n", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());
				kick = true;
				break;
			}
		}
	}
}
