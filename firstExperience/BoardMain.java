package javastudy.ex1221;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3건의 게시글을 담고 있는 배열 Boards 를 만들기
		Board b1 = new Board("제목입니다_1","작성자1","2021-12-21","내용입니다",-10);
		Board b2 = new Board("제목입니다_2","작성자2","2021-12-21","내용입니다",20);
		Board b3 = new Board("제목입니다_3","작성자3","2021-12-21","내용입니다",3);
		
		Board[] boards = new Board[] {b1,b2,b3};//보드로 만들어줘야하는이유? 그냥 일반적인 배열로 만들면 안되나?
		
		//전체 게시글 출력하기
		
		for(Board board: boards) {//조건문 이해가 잘 안됨
			System.out.println("---------------------");
			System.out.println("제목 : "+board.getTitle());
			System.out.println("작성자 : "+board.getWriter());
			System.out.println("작성일 : "+board.getWdate());
			System.out.println("내용 : "+board.getContents());
			System.out.println("조회수 : "+board.getHit());
		}
	}

}
