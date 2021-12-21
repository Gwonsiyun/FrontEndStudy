package javastudy.ex1221;

public class Board {

	private String title;
	private String writer;
	private String wdate;
	private String contents;
	private int hit;
	
	public Board(String title, String writer, String wdate, String contents, int hit) {
		this.title = title;
		this.writer = writer;
		this.wdate = wdate;
		this.contents = contents;
		setHit(hit);
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return writer;
	}
	
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getWdate() {
		return wdate;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getContents() {
		return contents;
	}
	
	//hit의 setter은 매개값이 0보다 작은 값이 들어왔을때 0으로 대입할 수 있도록
	public void setHit(int hit) {
		if(hit<0) {
			hit = 0;
		}
		this.hit = hit;
	}
	public int getHit() {
		return hit;
	}
}
