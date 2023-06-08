package memo;
// 메모를 저장하기위한 클래스
public class Memo {
	private int no; // 순번
	private String date; // 작성 시간을 문자열로
	private String content; // 내용
	
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
//	public Memo(String date, String content) {
//		this.date = date;
//		this.content = content;
//	}
	
	public Memo(int no, String content) {
		this.no = no;
		this.date = null; //Date() -> 문자열
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	// 동일여부check
	
	@Override
	public String toString() {
		return "Memo [메모번호=" + no + ", 작성날짜=" + date + ", 내용=" + content + "]";
	}
	
	
}
	