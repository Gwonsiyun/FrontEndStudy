package javastudy.ex1220;

public class FinalExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalEx f1 = new FinalEx();
		FinalEx f2 = new FinalEx();
		System.out.println(f1==f2);
		System.out.println(f1.field1);
		System.out.println(f2.field1);
		/*
			final 키워드의 필드는 해당 값으로 객체마다
			초기화 되면 해당 값은 절대 수정할 수 없다.
		 */
		//f1.field1 = "수정됨";
	}

}
