package memo;

//기능을 정의하는부분
public interface MemoList {
	// 등록
	void input(Memo memo);
	
	// 수정
	void update(Memo memo); //번호와 날짜를 기준으로 내용 변경할수있게
	
	// 삭제
	void delete(int no); //번호를 기준으로 삭제하기
	void delete(String date); //날짜를 기준으로 삭제하기
	
	// 조회
	void search(int no); //번호를 기준으로 조회
	void search(String date); //날짜를 기준으로 조회
	
	// 전체 목록 조회
	void print();
}
